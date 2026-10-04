import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        //Cree un programa que lea un número y muestre si este es par o impar.
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese un numero");
        int numero = entrada.nextInt();
        if (numero%2==0){
            System.out.println(" el numero " + numero + " es par");
        }else {
            System.out.println(" el numero " + numero + " es impar ");
        }
    }
}
