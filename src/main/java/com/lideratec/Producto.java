package com.lideratec;

// Implementa Comparable para que Collections pueda ordenar los productos (sort, max, min).
// El orden natural de un Producto será por precio.
public class Producto implements Comparable<Producto> {

    // Atributos (private: solo se acceden desde la propia clase o con getters/setters)
    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    // Constructor con todos los datos del producto
    public Producto(String codigo, String nombre, String categoria, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos que devuelven valor (getters)
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Método que no devuelve valor: actualiza el stock
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Texto con el que se muestra el producto al imprimirlo
    @Override
    public String toString() {
        return codigo + " | " + nombre + " | " + categoria
                + " | S/ " + String.format("%.2f", precio)
                + " | Stock: " + stock;
    }

    // Define el orden natural: de menor a mayor precio.
    // Devuelve negativo si este producto es más barato, positivo si es más caro, 0 si son iguales.
    @Override
    public int compareTo(Producto otro) {
        if (this.precio < otro.precio) {
            return -1;
        } else if (this.precio > otro.precio) {
            return 1;
        } else {
            return 0;
        }
    }
}