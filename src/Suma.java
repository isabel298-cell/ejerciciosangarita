import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero ");
        int n, suma=0;
        n= entrada.nextInt();
        for (int i=1;i<=n;i++){
            suma= suma+i;
            System.out.println(" la suma de los numeros es : " + suma);
        }
    }
}
