import java.util.Scanner;
/*
 * @Janett Venegas MArtínez
 */
public class Datos {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String nombre ;
        int edad ;
        System.out.println("Ingresa tu nombre completo");
        nombre = sc.nextLine();
        System.out.println("Hola "+ nombre);

        System.out.println("Ingresa tu edad");
        edad = sc.nextInt();
    if (edad >= 18) {
        System.out.println("Tu nombre es "+ nombre + ", tienes " +edad+ " años y eres mayor de edad.");
    } else {
    System.out.println("Tu nombre es "+ nombre + ", tienes '" +edad+ " años y eres menor de edad.");
    }        
    System.out.println("Tu nombre tiene "+ nombre.length() + " caracteres.");
}

}
