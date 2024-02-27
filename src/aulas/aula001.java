package aulas;
import java.util.Locale;
// locale, concatenação e %
public class aula001 {
    public static void main(String[] args) throws Exception {
        int y = 32;
        double x = 10.2356;
        String nome = "Thiago";
        int idade = 22;
        double renda = 0.00;

        System.out.println("Hello, World!");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.println("Resultado= " + x + "metros");
        System.err.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
