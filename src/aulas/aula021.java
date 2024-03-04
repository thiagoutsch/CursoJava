package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.Produto3;

public class aula021 {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Produto3 product = new Produto3 (name, price);

        product.setName ("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

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

