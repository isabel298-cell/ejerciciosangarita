import java.util.Scanner;

public class promedioo10numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;

        System.out.println("Ingrese 10 números:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            suma += entrada.nextDouble();
        }

        double promedio = suma / 10;
        System.out.println("El promedio de los 10 números es: " + promedio);
    }
}


