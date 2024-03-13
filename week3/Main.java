package week3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PersegiPanjang[] data = new PersegiPanjang[n];
        data[0] = new PersegiPanjang();
        data[0].height =50;

        data[0] = new PersegiPanjang();
        data[0].height = 50;
        data[0].width = 20;

        data[1] = new PersegiPanjang(30, 15);
        System.out.println("Area = "+data[1].calcArea());
        System.out.println("Area = "+data[0].calcArea());

        for(PersegiPanjang p:data){

        }

        PersegiPanjang p1 = new PersegiPanjang(10, 10);
        data[2] = p1;
        System.out.println("Area = "+p1.calcArea());
        System.out.println("Area = "+data[2].calcArea());
        data[3] = data[2];

        for(int i=0;i<data.length-2;i++){
            data[i] = new PersegiPanjang(15*i, 4*i);
            System.out.println("Area = "+data[i].calcArea());
        }
    }
}
