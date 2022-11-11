package condicionales;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Condicionales {
    // variable de instancia  estatica
    private static Scanner sc = new Scanner( System.in); 
    // !constructor es el método se ejecutara al crear un objeto.
    public Condicionales(String nombre) {
        //método que se ejecuta cuando creo un objeto con new Object();
    System.out.println("Hola "+ nombre + "  desde el contructor de Condicionales ");
    // inicializar variables
    }

    /**
    * Ejercicio 1
        Escribir un programa que pregunte al usuario su edad y muestre por 
        pantalla es mayor de edad o no.
        @return String: indicando si es o no mayor de edad
     * 
     */
    // privacidad, tipo de retorno, nombre de la funcion o método
    public String e1Saludo(){
        //entrada,
        System.out.println( "Ingresa tu edad: ");
        int edad = sc.nextInt(); 
        sc.close();
        // verificar si es mayor de edad
        if(edad>=18){ //edad>17
            return "Eres mayor de edad"; // sentencia de dalto (jump)
        } else {
            return "Eres menor de edad"; // sentencia de salto (jump)

        }
    
    }
    /**
    Ejercicio 2
    Escribir un programa que almacene una contraseña en una 
    variable, pregunte al usuario por la contraseña e imprima 
    por pantalla si la contraseña introducida por el usuario 
    coincide con la guardada en la variable sin tener en cuenta
    mayúsculas y minúsculas.
     *
     *  @return String: si es valida o no la contraseña
     */

    public String e2Contrasenia(String passBD){
        System.out.println( "Ingresa la contraseña: ");
        String pass = sc.nextLine();
        return pass.equals(passBD) ? "La contraseña es correcta: " : "La contraseña es incorrecta";

    }
    /**Ejercicio 3
        Escribir un programa que pida al usuario dos 
        números y muestre por pantalla su división. 
        Si el divisor es cero el programa debe mostrar un error.
     * @return La división y si el divisor es CERO, ERROR
     */
    public String e3(){
        System.out.print("Ingresa al dividendo");
        double dividendo =  sc.nextDouble();
        System.out.print("Ingrsa al divisor");
        double divisor = sc.nextDouble();

        if(divisor != 0) {
            return "La division de "+dividendo+"/"+divisor+" = "+(dividendo/divisor);
        }else{
            return "Error el divisor es CERO";
        }

    }
    /**
     * Ejercicio 4
        Escribir un programa que pida al usuario un número entero 
        y muestre por pantalla si es par o impar.
     * @return El numero entero es par o impar
     */
    public String e4(){
        System.out.println("Ingresa un número entero: ");
        int x =sc.nextInt();
        if(x % 2 == 0) {
            return "El número " + x + " es par" ;
        } else{
            return "El número " + x + " es impar";
        }
    }
    /**
     * Ejercicio 5
        Para pagar un determinado impuesto se debe ser mayor de 16 años
        y tener unos ingresos iguales o superiores a $5000 mensuales.
        Escribir un programa que pregunte al usuario su edad y sus
        ingresos mensuales y muestre por pantalla si el usuario tiene 
        que pagar o no.
     * 
     * @return Debes pagar impuestos o no 
     */
    public String e5(){
        System.out.println("Ingresa tu edad ");
        double edad = sc.nextDouble();
        System.out.println("¿Cuáles son tus ingresos mensuales?" );
        double ingresos = sc.nextDouble();

        if (edad > 16 && ingresos > 5000){
            return "Debes pagar impuestos";
        } else{
            return " No debes pagar impuestos";
        }
    }
    public String e6(){
        System.out.println("¿Cuál es tu nombre?");
        String nombre = sc.next();
        System.out.println("¿Cuál es tu género (H o M ?");
        char género = sc.nextAt(0);

        if (género == "M" && nombre.charAt(0) < "M") ||
        (géner){
            return "Perteneces al grupo A"
        } else{
            return "Pertneces al grupo B"
        }
    }

}


    
    