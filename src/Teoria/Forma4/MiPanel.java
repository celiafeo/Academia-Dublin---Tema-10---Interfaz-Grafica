package Teoria.Forma4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JFrame {
    public static void main(String[] args) {
        new MiPanel();
    }

    private JButton b;

    public MiPanel(){
        //Inicializar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 50, 300, 400);
        setVisible(true);

        //Inicializar Atributos
        setLayout(new GridLayout());
        b = new JButton("B1");
        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });





    }






}
