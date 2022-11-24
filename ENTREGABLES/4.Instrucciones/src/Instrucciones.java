import java.util.Scanner;

public class Instrucciones {
    Scanner nombre= new Scanner(System.in);
    String n= nombre.nextLine();
    int e = nombre.nextInt();
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int dia = day.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error. Numero no valido");
                break;
        }  
    }
}