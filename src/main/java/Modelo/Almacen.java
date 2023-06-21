/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Stack;


public class Almacen {
    //Utilizamos la clase de tipo LIFO donde recupera el ultimo elemento insertado
    private Stack<Envio> almacenamiento;

    public Almacen() {
        almacenamiento = new Stack<>();
    }
//Con el push añadimos los productos al final de la lista 
    public void Guardar(Envio transaccion) {
        almacenamiento.push(transaccion);
    }
//Creamos un getter 
    public Stack<Envio> getAlmacenamiento() {
        return almacenamiento;
    }
}
