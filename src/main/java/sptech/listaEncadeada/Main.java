package sptech.listaEncadeada;

public class Main {
    public static void main(String[] args) {
        ChainList list = new ChainList();

        // List of numbers that go from 1 to 5
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.show();

        // Search and remove the number 3 of the ChainList
        System.out.println("-".repeat(10)); // Separator between tests
        
        System.out.println(list.search(3));
        
        list.remove(3);
        
        list.show();
        
        // Add new node to the ChainList
        System.out.println("-".repeat(10)); // Separator between tests

        list.add(6);

        list.show();

        // Join between two ChainList instances
        System.out.println("-".repeat(10)); // Separator between tests

        ChainList list2 = new ChainList();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        list.join(list2);

        list.show();
    }
}
