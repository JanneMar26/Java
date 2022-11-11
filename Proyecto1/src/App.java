import condicionales.Condicionales;
import iterativas.Iterativas;

public class App {
    public static void main(String[] args) throws Exception {
        Condicionales condicionales = new Condicionales(" Janett");
        //String salida = condicionales.e1Saludo();
        System.out.println(condicionales.e2Contrasenia( "batman"));
        System.out.println(condicionales.e4());
        System.out.println(condicionales.e5());
        //Iterativas iterativas = new Iterativas("e2Suma");
        

    }
}
