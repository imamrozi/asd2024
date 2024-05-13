package asd2024.week12;

public class DLL {
    Node2P head, tail;
    int size;
    public DLL(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        //return head==null;
        return size==0;
    }
    int getSize(){
        return size;
    }
    void addFirst(Node2P input){
        if(isEmpty()){
            head = tail = input;
        }else{
            input.next = head;
            head.prev = input;
            head = input;
        }
        size++;
    }
    void addLast(Node2P input){
        if(isEmpty()){
            head = tail = input;
        }else{
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size++;
    }
    void print(){
        Node2P tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+" - ");
            tmp = tmp.next;
        }
        System.out.println();
        //System.out.print(""+tmp.data+" - ");
    }
}
