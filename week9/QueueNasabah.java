package week9;

public class QueueNasabah {
    Nasabah[] data;
    int front, rear, max;
    
    public QueueNasabah(int n){
        max = n;
        data = new Nasabah[max];
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
                data[i].print();
                i=(i+1)%max;
            }
            data[i].print();
        }
    }
    public void enqueue(Nasabah in){
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
    public Nasabah dequeue(){
        Nasabah out = null;
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
        QueueNasabah q = new QueueNasabah(5);
        q.print();
        q.enqueue(new Nasabah("N1", "Nasabah 1", "Malang", 38, 5000));
        q.print();
        q.enqueue(new Nasabah("N2", "Nasabah 2", "Malang", 48, 50000));
        q.enqueue(new Nasabah("N3", "Nasabah 3", "Malang", 37, 14000));
        q.enqueue(new Nasabah("N4", "Nasabah 4", "Malang", 40, 11000));
        q.enqueue(new Nasabah("N5", "Nasabah 5", "Malang", 68, 15600));
        q.print();
        q.enqueue(new Nasabah("N6", "Nasabah 6", "Malang", 68, 15600));
        q.print();
        System.out.println("Nasabah keluar dari queue");
        q.dequeue().print();
        System.out.println("Nasabah keluar dari queue");
        q.dequeue().print();

        System.out.println("Data Nasabah dalam Queue saat ini:");
        q.print();
    }
}
