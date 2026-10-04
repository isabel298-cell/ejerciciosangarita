import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Cree un programa que lea los tres ángulos internos de un triángulo y muestre si los ángulos corresponden a un
//triángulo o no
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese angulo 1");
        double angulo1= entrada.nextDouble();
        System.out.println("ingrese angulo 2");
        double angulo2= entrada.nextDouble();
        System.out.println("ingrese angulo 3");
        double angulo3= entrada.nextDouble();
        double suma = angulo1+angulo2+angulo3;
        if (suma == 180){
            System.out.println(" los angulos corresponden a un triangulo");

        }else {
            System.out.println(" los angulos no corresponden a un triangulo ");
        }
    }
}