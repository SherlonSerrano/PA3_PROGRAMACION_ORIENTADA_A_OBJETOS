package com.lideratec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN COMPUTEC ---");
            System.out.println("1. Registrar/Agregar Producto");
            System.out.println("2. Listar Productos");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Actualizar Stock");
            System.out.println("6. Generar Reportes");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n[REGISTRAR PRODUCTO]");
                    System.out.print("Ingrese código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese categoría: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Ingrese precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese stock inicial: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Datos capturados correctamente (Pendiente conectar a Inventario).");
                    break;

                case 2:
                    System.out.println("\n[LISTADO DE PRODUCTOS]");
                    System.out.println("Aquí se mostrará la lista del inventario...");
                    break;

                case 3:
                    System.out.println("\n[BUSCAR PRODUCTO]");
                    System.out.print("Ingrese el código del producto a buscar: ");
                    String codBuscar = scanner.nextLine();
                    break;

                case 4:
                    System.out.println("\n[ELIMINAR PRODUCTO]");
                    System.out.print("Ingrese el código del producto a eliminar: ");
                    String codEliminar = scanner.nextLine();
                    break;

                case 5:
                    System.out.println("\n[ACTUALIZAR STOCK]");
                    System.out.print("Ingrese el código del producto: ");
                    String codStock = scanner.nextLine();
                    System.out.print("Ingrese el nuevo stock: ");
                    int nuevoStock = scanner.nextInt();
                    break;

                case 6:
                    System.out.println("\n[SUBMENÚ REPORTES]");
                    break;

                case 7:
                    System.out.println("Saliendo del sistema Computec... ¡Buen trabajo!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
