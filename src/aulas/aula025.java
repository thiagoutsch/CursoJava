package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aula025 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco"); //adiciona marco na 2 posição da lista

        System.out.println(list.size()); // tamanho da lista


        for (String x : list) {
            System.out.println(x);  // IMPRIMINDO A LISTA COMPLETA
        }

        System.out.println("-----------------------------");

        list.remove("Ana"); // REMOVE ANA
        list.remove(0); //REMOVE MARIA
        list.removeIf(x -> x.charAt(0) == 'M'); //REMOVE MARIA E MARCO POIS AMBOS COMEÇAM COM M

        for (String x : list) {
            System.out.println(x);   //IMPRIMINDO A LISTA NOVAMENTE DPS DAS REMOÇÕES
        }

        System.out.println("----------------------------------");

        System.out.println("Index of Alex: " + list.indexOf("Alex")); //COLOCAÇAO DO ALEX NA LISTA (LEMBRANDO QUE SÓ TEM ELE E O BOB NA LISTA AGORA)
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //COLOCAÇAO DO BOB NA LISTA (LEMBRANDO QUE SÓ TEM ELE E O ALEX NA LISTA AGORA)

        System.out.println("----------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for (String x : result) {
            System.out.println(x);   //IMPRIMINDO A LISTA NOVAMENTE DPS DAS REMOÇÕES
        }

        System.out.println("----------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null); //Encontra primeiro nome com a letra B, se nao tivesse retornava null.
        System.out.println(name);
    }
}
