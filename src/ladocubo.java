import java.util.Scanner;

public class ladocubo {
    public static void main(String[] args) {
        //Cree un programa que tome el lado de un cubo e imprima su volumen.
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese el lado de un cubo ");
        int lado = entrada.nextInt();
        int volumen = lado*lado*lado;
        System.out.println(" el volumen del cubo es " + volumen);
    }
}
