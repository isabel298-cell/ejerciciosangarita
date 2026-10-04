import java.util.Scanner;

public class deseasalir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respuesta = "";

        // Usamos un ciclo do-while para que al menos se ejecute una vez
        do {
            System.out.println("El programa se está ejecutando...");
            System.out.println("¿Desea salir? (S/N):");
            respuesta = entrada.next();

        } while (!respuesta.equalsIgnoreCase("S")); // Continúa mientras NO sea "S"

        System.out.println("Programa detenido.");
    }
}
