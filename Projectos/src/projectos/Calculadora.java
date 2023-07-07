import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"
    };

    public Calculadora() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        buttons = new JButton[buttonLabels.length];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("=")) {
            String expression = textField.getText();
            try {
                double result = evaluarExpresion(expression);
                textField.setText(Double.toString(result));
            } catch (Exception ex) {
                textField.setText("Error");
            }
        } else {
            textField.setText(textField.getText() + actionCommand);
        }
    }

    public double evaluarExpresion(String expression) {
        return new Object() {
            int pos = -1;
            int ch;

            void siguienteCaracter() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean espacioEnBlanco() {
                while (Character.isWhitespace(ch)) siguienteCaracter();
                return false;
            }

            double parse() {
                siguienteCaracter();
                double x = parseExpresion();
                if (pos < expression.length()) throw new RuntimeException("Carácter inesperado: " + (char)ch);
                return x;
            }

            double parseExpresion() {
                double x = parseTérmino();
                while (true) {
                    if      (come('+')) x += parseTérmino(); // suma
                    else if (come('-')) x -= parseTérmino(); // resta
                    else return x;
                }
            }

            double parseTérmino() {
                double x = parseFactor();
                while (true) {
                    if      (come('*')) x *= parseFactor(); // multiplicación
                    else if (come('/')) x /= parseFactor(); // división
                    else return x;
                }
            }

            double parseFactor() {
                if (come('+')) return parseFactor(); // operador unario
                if (come('-')) return -parseFactor(); // operador unario

                double x;
                int startPos = this.pos;
                if (come('(')) { // paréntesis
                    x = parseExpresion();
                    come(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // números
                    while ((ch >= '0' && ch <= '9') || ch == '.') siguienteCaracter();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Carácter inesperado: " + (char)ch);
                }

                if (come('^')) x = Math.pow(x, parseFactor()); // exponente

                return x;
            }

            boolean come(int charToCome) {
                if (ch == charToCome) {
                    siguienteCaracter();
                    return true;
                }
                return false;
            }
        }.parse();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora calculadora = new Calculadora();
            calculadora.setVisible(true);
        });
    }
}
