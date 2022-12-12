package layouts;
import javax.swing.*;

public class LayoutNull extends JFrame {
    int left,top,width,height;
    public LayoutNull(String titulo){
        super(titulo);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // se puede colocar el componente de forma manual
        setLayout(null);
        // componente
        JButton btn = new JButton("botón");
        JButton btn1 = new JButton("botón1");

        // inicializamos los valores
        left=50;top=0;width=50;height=20;
        btn.setBounds(left,top,width,height);
        btn1.setBounds(left+110,top,width,height);
        add(btn);
        add(btn1);
;
    }    
}
