package sptech.aula01.exercicios.ex01;

public class Main {
    public static void main(String[] args) {
        System.out.println(somaRecursiva(5));
    }

    public static int somaRecursiva(int n) {
        if(n == 0){
            return n;
        }
        return n + somaRecursiva(n - 1);
    }
}
