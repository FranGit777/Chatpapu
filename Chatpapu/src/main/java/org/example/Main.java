package org.example;

import picocli.CommandLine;
import Productos.Electrodomestico;
import Productos.Ropa;
import Productos.ProductoBase;


import java.util.Scanner;

@CommandLine.Command(name = "tienda", mixinStandardHelpOptions = true, version = "1.0",
        description = "sistema de manejo interactivo del stock de la tienda")
public class Main implements Runnable {
    public Tienda tienda = new Tienda();
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new CommandLine(new Main()).execute(args);
    }

    @Override
    public void run() {
        System.out.println("Bienvenido al sistema de manejo interactivo del stock de la tienda");
        while (true) {
            System.out.println("\nElija una opción:");
            System.out.println("1. Agregar Ropa");
            System.out.println("2. Agregar Electrodomestico");
            System.out.println("3. Mostrar Productos");
            System.out.println("4. Salir");
            System.out.print("> ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    tienda.agregarProducto(crearRopa());
                    break;
                case 2:
                    tienda.agregarProducto(crearElectrodomestico());
                    break;
                case 3:
                    tienda.mostrarInventario();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }
    }

    private Ropa crearRopa() {
        System.out.print("\nIngrese el ID del producto: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la talla del producto: ");
        String talla = scanner.nextLine();

        System.out.print("Ingrese el color del producto: ");
        String color = scanner.nextLine();

        return new Ropa(id, nombre, precio, talla, color);
    }

    private Electrodomestico crearElectrodomestico() {
        System.out.print("\nIngrese el ID del producto: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la garantía en meses: ");
        int garantiaEnMeses = Integer.parseInt(scanner.nextLine());

        return new Electrodomestico(id, nombre, precio, garantiaEnMeses);
    }
}
