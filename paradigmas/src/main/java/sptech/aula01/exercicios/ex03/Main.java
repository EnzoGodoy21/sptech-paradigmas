package sptech.aula01.exercicios.ex03;

public class Main {
    public static void main(String[] args) {
        int[] vetor = { 7, 5, 3, 2 , 4, 8};
        System.out.println(somaParesVetor(vetor, 0));
    }

    public static int somaParesVetor(int[] vetor, int i) {
        if(i < vetor.length){
            if(vetor[i]%2 == 0){
                return vetor[i] + somaParesVetor(vetor, i + 1);
            }
            return somaParesVetor(vetor, i + 1);
        }
        return 0;
    }
}
