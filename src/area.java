import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        //Cree un programa que tome la base y la altura de un triángulo e imprima su área.
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese base del triangulo ");
        double base = entrada.nextDouble();
        System.out.println(" ingres altura del triangulo ");
        double altura = entrada.nextDouble();
        double area = base*altura;
        System.out.println(" la area del triangulo es " + area);
    }
}
