import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

        System.out.print("Introduce la edad del alumno: ");
        int edad = teclado.nextInt();

        System.out.println("La edad del alumno es: " + edad);

        teclado.close();
    }
}