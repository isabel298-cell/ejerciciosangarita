import java.util.Scanner;

public class sumacuadrados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = entrada.nextInt();

        int sumaCuadrados = 0;
        for (int i = 1; i <= n; i++) {
            sumaCuadrados += (i * i); // Multiplica i por sí mismo y lo suma
        }

        System.out.println("La suma de los cuadrados desde 1 hasta " + n + " es: " + sumaCuadrados);
    }
}

