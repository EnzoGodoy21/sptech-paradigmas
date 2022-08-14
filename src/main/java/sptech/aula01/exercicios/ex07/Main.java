package sptech.aula01.exercicios.ex07;

public class Main {

    public static void main(String[] args) {
        int[] vetor = { 1, 3, 7, 5, 4, 6 };
        System.out.println(verificarMaiorNum(vetor, 0));
        System.out.println(verificarMaiorNum(vetor));
    }
    
    public static int verificarMaiorNum(int[] vetor){
        int max = Integer.MIN_VALUE;
        for (int i : vetor) {
            if(i > max) max = i;
        }
        return max;
    }

    public static int verificarMaiorNum(int[] v, int i){
        int max = 0;
        if(i < v.length){
            if(v[i] > verificarMaiorNum(v, i + 1)){
                return v[i];
            }
            max = verificarMaiorNum(v, i + 1);
        }
        return max;
    }
}
