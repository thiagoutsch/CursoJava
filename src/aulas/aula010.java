package aulas;
import java.util.Scanner;
import java.util.Locale;

public class aula010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resp;

        do {
        
        System.out.println("Digite a temperatura em Celsus: ");
        double temp = sc.nextDouble();
        
        
        double fah;

        fah = (9.0*temp) / 5 + 32;

        System.out.printf("Equivalente em Fahrenheit: %.2f %n", fah);

        System.out.println("Deseja repetir? "); 
        resp = sc.next().charAt(0);  

        } while (resp != 'n');    



        sc.close();
    }
}
