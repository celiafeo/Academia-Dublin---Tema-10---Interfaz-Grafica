package Teoria.Forma3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JPanel {
    //1
    private JButton b;

    //2
    public MiPanel(){
        setLayout(new GridLayout());
        b=new JButton("B1");
        add(b);
        ///claes internas anonimas: una clase  por componente y evento  (TRABAJO)


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "HOLA");
            }
        });

    }



}
