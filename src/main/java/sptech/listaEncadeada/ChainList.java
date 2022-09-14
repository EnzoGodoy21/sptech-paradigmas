package sptech.listaEncadeada;

public class ChainList {
    private Node head;

    public ChainList() {
        this.head = new Node(0);
    }

    public void add(int value){
        Node newNode = new Node(value);
        newNode.setNext(head.getNext());
        this.head.setNext(newNode);
    }

    public void show(){
        Node actualNode = head.getNext();
        while(actualNode != null){
            System.out.println(actualNode.getInfo());
            actualNode = actualNode.getNext();
        }
    }

    public Node search(int value) {
        Node actualNode = head.getNext();
        while(actualNode != null){
            if(actualNode.getInfo() == value){
                return actualNode;
            }
            actualNode = actualNode.getNext();
        }
        return null;
    }

    public boolean remove(int value){
        Node previousNode = this.head;
        Node actualNode = head.getNext();
        while(actualNode != null) {
            if(actualNode.getInfo() == value){
                previousNode.setNext(actualNode.getNext());
                return true;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNext();
        }
        return false;
    }

    public int length() {
        int length = 0;
        Node actualNode = head.getNext();
        while(actualNode != null) {
            length++;
            actualNode = actualNode.getNext();
        }
        return length;
    }

    public void join(ChainList newList){
        Node actualNode = this.head.getNext();
        while(actualNode != null){
            actualNode = actualNode.getNext();
        }
        actualNode = newList.getHead().getNext();
        while(actualNode != null){
            add(actualNode.getInfo());
            actualNode = actualNode.getNext();
        }
    }

    public Node getHead() {
        return head;
    }
}
