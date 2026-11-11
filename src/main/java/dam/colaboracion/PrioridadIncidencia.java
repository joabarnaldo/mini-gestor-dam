package dam.colaboracion;

import java.util.Scanner;

public class PrioridadIncidencia {
    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nivel de urgencia (1-BAJA, 2-MEDIA, 3-ALTA): ");
        int nivelUrgencia = teclado.nextInt();

        System.out.println("Nivel introducido: " + nivelUrgencia);
    }
}