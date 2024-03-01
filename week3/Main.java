package week3;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang[] data = new PersegiPanjang[5];
        //data[0] = new PersegiPanjang();
        data[0].height =50;

        data[0] = new PersegiPanjang();
        data[0].height = 50;
        data[0].width = 20;

        data[1] = new PersegiPanjang(30, 15);
        System.out.println("Area = "+data[1].calcArea());
        System.out.println("Area = "+data[0].calcArea());

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
