package dam.colaboracion;

import java.util.Scanner;

public class PrioridadIncidencia {
    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nivel de urgencia (1-BAJA, 2-MEDIA, 3-ALTA): ");

        if (teclado.hasNextInt()) {
            int nivelUrgencia = teclado.nextInt();

            if (nivelUrgencia == 1) {
                System.out.println("Prioridad asignada: BAJA");
            } else if (nivelUrgencia == 2) {
                System.out.println("Prioridad asignada: MEDIA");
            } else if (nivelUrgencia == 3) {
                System.out.println("Prioridad asignada: ALTA");
            } else {
                System.out.println("Nivel de urgencia no válido");
            }
        } else {
            System.out.println("Nivel de urgencia no válido");
        }
    }
}