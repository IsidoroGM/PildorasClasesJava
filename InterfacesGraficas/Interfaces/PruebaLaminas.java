import java.awt.*;
import javax.swing.*;

public class PruebaLaminas {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Varios paneles");
        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.RED);

        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(Color.GREEN);

        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.BLUE);

        ventana.add(panelNorte, BorderLayout.NORTH);
        ventana.add(panelCentro, BorderLayout.CENTER);
        ventana.add(panelSur, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}   