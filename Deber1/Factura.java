package Deber1;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un usuario (simulamos que ingresa sus datos)
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese su cédula:");
        String cedula = scanner.nextLine();

        Compra compra = new Compra(nombre, edad, cedula);

        // Registro de juegos
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Registro de Juegos ---");
            System.out.println("Ingrese el nombre del juego:");
            String nombreJuego = scanner.nextLine();
            System.out.println("Ingrese el género del juego:");
            String generoJuego = scanner.nextLine();
            System.out.println("Ingrese el precio del juego:");
            double precioJuego = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            // Crear el juego y agregarlo a la compra
            Juego juego = new Juego(nombreJuego, precioJuego, generoJuego);
            compra.agregarJuego(juego);

            // Preguntar si desea agregar otro juego
            System.out.println("¿Desea agregar otro juego? (S/N):");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        // Mostrar la factura final
        compra.mostrarDetalleCompra();

        scanner.close();
    }
    
}
