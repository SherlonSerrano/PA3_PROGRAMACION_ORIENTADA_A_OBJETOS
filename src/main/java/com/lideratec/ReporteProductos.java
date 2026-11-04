package com.lideratec;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReporteProductos {

    // Declación de la lista a nivel global para que todos los métodos puedan acceder a el.
    private final List<Producto> productos;

    // Recibe los productos del inventario
    public ReporteProductos(List<Producto> productos) {
        this.productos = new ArrayList<>(productos);
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
