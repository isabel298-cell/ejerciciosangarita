import java.util.Scanner;

public class promedio10 {
    public static void main(String[] args) {
        //Cree un programa que calcule el promedio de 10 números. Use ciclo for.
        double suma = 0;
        Scanner entrada = new Scanner(System.in);
  for (int i=1;i<=10;i++){
      System.out.println(" ingrese numero "+ i);
      int numero = entrada.nextInt();

      suma= suma+i;
  }
   double promedio = suma/10;

        System.out.println(" el promedio de los 10 numeros es " + promedio);
    }
}
