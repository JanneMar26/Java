package layouts;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
    int sepH=0,sepV=0;
    public Border(String titulo, Container numeros){
        setTitle(titulo);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        va a ser el layout
         */ 
        setLayout(new BorderLayout());
        /*
        sus elementos
         */ 
        add("North",new TextField(" "));
        add("East",new JButton("  =  "));
        Label lbl= new Label("Centro");
        lbl.setAlignment(Label.CENTER);
        add("Center",numeros);
    }
}
