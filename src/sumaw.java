
import java.util.Scanner;

public class sumaw {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = entrada.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i; // Suma el valor actual de i
        }

        System.out.println("La suma de los primeros " + n + " números es: " + suma);
    }
}

