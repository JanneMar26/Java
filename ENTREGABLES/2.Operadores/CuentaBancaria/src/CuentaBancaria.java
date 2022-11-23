public class CuentaBancaria {
    private static final boolean True = false;
    private static final boolean False = false;
    //Janett Venegas Martinez
    public static void main(String[] args) {
                //Janett Venegas Martinez
                double saldo = 1000.75;
                double cantidadARetirar = 250.00;
        
                double saldoActualizado;
                saldoActualizado = saldo-cantidadARetirar;
                double cantidadParaCadaAmigo= saldoActualizado/3;
                boolean puedeComprarTicket = cantidadParaCadaAmigo >= 250? True: False;
                System.out.println(puedeComprarTicket);
                System.out.println("Le di a cada amigo "+cantidadParaCadaAmigo);
            }    
}

