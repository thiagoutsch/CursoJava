package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exercicio005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;

        System.out.println("Digite as medidas do triangulo x: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y: ");
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();

        double p = (a + b + c) /2.0;
        double areaX = Math.sqrt(p*(p-a) * (p-b) * (p-c));

        p = (d + e + f) /2.0;
        double areaY = Math.sqrt(p*(p-d) * (p-e) * (p-f));

        System.out.printf("Area do Triangulo X: %.2f %n", areaX);
        System.out.printf("Area do Triangulo Y: %.2f %n", areaY);

        if (areaX > areaY) {
            System.out.println("A área do triangulo X é maior");
        }else {
            System.out.println("A área do triangulo Y é maior");
        }

        sc.close();

    }
}
