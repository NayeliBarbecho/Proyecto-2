/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Almacen;
import Modelo.Inventario;
import Modelo.Producto;
import Modelo.Envio;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class ControladorProducto {
    private Inventario inventario;
    private Almacen datos;
    private List<Producto> productos;
//Instanciamos inventario y datos
    public ControladorProducto() {
        inventario = new Inventario();
        datos = new Almacen();
    }
    //Utilizamos el metodo ya antes creado que es ingresarProducto y le vamos guardando en los atributos

    public void registarProducto(String nombre, String codigo, double precio, int cantidad) {
        Producto producto = new Producto(nombre, codigo, precio, cantidad);
        inventario.ingresarProducto(producto);
    }
    //Se eliminara al producto por un atributo que le distinga en este caso el codigo y se utiliza el metodo eliminar del inventario

    public void eliminarProducto(String codigo) {
        inventario.eliminarProducto(codigo);
    }
    //Se obtiene el producto por el codigo y se ingresa una cantidad ,contiene un metodo para calcular el total del costo de cada producto

    public void venderProducto(String codigo, int cantidad) {
        Producto producto = inventario.encontrarProducto(codigo);
        
       

        if (producto != null && producto.getCantidad() >= cantidad) {
            double total = producto.getPrecio() * cantidad;
            producto.setCantidad(producto.getCantidad() - cantidad);
            Envio transaccion = new Envio(producto, cantidad, total);
            datos.Guardar(transaccion);
            producto.calcularPrecioTotal(cantidad);
        } else {
            System.out.println("Producto no hayado");
            System.out.println("Cantidad");
        }
    }
    //Se va enlistando cada uno de los productos

    public List<Producto> getInventario() {
        return inventario.getProductos();
    }
    

    public Stack<Envio> getAlmacen() {
        return datos.getAlmacenamiento();
    }
}
