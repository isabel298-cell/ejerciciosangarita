import java.util.Scanner;

public class suma2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese N1");
        int n1= entrada.nextInt();
        System.out.println(" ingrese N2");
        int n2 = entrada.nextInt();
        int suma = 0;
        for (int i=n1;i<=n2;i++){
             suma = suma+i;

        } System.out.println(" la suma del numero " + n1 + " y " + n2  + " es : " + suma);
    }
}
