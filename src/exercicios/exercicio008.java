package exercicios;

import java.util.Locale;
import java.util.Scanner;

import classes.Convertor;

public class exercicio008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor Dolar: ");
        double dolares = sc.nextDouble();
        System.out.println("Quantos dolares vc quer converter? ");
        double valor = sc.nextDouble();
        double v = Convertor.conversao(dolares, valor);

        System.out.printf("Valor pago em reais: %.2f ", v);
        
        sc.close();

    }
}
