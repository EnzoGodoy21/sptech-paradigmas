package sptech.DoubleStack;

public class DoubleStack<T> {
    private T[] stack;
    private int top1;
    private int top2;

    public DoubleStack(int length) {
        this.stack = (T[]) new Object[length];
        this.top1 = -1;
        this.top2 = length;
    }

    public DoubleStack() {
        this.stack = (T[]) new Object[10];
    }

    public void push(int stack, T element) {
        if (!isFull()) {
            switch (stack) {
                case 1:
                    this.stack[++top1] = element;
                    break;

                case 2:
                    this.stack[--top2] = element;
                    break;

                default:
                    throw new IllegalArgumentException("Stack must be 1 or 2");
            }
        } else {
            throw new IllegalStateException("Stack is full");
        }
    }

    public T pop(int stack) {
        if (isEmpty(stack)) {
            throw new IllegalStateException("Stack is empty");
        }
        switch (stack) {
            case 1:
                return this.stack[top1--];

            case 2:
                return this.stack[top2++];

            default:
                throw new IllegalArgumentException("Stack must be 1 or 2");
        }
    }

    public T peek(int stack) {
        switch (stack) {
            case 1:
                return this.stack[top1];
            case 2:
                return this.stack[top2];
            default:
                throw new IllegalArgumentException("Stack must be 1 or 2");
        }
    }

    public boolean isEmpty(int stack) {
        switch (stack) {
            case 1:
                return this.top1 == -1;

            case 2:
                return this.top2 == this.stack.length;

            default:
                throw new IllegalArgumentException("Stack must be 1 or 2");
        }
    }

    public boolean isFull() {
        return this.top1 == this.top2 - 1;
    }

    public int length() {
        return this.stack.length;
    }

    public void show() {
        for (T t : stack) {
            System.out.println(t);
        }
    }
}
