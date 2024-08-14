public class Avion implements IVehiculo {
    private String marca;
    private int numMotores;

    public Avion(String marca, int numMotores) {
        this.marca = marca;
        this.numMotores = numMotores;
    }

    @Override
    public void avanzar() {
        System.out.println("El avión de marca " + marca + " está despegando.");
    }

    public void volar() {
        System.out.println("El avión "+marca+" está volando con " + numMotores + " motores.");
    }
}
