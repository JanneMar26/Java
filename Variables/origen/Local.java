public class Local {
    public static void main(String[] args) {
        /*Variables locales */

        //Declaramos la variable
        String h;

        //inicializamos la variable
        h = "Variables locales";

        System.out.println(h);
// Método estatico
    public static void saludo(String nombre){ // nombre es variable local
        // variable local
        String saludo = "Hola ";
        // tamaño de las variables locales
        System.out.println("Tamaño de saludo = "+ saludo.length());
        System.out.println("Tamaño de nombre = "+ nombre.length());
        System.out.println(saludo + nombre);
    }
}
