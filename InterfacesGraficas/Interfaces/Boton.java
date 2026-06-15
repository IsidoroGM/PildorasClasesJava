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

        // Tus dibujos
        g.drawRect(20, 20, 125, 75);
        g.drawLine(20, 20, 145, 95);
        g.fillRect(20, 200, 125, 75);

        // Botón animado
        int x = 300;
        int y = botonPulsado ? 155 : 150; // Baja 5 píxeles al pulsar

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x, y, 150, 60);

        g.setColor(Color.BLACK);
        g.drawRect(x, y, 150, 60);

        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("PULSAR", x + 35, y + 35);
    }
}