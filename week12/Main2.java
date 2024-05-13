package asd2024.week12;

public class Main2 {
    public static void main(String[] args) {
        Node2P node1 = new Node2P(10);
        Node2P node2 = new Node2P(20);
        Node2P node3 = new Node2P(30);

        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;

        System.out.println("Data node 1 = "+node1.data);
        System.out.println("Data node 2 = "+node1.next.data);
        System.out.println("Data node 3 = "+node1.next.next.data);
        System.out.println("Data node 1 = "+node3.data);
        System.out.println("Data node 2 = "+node3.prev.data);
        System.out.println("Data node 3 = "+node3.prev.prev.data);

        node1.next = node3;
        node3.prev = node1;

        node1.next = node1.next.next;
        node1.next.next.prev = node1;
    }
}
