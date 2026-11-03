package com.lideratec;

import java.util.ArrayList;
import java.util.Collections;

public class PruebaProducto {
    public static void main(String[] args) {
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Producto("P001", "Laptop Core i5", "Laptops", 2499.00, 5));
        lista.add(new Producto("P002", "Mouse inalámbrico", "Accesorios", 59.90, 30));
        lista.add(new Producto("P003", "Monitor 24 pulgadas", "Monitores", 549.00, 12));

        System.out.println("--- Orden de ingreso ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        Collections.sort(lista);
        System.out.println("--- Ascendente por precio (mouse, monitor, laptop) ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("--- Descendente por precio (laptop, monitor, mouse) ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Más caro: " + Collections.max(lista));
        System.out.println("Más barato: " + Collections.min(lista));
    }
}
