package sptech.aula01.exercicios.ex09;

public class Main {
    public static void main(String[] args) {
       System.out.println(intParaBinario(12));
    }

    public static String intParaBinario(Integer n){
        return n/2 == 0 ? Integer.toString(n%2) : intParaBinario(n/2) + Integer.toString(n%2);
    }
}
