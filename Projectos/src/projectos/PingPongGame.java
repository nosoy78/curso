import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PingPongGame extends JFrame implements ActionListener {
    private Timer timer;
    private int delay = 5;
    private int ballX = 0, ballY = 0;
    private int paddle1Y = 200, paddle2Y = 200;
    private int paddle1DY = 0, paddle2DY = 0;
    private int score1 = 0, score2 = 0;

    public PingPongGame() {
        setTitle("Ping Pong Game");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        timer = new Timer(delay, this);
        timer.start();

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP)
                    paddle2DY = -2;
                if (e.getKeyCode() == KeyEvent.VK_DOWN)
                    paddle2DY = 2;
                if (e.getKeyCode() == KeyEvent.VK_W)
                    paddle1DY = -2;
                if (e.getKeyCode() == KeyEvent.VK_S)
                    paddle1DY = 2;
            }

            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN)
                    paddle2DY = 0;
                if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S)
                    paddle1DY = 0;
            }
        });

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        ballX += 1;
        ballY += 1;

        if (ballX >= 750) {
            if (ballY >= paddle2Y && ballY <= paddle2Y + 80) {
                ballX -= 2;
            } else {
                score1++;
                resetBall();
            }
        }

        if (ballX <= 15) {
            if (ballY >= paddle1Y && ballY <= paddle1Y + 80) {
                ballX += 2;
            } else {
                score2++;
                resetBall();
            }
        }

        if (ballY >= 340 || ballY <= 0)
            ballY -= 2;

        paddle1Y += paddle1DY;
        paddle2Y += paddle2DY;

        if (paddle1Y < 0)
            paddle1Y = 0;
        if (paddle1Y > 300)
            paddle1Y = 300;
        if (paddle2Y < 0)
            paddle2Y = 0;
        if (paddle2Y > 300)
            paddle2Y = 300;

        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 800, 400);
        g.setColor(Color.WHITE);
        g.fillRect(10, paddle1Y, 10, 80);
        g.fillRect(780, paddle2Y, 10, 80);
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, 15, 15);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 25));
        g.drawString("Score 1: " + score1, 10, 30);
        g.drawString("Score 2: " + score2, 680, 30);
    }

    public void resetBall() {
        ballX = 0;
        ballY = 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PingPongGame game = new PingPongGame();
            game.setVisible(true);
        });
    }
}

