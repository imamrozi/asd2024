package week3;

public class Handphone {
    String brand;
    String price;
    Processor proc[] = new Processor[2];

    public static void main(String[] args) {
        Processor p1 = new Processor("Intel i7", 124, 4);
        Processor p2 = new Processor("Intel i5", 256, 2);
        Handphone hp = new Handphone();
        hp.proc[0] = p1;
        hp.proc[1] = p2;
        hp.proc[0].print();
        hp.proc[1].print();
    }
}
