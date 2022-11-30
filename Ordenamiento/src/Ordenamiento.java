public class Ordenamiento {
    /**
     * @param array
     */
    // declaras el método statico, agregas void para no retornar
    public static void burbuja(int[] array){
        //indicar el tipo de variable para cda variable, auxiliar 
        for (int i=0; i< array.length-1; i++){
            //segundo ciclo for del tamaño j, más contador, va fijando las burbujas 
            for (int j = 0; j<array.length-i-1; j++){
                //
                if (array[j] > array[j+1]){
                int aux = array[j];
                array[j] = array [j+1];
                array[j+1] = aux; 
            }   
        }
        } 
    }

    public static void insercion(int[] Array){

    }
    public static void quicksort(int[] Array){

    }
}
