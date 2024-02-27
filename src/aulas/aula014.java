package aulas;
public class aula014 {
    public static void main(String[] args) {
        String s = "potato apple lemon";

        String[] vect = s.split(" "); //espaço dentro do split será o separador dos vetores,
                                            // logo, o vetor 0 ficara com potato, o 1 com apple e o 2 com lemon

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
