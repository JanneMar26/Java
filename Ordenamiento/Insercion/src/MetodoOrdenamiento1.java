




    


public class MetodoOrdenamiento1 {
/*
 *1.Se tiene el siguiente arreglo con 5 elementos, desarrolla el procedimiento
*completo para ordenarlo por el método de ordenamiento de inserción:
 * 
 */



    public static void insercion(int[] array){
        int aux,key,ant;
        for (int i = 1;i<array.length;i++){
            key = i;
            ant = i-1;
            while(ant>=0 && array[key]<array[ant]){
                aux = array[key];
                array[key] = array[ant];
                array[ant] = aux;
                key = ant;
                ant--;
            }
        }
    }
    
/*
 * 2.Completa el siguiente código de tal forma que el resultado obtenido sea 
* el que se muestra en la imagen:
 */
    public void imprimeArreglo(String mensaje, int[] arreglo) {
        System.out.println("Arreglo inicial: ");
        int [] arreglo = {11, 23, 9, 20};

        /** 
         *TODO: Implementar Código
         */
    }

    public void saltoLinea() {
        System.out.println("\n");
    }

    public static void main(String args[]) {
        /** 
         *TODO: Implementar Código
         */
        MetodoOrdenamiento objOrdena = new MetodoOrdenamiento();
        objOrdena.imprimeArreglo("Arreglo inicial: ", arreglo);
        objOrdena.saltoLinea();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < arreglo.length - 1; j++) {
                objOrdena.imprimeArreglo(" Arreglo comparando: ", arreglo);
                System.out.println(" <----- j = " + j + " -- " + arreglo[j] + " > " + arreglo[j + 1] + "?");
                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println(" ------- Intercambia " + arreglo[j] + " con " + arreglo[j + 1]);
                    /** 
                    * TODO:Implementar Código
                    */
                    objOrdena.imprimeArreglo(" Arreglo modificado: ", arreglo);
                    objOrdena.saltoLinea();
                }
            }
        }
        objOrdena.saltoLinea();
        objOrdena.imprimeArreglo("Arreglo final: ", arreglo);
    }
}
