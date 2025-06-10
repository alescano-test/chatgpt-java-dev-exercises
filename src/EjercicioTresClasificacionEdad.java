/*
Objetivo: Practicar condicionales if, else if, y else.

Enunciado:
Escribí un programa en Java que pida al usuario su edad y muestre un mensaje según la siguiente clasificación:
Menor de 13 años: "Sos un niño/a."
De 13 a 17 años: "Sos un adolescente."
De 18 a 64 años: "Sos un adulto."
65 años o más: "Sos una persona mayor."

Ejemplo de ejecución:
Ingrese su edad: 22  
Sos un adulto.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioTresClasificacionEdad {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad para clasificarte: ");
        try {
            int edad = scanner.nextInt();
            if (edad < 0) {
                System.out.println("Error: La edad no puede ser negativa.");
            } else if (edad < 13) {
                System.out.println("Sos un niño/a");
            } else if (edad >= 13 && edad <= 17) {
                System.out.println("Sos un adolescente.");
            } else if (edad >= 18 && edad <= 64) {
                System.out.println("Sos un adulto.");
            } else if (edad >= 65) {
                System.out.println("Sos una persona mayor.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar una edad válida en números.");
        }
        scanner.close();
    }
}
