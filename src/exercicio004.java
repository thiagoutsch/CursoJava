
import java.util.Scanner;

public class exercicio004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        double conta = 50.00;
        
        if (min > 100){
            conta = conta + (min - 100) * 2;
        } 

        System.out.printf("O valor da conta é: %.2f", conta);



        sc.close();

    }
}
