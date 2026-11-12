import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

        int edad;

        do {
            System.out.print("Introduce la edad del alumno (17-70): ");
            edad = teclado.nextInt();

            if (edad < 17 || edad > 70) {
                System.out.println("Edad incorrecta. Vuelve a intentarlo.");
            }

        } while (edad < 17 || edad > 70);

        if (edad >= 18) {
            System.out.println("El alumno es mayor de edad");
        } else {
            System.out.println("El alumno es menor de edad");
        }

        teclado.close();
    }
}