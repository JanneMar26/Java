package layouts;
import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame{
    String[] botones = {"7","8","9","/","4","5","6","*","1","2","3","-",".","0","C","+"};
    public Grid(String titulo){
        super(titulo);
        int filas,columnas,sepH,sepV;
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Sera el grid 
        filas = 4;columnas=4;sepH = 2;sepV = 2;
        setLayout(new GridLayout(filas,columnas,sepH,sepV));
        // Serán 9 botones, con el número de elementos filas*columnas
        for(int i = 0;i<botones.length;i++){
            add(new JButton(botones[i]));
        }
    }
    public Container dameNumeros(){
        return getContentPane();
    }
}
