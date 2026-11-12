import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

        System.out.print("Introduce la edad del alumno: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("El alumno es mayor de edad");
        } else {
            System.out.println("El alumno es menor de edad");
        }

        teclado.close();
    }
}