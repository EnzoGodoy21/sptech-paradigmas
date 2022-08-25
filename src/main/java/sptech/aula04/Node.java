package sptech.aula04;

public class Node {
    private int info;
    private Node next;

    public Node(int info) {
        this.info = info;
        this.next = null;
    }


    //GETTERS E SETTERS
    public int getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    

}
