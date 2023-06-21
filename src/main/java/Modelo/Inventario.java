/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        productos = new LinkedList<>();
    }
    //Añade productos al final de la lista y los va colocando segun como lo vayamos ingresando

    public void ingresarProducto(Producto producto) {
        productos.add(producto);
    }
//Con el metodo removeIf eliminamos los metodos de la lista que coincidan con el parametro
    public void eliminarProducto(String codigo) {
        productos.removeIf(product -> product.getCodigo().equals(codigo));
    }
//Recorremos la lista para encontrar el producto deseado segun el codigo y nos duevluve dicha informacion pedida
    public Producto encontrarProducto (String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }
    //Nos mostrara todos los productos registrados
    public void verProducto(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println("Datos de los productos: " + productos+"Total a pagar"+producto.calcularPrecioTotal(0));
          
        }

        
    }
    //Getter de la lista de  productos

    public List<Producto> getProductos() {
        return productos;
        
    }
}

