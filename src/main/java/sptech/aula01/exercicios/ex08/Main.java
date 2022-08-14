package sptech.aula01.exercicios.ex08;

public class Main {
    public static void main(String[] args) {
        System.out.println(somaDigitos(3417));
    }

    public static int somaDigitos(int num) {
        return num % 10 != 0 ?  num % 10  + somaDigitos(num / 10) :  0;
    }
}
