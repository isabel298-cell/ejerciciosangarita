import java.util.Scanner;

        public class iva {
            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);


                System.out.println("ingrese nombre del producto");
                String productos = entrada.nextLine();


                if (productos.equals("vino") || productos.equals("crema")) {
                    System.out.println("paga iva");
                }
                else if (productos.equals("lentejas") || productos.equals("arroz")) {
                    System.out.println("no paga iva");
                }
                else {

                    System.out.println("es invalido");
                }
            }
        }
