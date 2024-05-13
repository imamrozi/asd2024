package week11.tugasjobsheets;

public class SLL {
    NodeSLL head;
    int size;
    public SLL(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void print(){
        if(isEmpty())
            System.out.println("SLL kosong!!!");
        else{
            NodeSLL tmp = head;
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }
    public void addFirst(MahasiswaSLL mhs){
        NodeSLL newNode = new NodeSLL(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void addLast(MahasiswaSLL mhs){
        NodeSLL newNode = new NodeSLL(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            NodeSLL tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }
    public void insertAfter(String afterNim, MahasiswaSLL mhs){
        if(isEmpty()){
            addFirst(mhs);
        }else{
            NodeSLL tmp = head;
            while(tmp!=null){
                if(tmp.data.nim.equalsIgnoreCase(afterNim)){
                    NodeSLL newNode = new NodeSLL(mhs);
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    size++;
                    break;
                }else{
                    tmp = tmp.next;
                }
            }
        }
    }
    public void insertAt(int idx, MahasiswaSLL mhs){
        if(isEmpty()||idx==0){
            addFirst(mhs);
        }else if(idx==size){
            addLast(mhs);
        }else{
            NodeSLL tmp = head;
            for(int i=0; i<idx-1;i++){
                tmp = tmp.next;
            }
            NodeSLL newNode = new NodeSLL(mhs);
            newNode.next = tmp.next;
            tmp.next = newNode;
            size++;
        }
    }
}
