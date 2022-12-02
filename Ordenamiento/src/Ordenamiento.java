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
                //si el arreglo de j es menor que array j +1
                if (array[j] > array[j+1]){
                    //para que el auxiliar ?
                int aux = array[j];
                array[j] = array [j+1];
                array[j+1] = aux; 
            }   
        }
        } 
    }

    public static void insercion(int[] array){
        int ant;
        //toma del segundo elemento al final
        for(int i=1; i< array.length-1; i++){
            //guardar en una variable
        int aux =array[i];
        //se comprueba el elemento anterior
        int key = i -1;
        // apertura ciclo mientras haya posiciones y el valor de nuestro auxiliar
        // sea menor que los de la izquierda se pasan a la derecha
        while (( key>=0) && (aux<array[key])) {
            array [key +1] = array[key];
            key --;
        }
        array[key+1]=aux;
        }

    }
    public static void quicksort(int[] Array){
        
    }
}
