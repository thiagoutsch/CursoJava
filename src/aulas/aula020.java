package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.Produto2;

public class aula020 {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Produto2 product = new Produto2 (name, price);


        System.out.println(); //pular linha
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the numbers of products to be added in stock: " );
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the numbers of products to be removed in stock: " );
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();

    }
}

