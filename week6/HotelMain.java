package week6;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Input Jumlah Room = ");
        int n = sc.nextInt();
        HotelService dataHotel = new HotelService(n);//instansiasai HotelService
        
        //input data
        for(int i=0;i<n;i++){
            System.out.println("Input data room ke-"+i+1);
            System.out.print("Nama = ");String nama = sc2.nextLine();
            System.out.print("Kota = ");String kota = sc2.nextLine();
            System.out.print("Harga = ");int harga= sc.nextInt();
            System.out.print("Bintang = ");byte bintang = sc.nextByte();
            dataHotel.tambah(new Hotel(nama, kota, harga, bintang));
        }
        
        //tammpil data hotel
        dataHotel.tampilAll();
        
        //sort
        dataHotel.selectionSort();
        
        //tampil
        dataHotel.tampilAll();
                
    }
}
