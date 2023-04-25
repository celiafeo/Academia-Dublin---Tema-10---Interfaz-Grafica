package Ejemplos.pEntradaDatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JFrame {
    //MAIN
    public static void main(String[] args) {
        new MiPanel();
    }
    //ATRIBUTOS

    private JTextField t1, t2;
    private JButton b;




    //INICIALIZACIÓN
    public MiPanel(){
        //VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,500,400);
        setLayout(null);

        //DATOS DE COMPONENTES
        t1=new JTextField();
        t2=new JTextField();
        b=new JButton("SUMAR");

        t1.setBounds(20,20,100,30);
        t2.setBounds(120,20,100,30);
        b.setBounds(20,50,100,30);

        add(t1);
        add(t2);
        add(b);








        //EVENTOS

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });









        setVisible(true);

    }//FIN CONSTRUCTOR
















}//FIN CLASE
