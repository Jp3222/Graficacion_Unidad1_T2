package graficacion_unidad1_t2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AreaDeDibujo extends JPanel {

    public static int x, y;


    public static void drawCirculo(Graphics g) {
        g.setColor(Color.cyan);
        g.fillOval(x, y, 100, 100);
    }
    public AreaDeDibujo() {
        AreaDeDibujo.x = 0;
        AreaDeDibujo.y = 50;
        setBackground(Color.white);
        setSize(600, 500);
        setLocation(WIDTH, WIDTH);
    }

}
