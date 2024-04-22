package week9;

public class Queue {
    int[] data;
    int front, rear, max;
    
    public Queue(int n){
        max = n;
        data = new int[max];
        front = rear = -1;
    }
    public void clear(){
        front = rear = -1;
    }
    private int getSize(){
        if (rear==-1)
            return 0;
        else{
           if(rear>=front){
                return (rear-front+1);
            }else{
                return (max+rear-front+1);
            }
        }
    }
    private boolean isFull(){
        if(getSize()==max)
            return true;
        else
            return false;
    }
    private boolean isEmpty(){
        if(getSize()==0)
            return true;
        else
            return false;
    }
    public void print(){
        if(isEmpty())
            System.out.println("Queue Kosong!");
        else{
            int i=front;
            while(i!=rear){
                System.out.print(""+data[i]+", ");
                i=(i+1)%max;
            }
            System.out.println(""+data[i]);
        }
    }
    public void enqueue(int in){
        if(isFull())
            System.out.println("Queue Full!");
        else{
            if(isEmpty()){
                front=rear=0; 
            }else if(rear<max-1){
                rear++;  
            }else if(rear==max-1){
                rear=0;
            }
            data[rear]=in;
            System.out.println("Data "+in+" masuk di index "+rear);    
        }
    }
    public int dequeue(){
        int out = 0;
        if(isEmpty()){
            System.out.println("Queue Kosong!");
        }else{
            out = data[front];
            if(front==rear)
                front=rear=-1;
            else if(front<max-1)
                front++;
            else if(front==max-1)
                front=0;
        }
        return out;
    }
    public void trace(){
        System.out.println("Front "+front);
        System.out.println("Rear "+rear);
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.print();
        q.enqueue(23);
        q.print();
        q.enqueue(2);
        q.enqueue(30);
        q.enqueue(231);
        q.enqueue(10);
        q.print();
        q.enqueue(12);
        q.print();
        System.out.println(""+q.dequeue()+" keluar dari queue");
        q.print();
        System.out.println(""+q.dequeue()+" keluar dari queue");
        q.print();
        q.enqueue(15);
        q.print();
        q.enqueue(12);
        q.print();
        System.out.println(""+q.dequeue()+" keluar dari queue");
        q.print();
    }
}
