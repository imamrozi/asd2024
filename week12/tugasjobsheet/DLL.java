package week12.tugasjobsheet;

public class DLL {
    Node head;
    public DLL(){
        head = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void print(){
        if(isEmpty())
            System.out.println("Stack is still empty!!");
        else{
            //moving tmp from bottom to top
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            //start printing
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.prev;
            }
        }
    }
    void addLast(Book newBook){
        Node newNode = new Node(newBook);
        if(isEmpty()){
            head = newNode;
        }else{
            //traverse
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.prev = tmp;
        }
    }
    void removeLast(){
        if(isEmpty()){
            System.out.println("Stack is empty!!");
        }else{
            //traverse
            Node tmp = head;
            while(tmp.next.next!=null){
                tmp = tmp.next;
            }
            tmp.next.prev = null;
            tmp.next = null;
        }
    }

    Book peek(){
        Book book = null;
        Node tmp = head;
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        book = tmp.data;
        return book;
    }
}
