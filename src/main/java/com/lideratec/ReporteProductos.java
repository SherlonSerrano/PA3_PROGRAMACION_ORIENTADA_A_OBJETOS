package com.lideratec;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReporteProductos {

    // Declación de la lista a nivel global para que todos los métodos puedan acceder a el.
    private final List<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {
        // Creamos una instancia de la propia clase para manejar el flujo sin problemas estáticos
        ReporteProductos rp = new ReporteProductos();

        // La lista 'productos' se llena usando 'rp' como instancia.
        rp.productos.add(new Producto("P001", "Laptop Lenovo IdeaPad", "Laptops", 2499.90, 10));
        rp.productos.add(new Producto("P002", "Laptop Lenovo V15", "Laptops", 2299.90, 2));
        rp.productos.add(new Producto("P003", "Laptop Lenovo ThinkBook 14", "Laptops", 3599.90, 5));
        rp.productos.add(new Producto("P004", "Laptop HP EliteBook", "Laptops", 3499.90, 9));
        rp.productos.add(new Producto("P005", "Laptop Asus ExpertBook", "Laptops", 3349.90, 9));
        rp.productos.add(new Producto("P006", "Ryzen 5 5600", "Procesadores", 549.00, 20));
        rp.productos.add(new Producto("P007", "Ryzen 7 5700", "Procesadores", 799.00, 20));
        rp.productos.add(new Producto("P008", "Intel core i7-1200F", "Procesadores", 680.00, 5));
        rp.productos.add(new Producto("P009", "Intel core i9-12900KF", "Procesadores", 1797.00, 15));
        rp.productos.add(new Producto("P010", "Intel core i7-14700K", "Procesadores", 1727.50, 1));
        rp.productos.add(new Producto("P011", "RAM 16GB DDR4", "Memorias", 523.00, 35));
        rp.productos.add(new Producto("P012", "RAM 16GB DDR5", "Memorias", 1309.50, 35));
        rp.productos.add(new Producto("P013", "RAM 32GB DDR5", "Memorias", 2537.50, 35));
        rp.productos.add(new Producto("P014", "SSD NVMe 512GB", "Almacenamiento", 410.00, 25));
        rp.productos.add(new Producto("P015", "SSD NVMe 1TB", "Almacenamiento", 678.00, 25));
        rp.productos.add(new Producto("P016", "SSD NVMe 2TB", "Almacenamiento", 1169.00, 25));
        rp.productos.add(new Producto("P017", "RTX 3050", "Tarjetas de video", 994.50, 8));
        rp.productos.add(new Producto("P018", "RTX 4060", "Tarjetas de video", 1499.00, 8));
        rp.productos.add(new Producto("P019", "RTX 4070", "Tarjetas de video", 2699.00, 8));
        rp.productos.add(new Producto("P020", "RTX 4090", "Tarjetas de video", 7299.00, 8));
        System.out.println("--------- LISTA INICIAL ---------");
        for(int i = 0; i < rp.productos.size(); i++){
            System.out.println(rp.productos.get(i));
        }

        // 3. Ejecución de funciones a probar.
        rp.ordenarDeAz();
        rp.ordenarPorPrecioMasCaro();
        rp.ordenarPorPrecioMasBarato();
        rp.contarPorCategoria();
    }

    public void ordenarDeAz() {
        System.out.println("\n--- PRODUCTOS ORDENADOS DE A-Z ---");
        List<Producto> ordenados = new ArrayList<>(this.productos);
        ordenados.sort(Comparator.comparing(Producto::getNombre, String.CASE_INSENSITIVE_ORDER));

        for (Producto p : ordenados) {
            System.out.println(p.getNombre() + " - S/ " + p.getPrecio());
        }
    }

    public void ordenarPorPrecioMasCaro() {
        System.out.println("\n--- PRODUCTOS: DEL MÁS CARO AL MÁS BARATO ---");
        List<Producto> ordenados = new ArrayList<>(this.productos);
        ordenados.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());

        for (Producto p : ordenados) {
            System.out.println(p.getNombre() + " - S/ " + p.getPrecio());
        }
    }

    public void ordenarPorPrecioMasBarato() {
        System.out.println("\n--- PRODUCTOS: DEL MÁS BARATO AL MÁS CARO ---");
        List<Producto> ordenados = new ArrayList<>(this.productos);
        ordenados.sort(Comparator.comparingDouble(Producto::getPrecio));

        for (Producto p : ordenados) {
            System.out.println(p.getNombre() + " - S/ " + p.getPrecio());
        }
    }

    public void contarPorCategoria() {
        System.out.println("\n--- CANTIDAD DE PRODUCTOS POR CATEGORÍA ---");
        Map<String, Long> conteo = this.productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.counting()));

        conteo.forEach((categoria, cantidad) -> {
            System.out.println("Categoría: " + categoria + " | Cantidad: " + cantidad);
        });
    }
}
