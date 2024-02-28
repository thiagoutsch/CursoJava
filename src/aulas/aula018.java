package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.Calculadora;

public class aula018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Raio: ");
        double raio = sc.nextDouble();

        double c = Calculadora.circunferencia(raio);
        double v = Calculadora.volume(raio);

        System.out.printf("Circumferencia: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("Valor do PI: %.2f %n", Calculadora.PI);


        sc.close();
    }
}
