package Deber1;
import java.util.ArrayList;

//Se usará arraylist y no vector porque el vector necesitamos definir un límite y el list no. Ya que deseamos que el usuario compre todo lo que quiera
//más comveniente es que se le otorgue eso


class Compra extends Usuario {
    
    private ArrayList<Juego> juegosComprados; // Lista para almacenar los juegos

    public Compra(String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        this.juegosComprados = new ArrayList<>();
    }

    // Método para agregar un juego a la lista
    public void agregarJuego(Juego juego) {
        juegosComprados.add(juego); // Agrega el juego a la lista
    }

    // Método para calcular el total a pagar
    public double calcularTotal() {
        double total = 0;
        for (Juego juego : juegosComprados) { // Recorre la lista
            total += juego.getPrecioJuego(); // Suma el precio de cada juego
        }
        return total;
    }

    // Método para mostrar el detalle de la compra
    public void mostrarDetalleCompra() {
        System.out.println("\n--- Detalle de la Compra ---");
        mostrarInformación(); // Muestra los datos del usuario
        System.out.println("Juegos comprados:");
        for (Juego juego : juegosComprados) {
            juego.valorJuegos(); // Muestra información de cada juego
        }
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}
