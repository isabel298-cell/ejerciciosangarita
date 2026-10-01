import java.util.Scanner;

public class Valorp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //En un almacén de electrodomésticos se venden éstos a crédito y de contado. Si el cliente compra a crédito, el
        //valor global del electrodoméstico aumenta en un 25%. Cree un programa que lea del usuario el precio de un
        //electrodoméstico y el plazo en meses para pagarlo a crédito y muestre al usuario el valor fijo de las cuotas
        //mensuales que deberá pagar por el electrodoméstico.
        System.out.println(" ingrese precio del electrodomestico ");
        double precio = entrada.nextDouble();
        System.out.println(" ingrese el plazo de meses para pagarlo ");
        double plazom= entrada.nextDouble();
        double aumento= precio * 0.25;
        double preciof= aumento+precio;
        double cuota = preciof/plazom;
        System.out.println(" su precio final sera de : " + preciof + " y su valor fijo de cuotas sera " + cuota);

    }
            }
