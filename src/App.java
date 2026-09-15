public class App {
    public static void main(String[] args) {

        Vuelo vuelo1 = new Vuelo();
        vuelo1.setNumero("AV2002");
        vuelo1.setOrigen("Bogotá");
        vuelo1.setDestino("Cali");
        vuelo1.setCapacidadMaxima(150);
        vuelo1.setOcupacion(100);

        Vuelo vuelo2 = new Vuelo();
        vuelo2.setNumero("AV02");
        vuelo2.setOrigen("Cali");
        vuelo2.setDestino("Cucuta");
        vuelo2.setCapacidadMaxima(180);
        vuelo2.setOcupacion(175);

        vuelo1.mostrarInfo();
        vuelo2.mostrarInfo();

        System.out.println("\n Pruebas de Embarque");
        vuelo1.embarcar(30);
        vuelo2.embarcar(10);

        System.out.println("\nPruebas de Desembarque");
        vuelo1.desembarcar(50);
        vuelo1.desembarcar(100);

        System.out.println("\nPrueba de Validación en Setter");
        vuelo2.setOcupacion(10);
        vuelo2.setOcupacion(80);
    }
}