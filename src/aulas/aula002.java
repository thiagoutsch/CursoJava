package aulas;
import java.util.Scanner;
//scanner
public class aula002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        //next() = String
        //nextInt() = número inteiro    
        //nextDouble = número float
        //next().charAt(0) = char (uma letra -> primeira)
        
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou: " + y);
        System.out.println("Você digitou: " + z);

        sc.close();
    }
}
