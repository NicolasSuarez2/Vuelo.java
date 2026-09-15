public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

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
            System.out.println("Error: La ocupación no puede ser negativa.");
        } else if (ocupacion > capacidadMaxima) {
            System.out.println("Error: La ocupación no puede superar la capacidad máxima de " + capacidadMaxima + " pasajeros.");
        } else {
            this.ocupacion = ocupacion;
        }
    }
    public void mostrarInfo() {
        System.out.println("----- INFORMACIÓN DEL VUELO -----");
        System.out.println("Número de vuelo: " + numero);
        System.out.println("Ruta: " + origen + " -> " + destino);
        System.out.println("Pasajeros a bordo: " + ocupacion + " / " + capacidadMaxima);
        System.out.println("---------------------------------");
    }
    public void embarcar(int pasajeros) {
        if (ocupacion + pasajeros <= capacidadMaxima) {
            ocupacion = ocupacion + pasajeros;
            System.out.println("Se embarcaron " + pasajeros + " pasajeros correctamente en el vuelo " + numero + ".");
        } else {
            System.out.println("No se puede embarcar a " + pasajeros + " pasajeros en el vuelo " + numero + ". Excede el espacio disponible.");
        }
    }
    public void desembarcar(int pasajeros) {
        if (ocupacion - pasajeros >= 0) {
            ocupacion = ocupacion - pasajeros;
            System.out.println("Se desembarcaron " + pasajeros + " pasajeros correctamente del vuelo " + numero + ".");
        } else {
            System.out.println("Error: No se pueden desembarcar " + pasajeros + " pasajeros del vuelo " + numero + " porque hay solo " + ocupacion + " a bordo.");
        }
    }
}
