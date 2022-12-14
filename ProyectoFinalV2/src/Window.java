import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    JButton teclado;
    JButton[] botones = new JButton[16];
    JTextField display;
    JButton resultado;
    String pantalla;
    Calculador calculadora;
    /**
     * Es  mi ventana
     */
    public Window(){
        super("Calculadora");
        calculadora = new Calculador();
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        teclado =new JButton("Teclado");
        display = new JTextField(100);
        resultado = new JButton("=");
        resultado.setBackground(Color.GRAY);
        teclado.setBackground(Color.green);
        
        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx=0;
        grid.gridy=0;
        grid.gridwidth= 5;
        grid.gridheight= 1;
        grid.weighty= 0.15;
        grid.weightx= 0.15;
        grid.fill = GridBagConstraints.BOTH;
        add(display,grid);
        grid.gridx=4;
        grid.gridy=1;
        grid.gridwidth= 1;
        grid.gridheight= 4;
        add(resultado,grid);
        grid.gridx=0;
        grid.gridy =2;
        grid.gridwidth= 4;
        grid.gridheight= 4;
        grid.weighty= 0.7;
        grid.weightx= 0.7;
        add(crearBotones(),grid);
        
        resultado.addActionListener(this);
        pantalla = "";
    }
    /**
     * 
     * @return Me retorna un contenedor con mis elementos y operadores.
     */
    private Container crearBotones(){
        Container t = new Container();
        t.setLayout(new GridLayout(4,4));
        String[] BOTONES_N = {"7","8","9","/","4","5","6","*","1","2","3","-","CE","0",".","+"};
        for(int i = 0;i<botones.length;i++){
            JButton aux =new JButton(BOTONES_N[i]);
            aux.addActionListener(this);
            botones [i] = aux;
            t.add(botones[i]);
        }
        return t;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()== resultado){
            pantalla = Double.toString(calculadora.resultadoDisplay(pantalla));
            display.setText(pantalla);
            calculadora.reiniciar();
        }
        for (int i = 0;i<botones.length;i++){
            if (e.getSource() == botones[i]){
                System.out.println(botones[i].getText());
                pantalla +=botones[i].getText();
                display.setText(pantalla);
            }
        }
        if(e.getSource() == botones[12]){
            pantalla = "";
            display.setText(pantalla);
            calculadora.reiniciar();
        }
}
}
