public class Main {
    public static void main(String[] args) {

        //Polimorfismo
        //El polimorfismo es un principio de la programación orientada a objetos que permite que un objeto pueda ser tratado como una instancia de su
        // clase base, una interfaz, o una de sus subclases, permitiendo que el mismo método se comporte de diferentes maneras según el tipo del objeto
        // que lo invoca.
        //El polimorfismo se logra al invocar el método moverse, que se comporta de manera diferente dependiendo de si el objeto es un Carro o un Avion.

        IVehiculo vehiculo1 = new Carro("Toyota", 4);
        IVehiculo vehiculo2 = new Avion("Boeing", 2);

        vehiculo1.avanzar(); // Llama al método moverse de Carro
        if (vehiculo1 instanceof Carro) { //instanceoff sirve para saber si un objeto es una instancia de una clase devuelve true o false
            ((Carro) vehiculo1).abrirPuertas(); // Llama al método abrirPuertas específico de Carro
        }

        vehiculo2.avanzar(); // Llama al método moverse de Avion
        if (vehiculo2 instanceof Avion) {
            ((Avion) vehiculo2).volar(); // Llama al método volar específico de Avion

    }
}
}
