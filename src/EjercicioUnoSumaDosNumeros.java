/*
 * Objetivo: Practicar entrada por teclado, variables y operaciones básicas.
 * 
 * Enunciado:
 * Escribí un programa en Java que pida al usuario dos números enteros por
 * consola y muestre la suma de ambos.
 * 
 * Ejemplo de ejecución:
 * Ingrese el primer número: 5
 * Ingrese el segundo número: 8
 * La suma es: 13
 */

import java.util.Scanner;

public class EjercicioUnoSumaDosNumeros {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("El resultado es: " + (primerNumero + segundoNumero));
        scanner.close();
    }
}
