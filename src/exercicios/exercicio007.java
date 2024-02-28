package exercicios;

import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;

public class exercicio007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.println("Name: ");
        func.name = sc.nextLine();

        System.out.println("Salario Grosso: ");
        func.salarioBruto = sc.nextDouble();

        System.out.println("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + func);

        System.out.println("Qual porcentagem para aumentar o salario?");
        double porcentagem = sc.nextDouble();
        func.porcentagem(porcentagem);

        System.out.println();
        System.out.println("Update: " + func);
        
        sc.close();
    }
}
