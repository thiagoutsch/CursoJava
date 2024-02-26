public class aula013 {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();   // tudo minusculo
        String s02 = original.toUpperCase();   // tudo maiusculo
        String s03 = original.trim();          // elimina espaços do começo e do final da string
        String s04 = original.substring(4);  // elimina todos as (*4*) primeiras letras da string
        String s05 = original.substring(2, 9); // letras da string que estao entre o caractere 2 e 9 (sem contar o proprio 2 e o proprio 9)
        String s06 = original.replace('a', 'x'); // troca todos os 'a' por 'x'
        String s07 = original.replace("abc", "xy");  //troca todos 'abc' por 'xy'

        int i = original.indexOf("bc");  //primeira vez que aparece o caractere "bc" juntos, ou seja no caractere 1 (o "a" é 0, o bc vem logo em seguida)
        int j = original.lastIndexOf("bc"); //ultima vez que aparece o caractere "bc" juntos, ou seja no caractere 17 (no penultimo conjunto de letras)


        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");  
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring (4): -" + s04 + "-");
        System.out.println("substring (2, 9): -" + s05 + "-");
        System.out.println("Replace ('a','x'): -" + s06 + "-");
        System.out.println("Replace ('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of bc: -" + i + "-");
        System.out.println("Last index of bc: -" + j + "-");
    }
}
