package week7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        int jumMhs = 2 ;

        System.out.println("------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil!");
        for ( int i = 0; i < jumMhs; i++) {
                System.out.println("------------------------------------------------------");
                System.out.print("Nim\t: " );
                int nim = s.nextInt();
                System.out.print("Nama\t: " );
                String nama = s.next();
                System.out.print("Umur\t: " );
                int umur = s.nextInt();
                System.out.print("IPK\t: " );
                double ipk = s.nextDouble();
        
                Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
                data.tambah(m);
        }
        System.out.println("------------------------------------------------------");
        System.out.println("            Data keseluruhan Mahasiswa : ");
        System.out.println("------------------------------------------------------");
        data.tampil();
        System.out.println("------------------------------------------------------");
        System.out.println("                       PENCARIAN DATA                 ");
        System.out.println("------------------------------------------------------");
        System.out.print("Masukkan NIM mahasiswa yang dicari :");
        System.out.println("NIM : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        
        ///BINARY SEARCH
        System.out.println("Menggunakan binary Search");
        //urutkan mhs
        new MergeSortMahasiswa().mergeSort(data.listMhs);
        posisi = data.FindBinarySearch(cari,0,jumMhs-1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        //cari berdasar nama
        System.out.println("Cari NAMA : ");
        String cariNama = s.next();
        int count = data.FindSeqSearchByNama(cariNama);
        String pesan = count == 0 ? "Tidak nemu" : "Nemu "+count+" data";
        System.out.println(""+pesan);
    }
}
