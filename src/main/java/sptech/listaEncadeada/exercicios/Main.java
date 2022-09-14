package sptech.listaEncadeada.exercicios;

import sptech.listaEncadeada.exercicios.ex01.ChainListSorted;

public class Main {
    public static void main(String[] args) {
        ChainListSorted list = new ChainListSorted();

        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(7);


        list.show();

        // Search for a number higher than the list has and a existing number (the debug is commented on ChainListSorted line 42)
        System.out.println("-".repeat(10)); // Separator between tests

        System.out.println(list.search(6));

        System.out.println(list.search(1));

        // Removing a number from the list (the debug is commented on ChainListSorted line 42)
        System.out.println("-".repeat(10)); // Separator between tests

        list.remove(2);

        list.remove(2);

        list.show();
    }
}
