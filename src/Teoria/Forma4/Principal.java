package Teoria.Forma4;

import javax.swing.*;
public class Principal {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setBounds(50, 50, 300, 400);
        marco.add(new MiPanel());
        marco.setVisible(true);
    }
}
