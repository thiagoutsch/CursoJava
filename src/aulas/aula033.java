package aulas;

import classes.Conta;
import classes.ContaEmpresa;
import classes.ContaPoupanca;

public class aula033 {
    public static void main(String[] args) {
        Conta acc = new Conta(1001, "Alex", 0.0);
        ContaEmpresa bacc = new ContaEmpresa(1002, "Maria", 0.0, 500.0);
        
        //UPCASTING

        Conta acc1 = bacc;
        Conta acc2 = new ContaEmpresa(1003, "Bob", 0.0, 200.0);
        Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        ContaEmpresa acc4 = (ContaEmpresa) acc2;
        acc4.loan(100.0);

        //ContaEmpresa acc5 = (ContaEmpresa) acc3;
        if (acc3 instanceof ContaEmpresa) {
            ContaEmpresa acc5 = (ContaEmpresa) acc3;
            acc5.loan(200.0);
            System.out.println("Loan! ");
        }

        if (acc3 instanceof ContaPoupanca) {
            ContaPoupanca acc5 = (ContaPoupanca) acc3;
            acc5.updateBalance();
            System.out.println("Update! ");
        }

    }
}
