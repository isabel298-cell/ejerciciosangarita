import java.util.Scanner;

public class valora {
    public static void main(String[] args) {
        //Cree un programa que tome un número real e imprima su valor absoluto.
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese un numero ");
        double numero = entrada.nextInt();
        if (numero>=0){
            System.out.println(" su valor absoluto es : " + numero);

        }else {
            double multiplicacion = numero*-1;
            System.out.println(" su valor absoluto es : " + multiplicacion);
        }
    }
}
