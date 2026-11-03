package com.lideratec;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private final List<Producto> productos = new ArrayList<>();

    public void cargaInicial() {
        // Producto(String codigo, String nombre, String categoria, double precio, int stock)
        productos.add(new Producto("P001", "Laptop Lenovo IdeaPad", "Laptops", 2499.90, 10));
        productos.add(new Producto("P002", "Laptop Lenovo V15", "Laptops", 2299.90, 2));
        productos.add(new Producto("P003", "Laptop Lenovo ThinkBook 14", "Laptops", 3599.90, 5));
        productos.add(new Producto("P004", "Laptop HP EliteBook", "Laptops", 3499.90, 9));
        productos.add(new Producto("P005", "Laptop Asus ExpertBook", "Laptops", 3349.90, 9));
        productos.add(new Producto("P006", "Ryzen 5 5600", "Procesadores", 549.00, 20));
        productos.add(new Producto("P007", "Ryzen 7 5700", "Procesadores", 799.00, 20));
        productos.add(new Producto("P008", "Intel core i7-1200F", "Procesadores", 680.00, 5));
        productos.add(new Producto("P009", "Intel core i9-12900KF", "Procesadores", 1797.00, 15));
        productos.add(new Producto("P010", "Intel core i7-14700K", "Procesadores", 1727.50,  1));
        productos.add(new Producto("P011", "RAM 16GB DDR4", "Memorias", 523.00, 35));
        productos.add(new Producto("P012", "RAM 16GB DDR5", "Memorias", 1309.50, 35));
        productos.add(new Producto("P013", "RAM 32GB DDR5", "Memorias", 2537.50, 35));
        productos.add(new Producto("P014", "SSD NVMe 512GB", "Almacenamiento", 410.00, 25));
        productos.add(new Producto("P015", "SSD NVMe 1TB", "Almacenamiento", 678.00, 25));
        productos.add(new Producto("P016", "SSD NVMe 2TB", "Almacenamiento", 1169.00, 25));
        productos.add(new Producto("P017", "RTX 3050", "Tarjetas de video", 994.50, 8));
        productos.add(new Producto("P018", "RTX 4060", "Tarjetas de video", 1499.00, 8));
        productos.add(new Producto("P019", "RTX 4070", "Tarjetas de video", 2699.00, 8));
        productos.add(new Producto("P020", "RTX 4090", "Tarjetas de video", 7299.00, 8));
    }

    public void listar() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public boolean agregar(Producto nuevo) {
        if (buscar(nuevo.getCodigo()) != null) {
            return false;
        }
        productos.add(nuevo);
        return true;
    }

    public Producto buscar(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminar(String codigo) {
        Producto p = buscar(codigo);
        if (p == null) {
            return false;
        }
        return productos.remove(p);
    }

    public boolean actualizarStock(String codigo, int nuevoStock) {
        Producto p = buscar(codigo);
        if (p == null || nuevoStock < 0) {
            return false;
        }
        p.setStock(nuevoStock);
        return true;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}