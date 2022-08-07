package sptech.aula01;

public class ExemploRecursao {

    public static void main(String[] args) {
        contagemRegressiva(10);
        contagemRecursiva(10);
        System.out.println("Fatorial" + fatorial(5));

        int[] vetor = {10,20,30,40,50,60,70,80,90,100};
        exibeVetor(vetor, 0);
        exibeVetorInverso(vetor, 0);
    }

    public static void contagemRegressiva(int n){
        for (int i = n; i >= 0; i--) {
            System.out.println("Regressiva: " + i);
        }
    }

    public static void contagemRecursiva(int n){
        if(n >= 0){
            System.out.println("Recursiva: " + n--);
            contagemRecursiva(n);
        }
    }

    public static int fatorial(int n){
        if(n == 0){
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void exibeVetor(int [] vetor, int i){
        if(i < vetor.length){
            System.out.println(vetor[i]);
            exibeVetor(vetor, i + 1);
        }
    }

    public static void exibeVetorInverso(int [] vetor, int i){
        if(i < vetor.length){
            exibeVetorInverso(vetor, i + 1);
            System.out.println(vetor[i]);
        }
    }

}
