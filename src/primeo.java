//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = entrada.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}



