   package dam.colaboracion;

   import java.util.Scanner;

   public class RegistroIncidencia {
       public static void ejecutar() {
           Scanner teclado = new Scanner(System.in);

           System.out.print("Título de la incidencia: ");
           String titulo = teclado.nextLine();
       }
   }