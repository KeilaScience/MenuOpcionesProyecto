/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuopcionesproyecto;

import java.util.Scanner;

public class MenuOpcionesProyecto {

    public static void main(String[] args) {
        // SISTEMA DE VENTA DEL HOTEL "CALIFORNIA"
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== Bienvenidos al sistema de Hotel California ===");
            System.out.println("=== Menú de opciones ===");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Registrar Producto");
            System.out.println("3. Registrar Ingreso");
            System.out.println("4. Registrar Consumo");
            //System.out.println("5. Registrar Proveedor");
            System.out.println("5. Registrar Pago");
            System.out.println("6. Registrar Hospedaje");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
        
            switch (opcion) {
                case 1:
                    registroUsuario();
                    break;
                case 2:
                    registroProducto();
                    break;
                case 3:
                    registroIngreso();
                    break;
                case 4:
                    registroConsumo();
                    break;
               // case 5:
               //     registroProveedor();
               //     break;
                case 5:
                    registroPago();
                    break;
                case 6:
                    registroHospedaje();
                    break;
                case 7:
                    System.out.println("Salir del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, ingrese nuevamente.");
            }

            System.out.println();
        } while (opcion != 7);
    }
    private static void registroUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Registrar Usuario ===");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese los apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese el correo: ");
        String correo = scanner.nextLine();
        
        System.out.println("Usuario registrado correctamente.");
    }
    private static void registroProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Registrar Producto ===");
        System.out.print("Ingrese el código: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.print("Ingrese el nombre del proveedor: ");
        String nombreProveedor = scanner.nextLine();
        
    
        System.out.println("Producto registrado correctamente.");
    }
    private static void registroIngreso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Registrar Ingreso ===");
        System.out.print("Ingrese el código: ");
        String codigoIngreso = scanner.nextLine();
        System.out.print("Ingrese la fecha: ");
        String fechaIngreso = scanner.nextLine();
        
        System.out.println("Ingreso registrado correctamente.");
    }
    private static void registroConsumo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Registrar Consumo ===");
        System.out.print("Ingrese el código: ");
        String codigoConsumo = scanner.nextLine();
        System.out.print("Ingrese la fecha: ");
        String fechaConsumo = scanner.nextLine();
    }
   // private static void registroProveedor() {
      //  Scanner scanner = new Scanner(System.in);
     //   System.out.println("=== Registrar al proveedor ===");
     //   System.out.print("Ingrese el código: ");
    //    String codigoProvee = scanner.nextLine();
    //    System.out.print("Ingrese la fecha: ");
    //    String fechaProvee = scanner.nextLine();
   // }
    private static void registroPago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Registrar el pago ===");
        System.out.print("Ingrese el código: ");
        String codigoPago = scanner.nextLine();
        System.out.print("Ingrese la fecha: ");
        String fechaPago = scanner.nextLine();
    }
    private static void registroHospedaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Registrar el Hospedaje ===");
        System.out.print("Ingrese el código: ");
        String codigoHospedaje = scanner.nextLine();
        System.out.print("Ingrese la fecha: ");
        String fechaHospedaje = scanner.nextLine();
    }
    
    
}
    

    

