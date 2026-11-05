# PA3 - Gestión de inventario con colecciones

## Descripción

Computec es un sistema de gestión de inventario desarrollado en Java que permite administrar productos de una tienda de tecnología mediante una aplicación de consola.

El sistema utiliza colecciones de Java para almacenar y gestionar los productos en memoria. Permite registrar, listar, buscar, eliminar y actualizar productos, además de generar reportes mediante diferentes criterios de ordenamiento y agrupación.

## Integrantes

- Sherlon Lisber Serrano Garcia - Repositorio y clase Producto
- Yanire Dayana Alcantara Salinas - Clase Inventario (ArrayList)
- Ricardo Moisés Chauca Velazco - Clase ReporteProductos (Collections)
- [Nombre] - Main y menú principal
- Alvaro Carita Huaman - Pruebas y documentación

## Funcionalidades

- Carga inicial de 20 productos.
- Registro de nuevos productos, validando que el código no se repita.
- Listado de productos.
- Búsqueda de productos mediante su código.
- Eliminación de productos.
- Actualización del stock.
- Generación de reportes:
  - Ordenamiento alfabético de A-Z.
  - Ordenamiento del producto más caro al más barato.
  - Ordenamiento del producto más barato al más caro.
  - Conteo de productos por categoría.

## Tecnologías utilizadas

- Java 21
- IntelliJ IDEA
- Maven
- ArrayList
- Collections
- Comparable
- Comparator
- Stream API
- Git y GitHub

## Instrucciones de ejecución

1. Tener instalado JDK 21.
2. Clonar el repositorio.
3. Abrir el proyecto en IntelliJ IDEA como un proyecto Maven.
4. Esperar a que Maven cargue las dependencias.
5. Ejecutar la clase `Main`, ubicada en el paquete `com.lideratec`.

## Lógica de almacenamiento

Se utilizó la interfaz `List` junto con la implementación `ArrayList` para almacenar los productos en memoria.

Se eligió `ArrayList` porque permite administrar una colección dinámica, cuyo tamaño puede aumentar o disminuir según las operaciones realizadas. Además, facilita el recorrido de los productos y permite realizar operaciones como agregar, buscar y eliminar elementos.

Para el ordenamiento de los productos se implementó la interfaz `Comparable` en la clase `Producto`, definiendo el precio como criterio de orden natural.

También se utilizó la clase `Collections` para realizar operaciones como:

- `Collections.sort()`: ordena los productos de menor a mayor precio.
- `Collections.reverseOrder()`: permite invertir el orden de clasificación.
- `Collections.max()`: obtiene el producto con el precio más alto.
- `Collections.min()`: obtiene el producto con el precio más bajo.

En la clase `ReporteProductos` se utilizaron `Comparator` y la API de Streams para ordenar los productos por nombre y precio, así como agruparlos por categoría y contar cuántos productos pertenecen a cada una.

De esta manera, las colecciones permiten administrar el inventario y generar información organizada sin necesidad de utilizar una base de datos externa.

## Video de exposición

[Agregar aquí el enlace de YouTube]
