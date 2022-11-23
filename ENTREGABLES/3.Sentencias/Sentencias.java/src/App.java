public class Pedido {
    public static void main(String[] args)  {
        double costoArticulo = 30.99;
        boolean listoEnviar = false;
        if (costoArticulo > 24)
        System.out.println(costoArticulo);
        if (listoEnviar = true)
        System.out.println("enviado");
        else 
        System.out.println("pedido no listo");

        System.out.println(costoArticulo > 24? "Precio alto": "Precio bajo");
    }
}
