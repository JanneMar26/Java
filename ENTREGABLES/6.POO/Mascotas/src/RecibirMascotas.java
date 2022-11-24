public class RecibirMascotas() {

    //@autor Janett Venegas Martínez
    

    public RecibirMascotas(String nombrePerro, int edad, String raza, String tamaño, String nombreDueño) {
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.raza = raza;
        this.tamaño = tamaño;
        this.nombreDueño = nombreDueño;
    }
    private String nombrePerro;
    private int edad;
    private String raza;
    private String tamaño;
    private String nombreDueño;
    
    public String getNombrePerro() {
        return nombrePerro;
    }
    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getNombreDueño() {
        return nombreDueño;
    }
    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }     

    
}
}