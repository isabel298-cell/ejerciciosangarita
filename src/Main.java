import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Cree un programa que lea la edad de un usuario y muestre cuántos años tendrá el usuario dentro
//de tantos años como éste indique. Por ejemplo, si el usuario tiene 20 años y quiere saber cuántos años tendrá
//dentro de 15 años, el programa deberá mostrar que tendrá 35 años.//
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese su edad ");
        int edad = entrada.nextInt();
        System.out.println(" ingrese años futuro ");
        int añosf = entrada.nextInt();
        int suma = edad+añosf;
        System.out.println(" su edad en " + añosf + " años sera " + suma);
    }
}