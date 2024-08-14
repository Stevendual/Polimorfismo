public class Carro implements IVehiculo {
    private String marca;
    private int puertas;

    //constructor
    public Carro(String marca, int puertas) {
        this.marca = marca;
        this.puertas = puertas;
    }

    @Override
    public void avanzar() {
        System.out.println("El carro de marca "+marca+" esta avanzando");
    }

    public void abrirPuertas() {
        System.out.println("Abriendo " + puertas + " puertas del carro."+marca);
    }
}
