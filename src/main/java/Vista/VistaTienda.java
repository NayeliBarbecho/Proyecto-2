/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.ControladorProducto;
import Modelo.Producto;
import Modelo.Envio;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class VistaTienda {
    // creamos un atributo controlador con el tipo de clase del ControladorProducto
    private ControladorProducto controlador;
    //Mandamos el controlador en la firma del metodo

    public VistaTienda(ControladorProducto controlador) {
        this.controlador = controlador;
    }
    

    public void mostrarInventario() {
        
        List<Producto> productos = controlador.getInventario();
        System.out.println("Inventario Actual:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " (" + producto.getCodigo() + "): " + producto.getCantidad());
        }
    }

    public void mostrarAlmacen() {
        Stack<Envio> almacenamiento = controlador.getAlmacen();
        System.out.println("Almacen de ventas:");
        for (Envio almacen : almacenamiento) {
            System.out.println(almacen.getProducto().getNombre() + " (" + almacen.getProducto().getCodigo() + "): " + almacen.getCantidad() + " Vendido por " + almacen.getTotal());
        }
    }
    //Ingreso por teclados de los atributos

    public void IngresarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduzca el codigo: ");
        String codigo = scanner.nextLine();
        System.out.print("Introduzca el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Introduza la cantidad disponible en el almacen ");
        int cantidad = scanner.nextInt();
        controlador.registarProducto(nombre, codigo, precio, cantidad);
            }

    public void eliminarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el codigo del producto: ");
        String codigo = scanner.nextLine();
        controlador.eliminarProducto(codigo);
    }

    public void venderProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el codigo: ");
        String codigo = scanner.nextLine();
        System.out.print("Introduzca la cantidad: ");
        int cantidad = scanner.nextInt();
        controlador.venderProducto(codigo, cantidad);
    }
}

