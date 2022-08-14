package sptech.aula01.exercicios.ex08;

public class Main {
    public static void main(String[] args) {
        System.out.println(somaDigitos(3417));
        System.out.println(somaDigitosIterativo(3417));
    }

    public static int somaDigitosIterativo(int num) {
        int resto = num % 10;
        int soma = 0;
        while(resto != 0){
            num /=  10;
            soma += resto;
            resto = num % 10;
        }
        return soma;
    }

    public static int somaDigitos(int num) {
        return num % 10 != 0 ?  num % 10  + somaDigitos(num / 10) :  0;
    }
}
