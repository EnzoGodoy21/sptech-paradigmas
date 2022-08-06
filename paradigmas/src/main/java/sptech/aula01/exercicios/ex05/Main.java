package sptech.aula01.exercicios.ex05;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {7,3,2,3};
        System.out.println(contaOccorencias(vetor, 0, 0, 3));        
        System.out.println(contaOccorencias(vetor, 3));        
    }

    public static int contaOccorencias(int[] vetor, int num){
        int ocurrencies = 0;
        for (int i : vetor) {
            if(i == num){
                ocurrencies++;
            }
        }
        return ocurrencies;
    }

    public static int contaOccorencias(int[] vetor, int i, int ocurrencies, int num){
        if(i < vetor.length){
            if(vetor[i] == num){
                return contaOccorencias(vetor, i + 1, ocurrencies + 1, num);
            }else{
                return contaOccorencias(vetor, i + 1, ocurrencies, num);
            }
        }
        return ocurrencies;
    }

}
