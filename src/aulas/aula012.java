package aulas;
import java.util.Scanner;

public class aula012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 32;   //numero que tem apenas o 6 bit valendo 1, pode declarar de modo binario tb (0b00100000)
                         // o 0b na frente é pra declarar que vem um número binário, e os 8 numeros dps é o 32 em binário 
        int n = sc.nextInt();

        if ((n & mask) !=0) {
            System.out.println("6th bit is true");
        } else {
            System.out.println("6th bit is false!");
        }

        sc.close();
    }
}
