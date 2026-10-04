import java.util.Scanner;

public class divisble5 {
    public static void main(String[] args) {
        //Cree un programa que lea un número y muestre si este es divisible entre cinco o no.
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese un numero ");
        int numero = entrada.nextInt();
        if (numero%5==0){
            System.out.println(" el numero " + numero + " es divisible entre 5 ");

        }else {
            System.out.println(" el numero " + numero + " no es divisible entre 5");
        }
    }
}
