package sptech.aula01.exercicios.ex06;

public class Main {
    public static void main(String[] args) {
        System.out.println(encontrarMaxDivComum(90,54));
        System.out.println(encontrarMaxDivComumIterativo(90,54));
    }

    public static int encontrarMaxDivComumIterativo(int dividendo, int divisor){
        int resto = dividendo%divisor;
        while (resto != 0) {
            dividendo = divisor;
            divisor = resto;
            resto = dividendo%divisor;
        }
        return divisor;
    }

    public static int encontrarMaxDivComum(int dividendo, int divisor){
        int resto = dividendo%divisor;
        if(resto == 0){
            return divisor;
        }
        return encontrarMaxDivComum(divisor,resto);
    }
}
