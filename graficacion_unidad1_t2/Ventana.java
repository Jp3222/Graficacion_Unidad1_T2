package graficacion_unidad1_t2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements ActionListener {

    private JPanel Panel;
    private JButton jbtCirculo;
    private AreaDeDibujo ADD;

    public Ventana() {
        Ventana();
        iniciarComponentes();
        Panel();
    }

    private void Ventana() {
        setTitle("Graficacion");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        //
        ADD = new AreaDeDibujo();
        jbtCirculo = new JButton("Circulo");
        jbtCirculo.setBounds(210, 510, 150, 30);

    }

    public void Panel() {
        Panel = new JPanel(null);
        Panel.setBackground(Color.gray);
        Panel.add(jbtCirculo);
        Panel.add(ADD);
        jbtCirculo.addActionListener(this);

        setContentPane(Panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AreaDeDibujo.drawCirculo(ADD.getGraphics());
        AreaDeDibujo.x += 100;
    }

}
