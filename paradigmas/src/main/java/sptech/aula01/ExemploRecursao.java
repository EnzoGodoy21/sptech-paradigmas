package sptech.aula01;

public class ExemploRecursao {

    public static void main(String[] args) {
        contagemRegressiva(10);
        contagemRecursiva(10);
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
}
