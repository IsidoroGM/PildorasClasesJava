import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Boton {

    public static void main(String[] args) {

        MarcoGraficos miMarco = new MarcoGraficos();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoGraficos extends JFrame {

    public MarcoGraficos() {

        setBounds(300, 300, 800, 450);

        LaminaGraficos miLamina = new LaminaGraficos();
        add(miLamina);

        setVisible(true);
    }
}

class LaminaGraficos extends JPanel {

    private boolean botonPulsado = false;

    public LaminaGraficos() {

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {

                if (e.getX() >= 300 && e.getX() <= 450 &&
                    e.getY() >= 150 && e.getY() <= 210) {

                    botonPulsado = true;
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                botonPulsado = false;
                repaint();

                JOptionPane.showMessageDialog(null, "¡Botón pulsado!");
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // Tus dibujos
        g2.drawRect(20, 20, 125, 75);
        g2.drawLine(20, 20, 145, 95);
        g2.fillRect(20, 200, 125, 75);

        // Posición del botón
        int x = 300;
        int y = botonPulsado ? 155 : 150;

        // Gradiente rojo -> azul
        GradientPaint degradado = new GradientPaint(x, y, Color.RED, x + 150, y + 60, Color.BLUE);

        g2.setPaint(degradado);
        g2.fillRoundRect(x, y, 150, 60, 20, 20);

        // Borde
        g2.setColor(Color.BLACK);
        g2.drawRoundRect(x, y, 150, 60, 20, 20);

        // Texto
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Arial", Font.BOLD, 18));

        FontMetrics fm = g2.getFontMetrics();
        String texto = "PULSAR";

        int textoX = x + (150 - fm.stringWidth(texto)) / 2;
        int textoY = y + ((60 - fm.getHeight()) / 2) + fm.getAscent();

        g2.drawString(texto, textoX, textoY);
    }
}