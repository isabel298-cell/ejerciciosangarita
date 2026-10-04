import java.util.Scanner;

public class promediohasta0 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double numero;

        System.out.println("Ingrese números para promediar (Introduzca 0 para terminar):");

        while (true) {
            numero = entrada.nextDouble();
            if (numero == 0) {
                break; // Rompe el ciclo inmediatamente si es cero
            }
            suma += numero;
            contador++; // Cuenta cuántos números válidos se ingresaron
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números para promediar.");
        }
    }
}
