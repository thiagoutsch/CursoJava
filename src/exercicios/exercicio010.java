package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for(int i=0; i<n; i++) {
            if(vet[i]<0) {
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
