package sptech.aula03.ex01;

public class Main {
    public static void main(String[] args) {
        DuasPilhas stack = new DuasPilhas<>(6);
        int[] array = { 1, -5, 3, 7, -10, -1 };
        for (int i : array) {
            if (i < 0) {
                stack.push(1, i);
            } else {
                stack.push(2, i);
            }
        }

        while (!stack.isEmpty(1)) {
            System.out.println(stack.pop(1));
        }
        while (!stack.isEmpty(2)) {
            System.out.println(stack.pop(2));
        }

    }
}
