import java.util.Scanner;
import java.util.Locale;

public class exercicio003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;
        double notaf;

        System.out.println("Quanto você tirou na primeira prova? ");
        nota1 = sc.nextDouble();

        System.out.println("Quanto você tirou na segunda prova? ");
        nota2 = sc.nextDouble();

        notaf = nota1 + nota2;

        System.out.println("Sua nota final foi: " + notaf);

        if (notaf >= 60.0) {
            System.out.println("Aprovado");
        }else if (notaf < 60 && notaf >40) {
            System.out.println("Em recuperação");
        }else {
            System.out.println("Reprovado direto");
        }

        sc.close();
    }
}
