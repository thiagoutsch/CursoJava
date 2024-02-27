package exercicios;
import java.util.Locale;

public class exercicio002 {
    public static void main(String[] args) {
        double largura = 10.0;
        double comprimeto = 30.0;
        double metro = 200.0;

        Locale.setDefault(Locale.US);

        double area = largura * comprimeto;
        double preco = area * metro;

        System.out.printf("A area do terreno é: %.2f %n", area);
        System.out.printf("O preço do terreno é: %.2f", preco);

    }
}
