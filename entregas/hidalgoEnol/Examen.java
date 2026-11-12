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

        int numAsignaturas;

        do {
            System.out.print("Introduce el número de asignaturas (1-10): ");
            numAsignaturas = teclado.nextInt();

            if (numAsignaturas < 1 || numAsignaturas > 10) {
                System.out.println("Número incorrecto. Vuelve a intentarlo.");
            }

        } while (numAsignaturas < 1 || numAsignaturas > 10);

        int nota;
        int aprobadas = 0;
        double sumaNotas = 0;

        for (int i = 1; i <= numAsignaturas; i++) {
            System.out.print("Nota de la asignatura N" + i + ": ");
            nota = teclado.nextInt();

            sumaNotas = sumaNotas + nota;

            if (nota >= 5) {
                aprobadas++;
            }
        }

        double media = sumaNotas / numAsignaturas;

        System.out.println("La media de las notas es: " + media);
        System.out.println("Asignaturas aprobadas: " + aprobadas);

        teclado.close();
    }
}