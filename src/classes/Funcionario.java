package classes;

public class Funcionario {
    public String name;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void porcentagem(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return name + ", $" + salarioLiquido();
    }
}


