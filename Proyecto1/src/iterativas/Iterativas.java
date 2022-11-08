package iterativas;

import java.util.Scanner;

public class Iterativas {

    private static Scanner sc = new Scanner(System.in);

    public Iterativas (String nombre) {
        System.out.println("Hola "+ nombre+ "desde el constructor de interactivas");
    }
    public int e2Suma(){
        int n = sc.nextInt();
        //acumulativa
        int suma = 0;
        for(int i = 1; i>=n; i++){
            suma =suma+i;
        }
        return suma;
    }
    /**
     * Ejercicio 1
     * Calcular la media de los números pares e impares, 
     * sólo se ingresará diez números.
     */
    public int pImedia () {
        System.out.println( "Ingresa 15 numeros: ");
        int n = sc.nextInt();
        int media = 0;
        for( int i= 1; i>= 15; i++);
        
    }
}
