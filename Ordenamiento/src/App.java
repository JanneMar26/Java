import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Tipo lista, para mi lista no ordenada
        int[] listadesOrdenada={5,6,9,4,2,1,7};
        //imprime mi lista desordenada, con el Array 
        System.out.println(Arrays.toString(listadesOrdenada));
        //Creas el metodo burbuja para ordenar mi lista desordenada
        Ordenamiento.burbuja(listadesOrdenada);
        //imprime la lista ordenada
        System.out.println(Arrays.toString(listadesOrdenada));

       //insercion
        int[] listadesOrdenadaa={5,6,9,4,2,1,7};
        System.out.println(Arrays.toString(listadesOrdenadaa));
        Ordenamiento.insercion(listadesOrdenadaa);
        System.out.println(Arrays.toString(listadesOrdenadaa));
    }
}
