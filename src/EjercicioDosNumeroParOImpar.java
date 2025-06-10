/*
Objetivo: Usar condicionales if-else.

Enunciado:
Escribí un programa en Java que pida un número entero al usuario y determine si es par o impar. Mostrá el resultado por consola.

Ejemplo de ejecución:
Ingrese un número: 7  
El número es impar.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioDosNumeroParOImpar {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número a ser evaluado: ");
        try {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar un número entero válido.");
        }
        scanner.close();
    }
}
