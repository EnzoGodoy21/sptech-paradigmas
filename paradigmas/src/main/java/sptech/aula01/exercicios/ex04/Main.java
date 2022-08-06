package sptech.aula01.exercicios.ex04;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {7,3,5,2};
        System.out.println(contaImpares(vetor, 0, 0));
    }

    public static int contaImpares(int[] vetor, int i, int ocurrencies){
        if(i < vetor.length){
            if(vetor[i] % 2 != 0){
                return contaImpares(vetor, i + 1, ocurrencies + 1);
            }
        }
        return ocurrencies;
    }
}
