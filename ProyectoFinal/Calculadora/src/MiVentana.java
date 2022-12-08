import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;



public class MiVentana extends JFrame implements ActionListener {
    JButton boton;
    public MiVentana(String titulo) {
        super(titulo);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // retorna el contenedor de la ventana
        Container cp = getContentPane();
        /* https://arquimedes.matem.unam.mx/pasados/java_profundizacion/Unidad02.htm
         * Establecemos un diseño:trata de acomodarlos uno tras otro dejando 
         * cierto espacio entre uno y el siguiente.
         */
        cp.setLayout(new FlowLayout());
        // * objeto para definir una etiqueta
        JLabel etiqueta = new JLabel("Nombre: ");
        /*
         * El control JTextField permite al operador del programa ingresar una 
         * cadena de caracteres por teclado.
         */
        JTextField texto = new JTextField(20);
        /*
         * El control JButton tiene como objetivo que el usuario pueda interactuar 
         * con él. 
         */
        boton = new JButton("Saludar");
        boton.addActionListener(this);
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
                if(e.getSource() == boton){
            System.out.println("Hola");
            System.exit(0);
        }
    }

}