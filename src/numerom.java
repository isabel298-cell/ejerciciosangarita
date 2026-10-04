import java.util.Scanner;

public class numerom {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Cree un programa que reciba dos números y muestre el mayor. En caso de que los números sean iguales
        //también se debe mostrar al usuario.
        System.out.println(" ingrese numero 1");
        int n1 = entrada.nextInt();
        System.out.println(" ingrese numero 2");
        int n2 = entrada.nextInt();
        if (n1>n2){
            System.out.println(" el numero mayor es " + n1);

        } else if (n2>n1) {
            System.out.println(" el numero mayor es " + n2);

        } else {
            System.out.println(" los numeros son iguales");
        }
    }
}
