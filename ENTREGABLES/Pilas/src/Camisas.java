import java.util.Stack;
public class Camisas {
    
    public static void metodoPeek() {
        Stack<Integer> pila = new Stack<Integer>();
        for(int i = 0;i<4;i++){
            pila.push(i);
        }

        System.out.println("Pila: "+pila);
        System.out.println("El ultimo elemento es : "+ pila.peek());
        System.out.println("Pila Final: "+ pila);
        
    }
    public static void metodoPush() {
        Stack pila = new Stack();
        Stack<String> sPila = new Stack<String>();

        pila.push(3);
        pila.push("Camisas");
        

        sPila.push("Camisa emergencia");
        sPila.push("Camisa decente");
        sPila.push("Camisa favorita");

        System.out.println(pila);
        System.out.println(sPila);
}
    public static void metodoEmpty(){
        Stack<String> camisas= new Stack<String>();
        // agregar elementos a la pila
            camisas.push("Camisa emergencia");
            camisas.push("Camisa decente");
            camisas.push("Camisa favorita");

        System.out.println("Pila: " + camisas);
    // Revisa si la pila está vacía
        boolean resultado = camisas.empty();
        System.out.println("¿La pila está vacía? " + resultado);
    }
}
