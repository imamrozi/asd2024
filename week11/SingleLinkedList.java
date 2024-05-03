/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author Imam F
 */
public class SingleLinkedList {
    Node head;
    
    SingleLinkedList(){
        head = null;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(Node baru){
        if(isEmpty()){
            head = baru;
        }else{
            baru.next = head;
            head = baru;
        }
    }
    
    void addLast(Node baru){
        if(isEmpty()){
            head = baru;
        }else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = baru;
        }
    }
    
    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list sudah kosong!!");
        }else{
            head = head.next;
        }
    }
    
    void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list sudah kosong!!");
        }else{
            Node tmp = head;
            while(tmp.next.next != null){
                tmp = tmp.next;
            }
            tmp.next = null;
        }
    }
    
    void print(){
        if(isEmpty()){
            System.out.println("LInked list masih kosong!!");
        }else{
            Node tmp = head;
            while(tmp != null){
                System.out.print(""+tmp.data+" - ");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        System.out.println(""+sll.isEmpty());
        sll.print();
        sll.addFirst(new Node(13));
        sll.print();
        sll.addFirst(new Node(100));
        sll.print();
        sll.addLast(new Node(34));
        sll.print();
        //sll.removeFirst();
        sll.removeLast();
        sll.print();
        System.out.println("Data kedua = "+sll.head.next.data);
    }
}
