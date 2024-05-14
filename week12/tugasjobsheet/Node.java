package week12.tugasjobsheet;

public class Node {
    Book data;
    Node next, prev;
    public Node(){
    }
    public Node(Book b){
        data = b;
        next = prev = null;
    }
}
