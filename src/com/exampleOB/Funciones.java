package com.exampleOB;

public class Funciones {

    public static void main(String[] args) {

        //creo y guardo el producto 1.
        double precioProducto1 = obtenerPrecioConIva(100.00d);
        System.out.println(precioProducto1);

        //creo y guardo el producto 2.
        double precioProducto2 = obtenerPrecioConIva(25.50d);
        System.out.println(precioProducto2);
    }


    // Funcion que obtiene el precio del producto con el iva incluido.
    static double obtenerPrecioConIva(double precioSinIva) {

        double ivaDelProducto = (precioSinIva*21)/100;
        
        return precioSinIva+ivaDelProducto;
    }
}
