import java.until.Scanner;

public class Scanner {
    Scanner nombre= new Scanner(system.in);
    String n= nombre.nextLine();
    int e = nombre.nextInt();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int dia = sc.nextInt();
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
            default:
                System.out.println("Domingo");
                break;
        }  
    }
}