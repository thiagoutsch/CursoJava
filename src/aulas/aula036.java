package aulas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aula036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid position");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }


        System.out.println("End of program ");

        sc.close();
    }
}
