package sptech.aula01.exercicios.ex01;

public class Main {
    public static void main(String[] args) {
        System.out.println(somaRecursiva(5));
        System.out.println(somaIterativa(5));
    }

    public static int somaIterativa(int n){
        int soma = 0;
        for (int i = n; i >= 0; i--) {
            soma += i;
        }
        return soma;
    }

    public static int somaRecursiva(int n) {
        if(n == 0){
            return n;
        }
        return n + somaRecursiva(n - 1);
    }
}
