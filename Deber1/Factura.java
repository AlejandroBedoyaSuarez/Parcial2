package Deber1;

import java.util.Date;
import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {

        Date fechaDeber = new Date();
        System.out.println(fechaDeber);

        System.out.println("Trabajo realizado por Alejandro Bedoya");

        Scanner scaneaoGoti = new Scanner(System.in);

        // Ingreso del nombre del cliente
        System.out.println("Ingrese nombre completo del Cliente:");
        String nombre = scaneaoGoti.nextLine();

        // En este proceso no restringimos la edad asi que puede comprar a nombre de un
        // recién nacido pero debe existir esa persona, por eso no se pueden negativos
        int edad = -1;
        while (edad < 0) {
            System.out.println("Ingrese edad del Cliente:");
            if (scaneaoGoti.hasNextInt()) {
                edad = scaneaoGoti.nextInt();
                if (edad < 0) {
                    System.out.println("Error: La edad no puede ser negativa.");
                }
            } else {
                System.out.println("Error: Entrada no válida. Por favor ingrese un número entero.");
                scaneaoGoti.next();
            }
        }

        // Salto de línea
        scaneaoGoti.nextLine();

        // Validar entrada de cédula (mínimo 10 dígitos)
        String cedula;
        while (true) {
            System.out.println("Ingrese cédula del Cliente (mínimo 10 dígitos):");
            cedula = scaneaoGoti.nextLine();

            // \\d en una expresión regular en Java significa "un dígito" (es equivalente a
            // [0-9], es decir, cualquier número del 0 al 9).
            // {10,} Indica la cantidad mínima de veces que el patrón anterior (\\d) debe repetirse.
            // El número antes de la coma significa "al menos x veces"
            //
            // Verifica que toda la cadena (el input de la cédula, en este caso) consista exclusivamente de 10 o más dígitos.
            if (cedula.matches("\\d{10,}")) {
                break;
            } else {
                System.out.println("Error: La cédula debe contener al menos 10 dígitos numéricos.");
            }
        }

        // Crear una nueva compra con los datos del cliente
        Compra compra = new Compra(nombre, edad, cedula);

        // Registro de juegos
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Registro de Juegos ---");

            System.out.println("Ingrese el nombre del juego:");
            String nombreJuego = scaneaoGoti.nextLine();

            System.out.println("Ingrese el género del juego:");
            String generoJuego = scaneaoGoti.nextLine();

            // Validar entrada de precio
            double precioJuego = -1;
            while (precioJuego < 0) {
                System.out.println("Ingrese el precio del juego:");
                if (scaneaoGoti.hasNextDouble()) {
                    precioJuego = scaneaoGoti.nextDouble();
                    if (precioJuego < 0) {
                        System.out.println("Error: El precio no puede ser negativo.");
                    }
                } else {
                    System.out.println("Error: Entrada no válida. Por favor ingrese un número.");
                    scaneaoGoti.next(); // Limpiar la entrada incorrecta
                }
            }

            // Salto de línea
            scaneaoGoti.nextLine();

            // Crear el juego y agregarlo a la compra
            Juego juego = new Juego(nombreJuego, precioJuego, generoJuego);
            compra.agregarJuego(juego);

            // Preguntar si desea agregar otro juego
            System.out.println("¿Desea agregar otro juego? (S/N):");
            String respuesta = scaneaoGoti.nextLine().trim();
            continuar = !respuesta.equalsIgnoreCase("N");
        }

        // Mostrar la factura final
        compra.mostrarDetalleCompra();

        scaneaoGoti.close();
    }
}