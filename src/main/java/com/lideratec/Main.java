package com.lideratec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        // Carga inicial
        inventario.cargaInicial();

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
            scanner.nextLine(); // Limpiar buffer

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
                    scanner.nextLine(); // Limpiar buffer

                    // Agregar producto
                    Producto nuevoProducto = new Producto(codigo, nombre, categoria, precio, stock);
                    if (inventario.agregar(nuevoProducto)) {
                        System.out.println("¡Producto registrado con éxito!");
                    } else {
                        System.out.println("Error: El código de producto ya existe.");
                    }
                    break;

                case 2:
                    System.out.println("\n[LISTADO DE PRODUCTOS]");
                    // Listar productos
                    inventario.listar();
                    break;

                case 3:
                    System.out.println("\n[BUSCAR PRODUCTO]");
                    System.out.print("Ingrese el código del producto a buscar: ");
                    String codBuscar = scanner.nextLine();

                    // Buscar producto
                    Producto encontrado = inventario.buscar(codBuscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado);
                    } else {
                        System.out.println("Error: Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n[ELIMINAR PRODUCTO]");
                    System.out.print("Ingrese el código del producto a eliminar: ");
                    String codEliminar = scanner.nextLine();

                    // Eliminar producto
                    if (inventario.eliminar(codEliminar)) {
                        System.out.println("¡Producto eliminado con éxito!");
                    } else {
                        System.out.println("Error: Producto no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("\n[ACTUALIZAR STOCK]");
                    System.out.print("Ingrese el código del producto: ");
                    String codStock = scanner.nextLine();
                    System.out.print("Ingrese el nuevo stock: ");
                    int nuevoStock = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    // Actualizar stock
                    if (inventario.actualizarStock(codStock, nuevoStock)) {
                        System.out.println("¡Stock actualizado con éxito!");
                    } else {
                        System.out.println("Error: Producto no encontrado o stock inválido.");
                    }
                    break;

                case 6:
                    System.out.println("\n[SUBMENÚ REPORTES]");
                    int opReporte;
                    do {
                        System.out.println("\n--- MENÚ DE REPORTES ---");
                        System.out.println("1. Ordenar de A-Z");
                        System.out.println("2. Del más caro al más barato");
                        System.out.println("3. Del más barato al más caro");
                        System.out.println("4. Cantidad por categoría");
                        System.out.println("5. Volver al menú principal");
                        System.out.print("Seleccione una opción de reporte: ");
                        opReporte = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        // Instancia de reportes compartida
                        ReporteProductos rp = new ReporteProductos();

                        switch (opReporte) {
                            case 1:
                                rp.ordenarDeAz();
                                break;
                            case 2:
                                rp.ordenarPorPrecioMasCaro();
                                break;
                            case 3:
                                rp.ordenarPorPrecioMasBarato();
                                break;
                            case 4:
                                rp.contarPorCategoria();
                                break;
                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (opReporte != 5);
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
