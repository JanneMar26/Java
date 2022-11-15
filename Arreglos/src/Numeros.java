//Crea un programa en Java considerando las 
//siguientes instrucciones:

/**
 *Crea un arreglo llamado números el cual tenga los siguientes elementos 
12, 10, 4, 24, 5 y 9.
Realiza un ciclo que recorra todo el arreglo y en cada pasada, imprima 
El arreglo en la posición <número de posición>  tiene el número <imprimir 
el número que se encuentre en esa posición>. 
Ejemplo. El arreglo en la posición 2 tiene el número 4.
Toma captura de pantalla del código completo y del programa compilado.
 */

public class Numeros{
    
    private static int contador;

    public static void main(String[] args) {
    
        //Creación, inicialización y acceso a una matriz
        int intArray[];
        intArray = new int[5];
        
        //Matriz literal, ya se conoce el tamaño
        int matrizLiteral[] = new int[]{12,10,4,24,5,9};
        for (int contador = 0; contador < matrizLiteral.length; contador++);{
            System.out.println("El arreglo en la posición: "+ matrizLiteral.length  +" tiene el número: " + matrizLiteral[contador] );
        }
    }
}
