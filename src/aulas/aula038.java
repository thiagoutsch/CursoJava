package aulas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class aula038 {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");
        
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Error opening file ");
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
