package week6;

public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;

    public Hotel(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }
    
    void tampil(){
        System.out.println("Data Hotel: ");
        System.out.println("Nama: "+nama);
        System.out.println("Kota: "+kota);
        System.out.println("Harga: "+harga);
        System.out.println("Bintang: "+bintang);
    }
}
