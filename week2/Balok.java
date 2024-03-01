package week2;

public class Balok {
    int p, l, t;
    Balok(){
    }
    Balok(int pj, int lb, int tg){
        p = pj; l = lb; t = tg;
    }
    double hitungVolume(){
        return p*l*t;
    }
    double hitungLuas(){
        return (2*(p*l+p*t+l*t));
    }
    void print(){
        System.out.println("P = "+p+", L = "+l+", T = "+t);
    }
    public static void main(String[] args) {
        Balok b1 = new Balok(10, 5, 6);
        Balok b2 = new Balok();
        b1.print();
        System.out.println("Volume = "+b1.hitungVolume());
        System.out.println("Luas = "+b1.hitungLuas());
        Balok b3 = new Balok(25, 51, 43);
        System.out.println("Volume = "+b3.hitungVolume());
    }
}
