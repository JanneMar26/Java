
import java.util.LinkedList;
import java.util.Queue;
/**
 * Proyecto que simula una calculadora con sus funcionalidades básicas en Java Swing. 
 * @author <a href="https://github.com/JanneMar26/ProgramadorJr">Janett</a>
 * @version 1.0 14/12/22
 */
public class Calculador {
    private Double resultado;
    private Queue<String> cola = new LinkedList<String>(); 

    public Calculador(){
        resultado = 0.0;
    }
    private void suma(Double n){
        resultado+=n;
    }
    private void resta(Double n){
        resultado-=n;
    }
    private void multiplicacion(Double n){
        resultado*=n;
    }
    private void division(Double n){
        resultado/=n;
    }

    /**
     * 
     * @param pantalla 
     * Recorre mis elementos que no son operadores aritmeticos. Se utiliza una estructura de datos 
     * de tipo Queue 
     * 
     */

    private void pasarACola(String pantalla){
        cola = new LinkedList<String>();
        String aux = "";
        char elemento = ' ';
        for (int i = 0;i<pantalla.length();i++){
            elemento = pantalla.charAt(i);
            if (elemento!= '+' && elemento!= '-' && elemento!= '*' && elemento!= '/' ){
                aux+=elemento;
            } //else if (elemento!='-'){
                //aux+=elemento;
            //}
            else{
                cola.add(aux);
                cola.add(Character.toString(elemento));
                aux="";
            }
        }
        cola.add(aux);
    
    }

/**
 * 
 * @param pantalla
 * Realiza las operaciones elegidas y las pasa a Double. Se utiliza una estructura de datos 
 * de tipo Queue 
 * @return
 * Me retorna mi resultado
 */ 
public Double resultadoDisplay(String pantalla){
    pasarACola(pantalla);
    suma(Double.parseDouble(cola.poll()));
    while(!cola.isEmpty()){
        switch (cola.poll()){
            case "+" :
                suma(Double.parseDouble(cola.poll()));
                break;
            case "-":
                resta(Double.parseDouble(cola.poll()));
                break;
            case "*":
                multiplicacion(Double.parseDouble(cola.poll()));
                break;
            case "/":
                division(Double.parseDouble(cola.poll()));
                break;
            default:
                break;
        }
}
    return resultado;
}
/**
 * Este método permite reiniciar mi pantalla cada vez que realice una nueva operación 
 */
public void reiniciar(){
    this.resultado=0.0;
    this.cola.clear();
}
}


