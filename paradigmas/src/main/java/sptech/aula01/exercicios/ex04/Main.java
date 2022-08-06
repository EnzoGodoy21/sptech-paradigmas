package sptech.aula01.exercicios.ex04;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {7,3,5,2};
        System.out.println(contaImpares(vetor, 0, 0));
        System.out.println(contaImpares(vetor));
    }

    public static int contaImpares(int[] vetor){
        int ocurrencies = 0;
        for (int i : vetor) {
            if(i%2!=0){
                ocurrencies++;
            }
        }
        return ocurrencies;
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
