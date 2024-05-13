package asd2024.week12;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(new Node2P(34));
        dll.print();
        dll.addFirst(new Node2P(14));
        dll.print();
        System.out.println("Size = "+dll.getSize());
        dll.addLast(new Node2P(112));
        dll.print();
    }
    
}
