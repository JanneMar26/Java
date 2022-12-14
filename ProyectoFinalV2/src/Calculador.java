import java.util.LinkedList;
import java.util.Queue;

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

    private void multiplicacin(Double n){
        resultado*=n;
    }
    private void divison(Double n){
        resultado/=n;
    }
    private void pasarACola(String pantalla){
        cola = new LinkedList<String>();
        String aux = "";
        char elemento = ' ';
        for (int i = 0;i<pantalla.length();i++){
            elemento = pantalla.charAt(i);
            if (elemento!= '+'){
                aux+=elemento;
            } else if (elemento!='-'){
                aux+=elemento;
            }else{
                cola.add(aux);
                cola.add(Character.toString(elemento));
                aux="";
            }
        }
        cola.add(aux);
    
    }
public Double resultadoDisplay(String pantalla){
    pasarACola(pantalla);
    suma(Double.parseDouble(cola.poll()));
    while(!cola.isEmpty()){
        switch (cola.poll()){
        case "+" :
            suma(Double.parseDouble(cola.poll()));
        break;
        case "-":
            resta(resultado);
        default:
        break;
    }
}
    return resultado;
}
public void reiniciar(){
    this.resultado=0.0;
}
}


