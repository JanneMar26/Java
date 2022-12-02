import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] listaOrdenada={50,20,40,80,30};
        System.out.println(Arrays.toString(listaOrdenada));
        MetodoOrdenamiento1.insercion(listaOrdenada);
        System.out.println(Arrays.toString(listaOrdenada));
    }
}
