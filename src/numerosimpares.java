import java.util.Scanner;

public class numerosimpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = entrada.nextInt();

        System.out.println("Números impares entre 1 y " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Si el residuo de dividir entre 2 no es 0, es impar
                System.out.println(i);
            }
        }
    }
}