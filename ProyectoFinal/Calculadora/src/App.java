
import layouts.*;

public class App {

    public static void main(String[] args){
        // Crea un objeto de la clase MiVentana
        Grid grid = new Grid("  ");
        Border g = new Border("Calculadora",grid.dameNumeros());
        g.setVisible(true);
    }
}