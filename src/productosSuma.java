import java.util.Scanner;

public class productosSuma {
    public static void main(String[] args) {
        //Cree un programa que lea dos números y muestre su producto, su cociente, su suma y su resta//
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese numero 1 ");
        int n1= entrada.nextInt();
        System.out.println(" ingrese numero 2 ");
        int n2 = entrada.nextInt();
        int multiplicacion= n1+n2;
        int division = n1/n2;
        int suma= n1+n2;
        int resta = n1-n2;
        System.out.println(" la multiplicacion de los numeros es : " + multiplicacion);
        System.out.println(" la division de los  numeros es : " + division);
        System.out.println(" la suma de los numeros es : " + suma);
        System.out.println(" la resta de los  numeros es : " + resta);
    }
}
