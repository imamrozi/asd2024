package week3;

public class Processor {
    String brand;
    double clock;
    int numCore;
    Processor(String b, double c, int n){
        brand = b;
        clock = c;
        numCore = n;
    }
    void print(){
        System.out.println("Brand = "+brand);
        System.out.println("Clock = "+clock);
        System.out.println("Num Core = "+numCore);
    }
}
