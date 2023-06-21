/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.proyecto.dos.estructura;

import Controlador.ControladorProducto;
import Vista.VistaTienda;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ProyectoDosEstructura {

    public static void main(String[] args) {
         //Instanciamos el Controlador y la Vista
        ControladorProducto controlador = new ControladorProducto();
        VistaTienda vista = new VistaTienda(controlador);

        Scanner scanner = new Scanner(System.in);
        
        
 System.out.println("Menu");
        int opcion = 0;
        boolean salir = false;
        do {
        
            System.out.println("1. Ingresar productos");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Vender producto");
            
            System.out.println("4. Salir");
            System.out.print("Elija una opcion : ");
            
            opcion = scanner.nextInt();
        
            switch (opcion) {
                case 1:
                    vista.IngresarProducto();
                    vista.mostrarInventario();
                    break;
                case 2:
                    vista.eliminarProducto();
                    vista.mostrarInventario();
                    break;
                case 3:
                    vista.venderProducto();
                    vista.mostrarInventario();
                    vista.mostrarAlmacen();
                    break;
                
                    
                case 4:
                    salir = true;
                    break;

            

             } 
            
    }while (salir == false);
        System.out.println("Programa finalizado");
        }

            }

