package condicionales;

import java.util.Scanner;

public class Condicionales {
    // variable de instancia  estatica
    private static Scanner sc = new Scanner( System.in); 
    // !constructor es el método se ejecutara al crear un objeto.
    public Condicionales(String nombre) {
    System.out.println("Hola "+ nombre + "  desde el contructor de Condicionales ");
    // inicializar variables
    }

    /**
    * Ejercicio 1
        Escribir un programa que pregunte al usuario su edad y muestre por 
        pantalla es mayor de edad o no.
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
     * @return String: si es valida o no la contraseña
     */

    public String e2Contrasenia(String passBD){
        System.out.println( "Ingresa la contraseña: ");
        String pass = sc.nextLine();
        return pass.equals(passBD)
    }

}


    /**
     * Escribir un programa que pida al usuario dos números y 
     * muestre por pantalla su división. Si el divisor 
     * es cero el programa debe mostrar un error.
     */
        
    