package exercicios;
import java.util.Locale;
//exercicios de fixação
public class exercicio001 {
    public static void main(String[] args) throws Exception {
        
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double masure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.err.printf("%s, which price is $ %.2f %n", product2, price2);

        System.err.printf("RECORD: %d years old, code %d and gender: %s %n", age, code, gender);

        System.err.printf("Measure with eight decimal places: %.8f %n", masure);
        System.err.printf("Measure with three decimal places: %.3f %n", masure);
        Locale.setDefault(Locale.US);
        System.err.printf("US decimal point: %.3f", masure);

    }
}
