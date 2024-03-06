package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("dados da " + (i+1) + "a pessoa");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum = sum + alturas[i];
        }
        double mediaAlturas = sum/n;

        System.out.printf("Altura media: %.2f %n", mediaAlturas);

        int count = 0;
        for (int i=0; i<n; i++) {
            if(idades[i] <16) {
                count = count+1;
            }
        }

        double percent = count * 100.0 /n;

        System.out.printf("Pessoas com menos de 16: %.1f%% %n", percent);

        for (int i=0; i<n; i++) {
            if (idades[i] <16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
