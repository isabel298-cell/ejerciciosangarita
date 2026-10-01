import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        for (int i=1;i<=5;i++){
            System.out.println(" ingrese numero  " + i);
            int numero= entrada.nextInt();
            suma=suma+numero;

        } int promedio = suma/5;
        System.out.println( " el promedio de los 5 numeros es : " + promedio);

    }
}
