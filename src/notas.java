import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, n;
        System.out.println(" ingrese la cantidad de estudiantes ");
        n = entrada.nextInt();
        for (i=1;i<=n;i++){
            double suma = 0;
            for (int j=1;j<=3;j++){
                System.out.println(" ingrese la nota " + j + " del estudiante " + i + " : ");
                double nota = entrada.nextDouble();
                suma = suma+nota;
            } double promedio = suma/3;
            System.out.println(" el promedio del estudiante " + i + " es : " + promedio);



        }
    }
}
