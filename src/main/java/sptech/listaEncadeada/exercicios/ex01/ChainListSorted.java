package sptech.listaEncadeada.exercicios.ex01;

import sptech.listaEncadeada.Node;

public class ChainListSorted {
    private Node head;

    public ChainListSorted() {
        this.head = new Node(0);
    }

    public void add(int value) {
        boolean added = false;
        Node newNode = new Node(value);
        Node previousNode = head;
        Node actualNode = head.getNext();
        while (actualNode != null && !added) {
            if (actualNode.getInfo() >= newNode.getInfo()) {
                previousNode.setNext(newNode);
                newNode.setNext(actualNode);
                added = true;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNext();
        }
        if (!added) {
            previousNode.setNext(newNode);
        }
    }

    public void show() {
        Node actualNode = head.getNext();
        while (actualNode != null) {
            System.out.println(actualNode.getInfo());
            actualNode = actualNode.getNext();
        }
    }

    public Node search(int value) {
        Node actualNode = head.getNext();
        while (actualNode != null) {
            // System.out.println("aN: " + actualNode.getInfo() + " v: " + value);
            if(actualNode.getInfo() > value) return null;
            if (actualNode.getInfo() == value) {
                return actualNode;
            }
            actualNode = actualNode.getNext();
        }
        return null;
    }

    public boolean remove(int value) {
        Node previousNode = this.head;
        Node actualNode = head.getNext();
        while (actualNode != null) {
            // System.out.println("aN: " + actualNode.getInfo() + " v: " + value);
            if(actualNode.getInfo() > value) return false;
            if (actualNode.getInfo() == value) {
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
        while (actualNode != null) {
            length++;
            actualNode = actualNode.getNext();
        }
        return length;
    }

}
