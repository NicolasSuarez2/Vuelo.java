public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    public Vuelo() {
    }

    public Vuelo(String numero, String origen, String destino, int ocupacion, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = ocupacion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public int getOcupacion() {
        return ocupacion;
    }
    
    public void setOcupacion(int ocupacion) {
        if (ocupacion < 0) {
            System.out.println("Error: La ocupacion no puede ser negativa.");
        } else if (ocupacion > capacidadMaxima) {
            System.out.println("Error: La ocupacion no puede superar la capacidad maxima de " + capacidadMaxima + " pasajeros.");
        } else {
            this.ocupacion = ocupacion;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("----- INFORMACION DEL VUELO -----");
        System.out.println("Numero de vuelo: " + numero);
        System.out.println("Ruta: " + origen + " -> " + destino);
        System.out.println("Pasajeros a bordo: " + ocupacion + " / " + capacidadMaxima);
        System.out.println