package sptech.aula01.exercicios.ex06;

public class Main {
    public static void main(String[] args) {
        System.out.println(encontrarMaxDivisorComum(90,54));
    }

    public static int encontrarMaxDivisorComum(int dividendo, int divisor){
        int resto = dividendo%divisor;
        if(resto == 0){
            return divisor;
        }
        return encontrarMaxDivisorComum(divisor,resto);
    }
}
