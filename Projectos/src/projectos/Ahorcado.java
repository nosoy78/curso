import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ahorcado extends JFrame implements ActionListener {
    private String palabraSecreta = "JAVA";
    private String palabraActual = "";
    private int intentos = 0;
    private final int MAX_INTENTOS = 6;
    private JLabel labelPalabra;
    private JLabel labelIntentos;
    private JTextField textField;
    private JButton buttonIntentar;

    public Ahorcado() {
        setTitle("Juego del Ahorcado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(4, 1));

        labelPalabra = new JLabel("Palabra: " + palabraActual);
        add(labelPalabra);

        labelIntentos = new JLabel("Intentos: " + intentos);
        add(labelIntentos);

        textField = new JTextField();
        add(textField);

        buttonIntentar = new JButton("Intentar");
        buttonIntentar.addActionListener(this);
        add(buttonIntentar);
    }

    public void actionPerformed(ActionEvent e) {
        String letra = textField.getText().toUpperCase();

        if (letra.length() == 1) {
            if (palabraSecreta.contains(letra)) {
                StringBuilder sb = new StringBuilder(palabraActual);
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra.charAt(0)) {
                        sb.setCharAt(i, letra.charAt(0));
                    }
                }
                palabraActual = sb.toString();
                labelPalabra.setText("Palabra: " + palabraActual);
            } else {
                intentos++;
                labelIntentos.setText("Intentos: " + intentos);
            }

            if (palabraActual.equals(palabraSecreta)) {
                JOptionPane.showMessageDialog(this, "¡Felicidades! Has adivinado la palabra.", "Victoria", JOptionPane.INFORMATION_MESSAGE);
                reiniciarJuego();
            } else if (intentos >= MAX_INTENTOS) {
                JOptionPane.showMessageDialog(this, "¡Has perdido! La palabra correcta era: " + palabraSecreta, "Derrota", JOptionPane.ERROR_MESSAGE);
                reiniciarJuego();
            }

            textField.setText("");
        }
    }

    private void reiniciarJuego() {
        palabraActual = "";
        intentos = 0;
        labelPalabra.setText("Palabra: " + palabraActual);
        labelIntentos.setText("Intentos: " + intentos);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ahorcado ahorcado = new Ahorcado();
            ahorcado.setVisible(true);
        });
    }
}

