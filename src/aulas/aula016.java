package aulas;
//classes
import java.util.Scanner;
import classes.Triangle;
import java.util.Locale;

public class aula016 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) /2.0;
        double areaX = Math.sqrt(p*(p-x.a) * (p-x.b) * (p-x.c));

        p = (y.a + y.b + y.c) /2.0;
        double areaY = Math.sqrt(p*(p-y.a) * (p-y.b) * (p-y.c));

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

