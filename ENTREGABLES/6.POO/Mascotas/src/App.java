import java.util.ArrayList; 
/*
 * @autor Janett Venegas Martínez
 */
public class App {

    public static void main(String[] args) throws Exception {
        ArrayList <RecibirMascotas> listaMascotas = new ArrayList<RecibirMascotas>();
        listaMascotas.add(new RecibirMascotas("Slinky", 5, "akita japonés", "grande", "Nancy"));
        listaMascotas.add(new RecibirMascotas("Toto", 10, "Corgi gáles", "pequeño", "Dan"));
        listaMascotas.add(new RecibirMascotas("Marley", 2, "Basset grifón", "grande", "Luna"));
        listaMascotas.add(new RecibirMascotas("Milo", 6, "Beagle", "pequeño", "Yo"));
        listaMascotas.add(new RecibirMascotas("Blue", 1, "Basset hound", "pequeño", "Joe"));

        
        
        System.out.println("Perros actuales en la estética: " + listaMascotas.size()+".");
    }
}
