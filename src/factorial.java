import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //Cree un programa que dado un número entero n, calcule su factorial(n!). Use ciclo for.
        Scanner entrada = new Scanner(System.in);
        int acumuladora=1;
        System.out.println("ingrese un numero");
        int n = entrada.nextInt();
        for (int i=1;i<=n;i++){
            acumuladora=acumuladora*i;
        } System.out.println(" el factorial del " + n + " es : " + acumuladora);
    }
    }

