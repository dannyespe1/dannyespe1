package com.mycompany.waze_2;

import java.util.Scanner;

public class Waze_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su ID de usuario:");
        String id = scanner.nextLine();
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su ubicación actual:");
        String ubicacionActual = scanner.nextLine();

        Usuario usuario = new Usuario(id, nombre, ubicacionActual);

        int opcion;
        do {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Calcular ruta");
            System.out.println("2. Reportar evento");
            System.out.println("3. Actualizar mapa");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el punto de inicio:");
                    String puntoInicio = scanner.nextLine();
                    System.out.println("Ingrese el punto de destino:");
                    String puntoDestino = scanner.nextLine();
                    System.out.println("Ingrese la distancia en km:");
                    double distancia = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.println("Ingrese el tiempo estimado:");
                    String tiempoEstimado = scanner.nextLine();

                    Ruta ruta = new Ruta(puntoInicio, puntoDestino, distancia, tiempoEstimado);
                    ruta.mostrarRuta();
                    break;

                case 2:
                    System.out.println("Ingrese el tipo de evento:");
                    String tipoEvento = scanner.nextLine();
                    System.out.println("Ingrese la ubicación del evento:");
                    String ubicacionEvento = scanner.nextLine();
                    System.out.println("Ingrese la hora del evento:");
                    String horaEvento = scanner.nextLine();

                    Reporte reporte = new Reporte(tipoEvento, ubicacionEvento, horaEvento);
                    reporte.mostrarReporte();
                    break;

                case 3:
                    System.out.println("Actualizando mapa para la ubicación actual: " + usuario.getUbicacionActual());
                    Mapa mapa = new Mapa();
                    mapa.actualizarMapa(usuario.getUbicacionActual());
                    break;

                case 4:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
