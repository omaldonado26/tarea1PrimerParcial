package com.hn.uth.tarea1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular el área de un cuadrado");
            System.out.println("3. Calcular el área de un rectángulo");
            System.out.println("4. Calcular el área de un triángulo");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = scanner.nextDouble();
                    System.out.println("Área del círculo: " + calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.println("Ingrese el lado del cuadrado:");
                    double lado = scanner.nextDouble();
                    System.out.println("Área del cuadrado: " + calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.println("Ingrese la base del rectángulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double altura = scanner.nextDouble();
                    System.out.println("Área del rectángulo: " + calcularAreaRectangulo(base, altura));
                    break;
                case 4:
                    System.out.println("Ingrese la base del triángulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.println("Área del triángulo: " + calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
