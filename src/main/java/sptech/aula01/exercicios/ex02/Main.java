package sptech.aula01.exercicios.ex02;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {7,3,5,2};
        System.out.println(somaVetor(vetor, 0));   
        System.out.println(somaVetor(vetor));   
    }

    public static int somaVetor(int[] vetor){
        int soma = 0;
        for (int i : vetor) {
            soma += i;
        }
        return soma;
    }

    public static int somaVetor(int[] vetor, int i){
        if(i < vetor.length){
            return vetor[i] + somaVetor(vetor, i + 1);
        }
        return 0;
    }
}
