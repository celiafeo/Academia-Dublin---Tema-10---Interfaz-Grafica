package Teoria.Forma2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JPanel implements ActionListener { // en vez de usar una clase privada la propia clase hace de listener
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //1
    private JButton b;

    //2
    public MiPanel(){
        setLayout(new GridLayout());
        b=new JButton("B1");
        add(b);


        b.addActionListener(this);
    }


    //3
    public void actionPerfomed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "HOLA");
    }






}
