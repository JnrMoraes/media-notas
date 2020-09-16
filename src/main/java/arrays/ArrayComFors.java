package arrays;

import java.util.Scanner;

public class ArrayComFors {

    public static void main(String[] args) {

        double [] notas = new double[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insert your first grade: " + (i + 1));

            notas[i] = scanner.nextDouble();
        }

        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Grade " + (i+1) + ": " + notas[i]);

        }
        System.out.println("Mean overall grade point average: " + media/notas.length);

    }
}
