import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        //Cree un programa que lea un número entre 1 y 15 y muestre si éste es primo o no.
        Scanner entrada = new Scanner(System.in);
    int numero=0;
        for (int i=1;i<=15;i++){
            System.out.println(" ingrese un numero del 1 al 15");
            numero = entrada.nextInt();
            if(numero>=15){
                System.out.println(" numero invalido " );
            } if (numero==2||numero==3||numero==5||numero==7||numero==11||numero==13){
                System.out.println("el " + numero + " es un numero primo ");
            }else {
                System.out.println(" no es un numero primo");

            }
        }
    }            }
