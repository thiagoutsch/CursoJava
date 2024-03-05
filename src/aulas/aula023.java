package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.Produto4;

public class aula023 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto4[] vect = new Produto4[n];

        for (int i=0; i<n; i++) {  // no lugar de i<n pode colocar
                                   // i<vect.lenght
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produto4(name, price);
        }

        double sum = 0.0;
        for(int i=0; i<n; i++){
            sum+=vect[i].getPrice();
        }

        double avg = sum/n;

        System.out.printf("AVERAGE PRICE= %.2f ", avg);

        sc.close();
    }
}
