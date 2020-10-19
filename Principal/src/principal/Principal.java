/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Josué Tejeda
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<FacturaEncabezado> datos = new ArrayList();
        List<FacturaDetalle> detalles = new ArrayList();

        int serie;
        int numero;
        String fecha = null;
        String nombre;
        String direccion;
        int nit;
        int cantidad;
        String descripcion;
        double valor;
        double total;

        char ingreso = 'n';
        int opcion = 0;

        do {

            System.out.println("-----------------------------------------------");
            System.out.println("Bienvenido al servicio de facturas electronicas");
            System.out.println("-----------------------------------------------");

            System.out.println("Seleccione la opcion que necesita:");
            System.out.println("1.Ingresar Datos");
            System.out.println("2.Mostrar Datos");
            System.out.println("3.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese los datos de las facturas");

                    do {

                        System.out.println("Serie Factura:");
                        serie = sc.nextInt();
                        System.out.println("Numero de Factura:");
                        numero = sc.nextInt();
                        System.out.println("Nombre:");
                        nombre = sc.next();
                        System.out.println("Direccion:");
                        direccion = sc.next();
                        System.out.println("Nit:");
                        nit = sc.nextInt();
                        System.out.println("----------------------------------");
                        System.out.println("Ingrese los detalles de la factura");
                        System.out.println("----------------------------------");
                        System.out.println("Cantidad del producto:");
                        cantidad = sc.nextInt();
                        System.out.println("Descripcion:");
                        descripcion = sc.next();
                        System.out.println("Valor del Producto:");
                        System.out.print("Q");
                        valor = sc.nextInt();

                        total = cantidad * valor;
                        
                        datos.add(new FacturaEncabezado(serie, numero, fecha, nombre, direccion, nit));
                        detalles.add(new FacturaDetalle(cantidad, descripcion, valor, total));
                        
                        
                        
                        System.out.println("----------------------------");
                        System.out.println("Desea Ingresar más facturas:");
                        System.out.println("----------------------------");
                        ingreso=sc.next().charAt(0);
                        
                        
                        
                    } while (ingreso == 's');
                    break;
                case 2:
                    
                    System.out.println("----------------------------------");
                    System.out.println("--Facturas Ingresadas--");
                    System.out.println("----------------------------------");
                    
                    for (FacturaEncabezado facturaEncabezado:datos) {
                        System.out.println("Serie:\t"+facturaEncabezado.getSerie());
                        System.out.println("Numero de Doc:\t"+facturaEncabezado.getNumero());
                        System.out.println("Nombre:\t"+facturaEncabezado.getNombre());
                        System.out.println("Direccion:\t"+facturaEncabezado.getDireccion());
                        System.out.println("Nit:\t"+facturaEncabezado.getNit());
                    }
                    for (FacturaDetalle facturaDetalle: detalles) {
                        System.out.println("-Cantidad Producto-\t"+"-Descripcion-\t"+"-Valor-\t"+"-Total a pagar-\t");
                        System.out.println(facturaDetalle.getCantidad()+"\t"+facturaDetalle.getDescripcion()+"\t"+facturaDetalle.getValor()+"\t"+facturaDetalle.getTotal()+"\t");
                        
                    }
                    break;
                    
   
                        
                    
            }
            System.out.println("Intente de nuevo");
        } while (opcion != 3);
        System.out.println("Gracias por su visita.");
    }

    }
  
