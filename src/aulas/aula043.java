package aulas;

import java.io.File;
import java.util.Scanner;

public class aula043 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //PEGANDO AS PASTAS DO CAMINHO c:\temp (tem q digitar esse caminho na saída)
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //PEGANDO OS ARQUIVOS TXT DO CAMINHO c:\temp (tem q digitar esse caminho na saída)

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        //CRIANDO SUBPASTA A PARTIR DA PASTA TEMP

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created with success: " + success);

        sc.close();
    }
}
