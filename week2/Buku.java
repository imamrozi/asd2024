package week2;

public class Buku {
    String judul, pengarang;
    int halaman, stok, harga;

    Buku(){
    }
    Buku(String jd, String pg, int hal, int st, int hr){
        judul = jd;
        pengarang = pg;
        halaman = hal;
        stok = st;
        harga = hr;
    }
    Buku(String jd, String pg){
        judul = jd;
        pengarang = pg;
    }

    void tampilInformasi(){
        System.out.println("Data Buku:");
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Halaman: "+halaman);
        System.out.println("Stok: "+stok);
        System.out.println("Harga: "+harga);
    }
    void terjual(int jml){
        if(stok>0 && stok>=jml){
            stok -= jml;
        }
    }
    void restok(int jml){
        stok += jml;
    }
    void gantiHaga(int hrg){
        harga = hrg;
    }
    int hitungHargaTotal(int jml){
        return harga*jml;
    }
    int hitungDiskon(int jml){
        int diskon = 0;
        int hargaTotal = hitungHargaTotal(jml);
        if(hargaTotal>=150000){
            diskon = (int)(0.12*hargaTotal);
        }else if(hargaTotal<150000 && hargaTotal>=75000)
            diskon = (int)(0.05*hargaTotal);
        else
            diskon = 0;
        return diskon;
    }
    int hitungHargaBayar(int jml){
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }
    public static void main(String[] args) {
        Buku b1 = new Buku();
        b1.judul = "Today Ends Tomorrow Comes";
        b1.pengarang = "Denanda Pratiwi";
        b1.halaman = 198;
        b1.stok = 13;
        b1.harga = 71000;
        b1.tampilInformasi();
        b1.terjual(5);
        System.out.println("Harga yang terjual = "+b1.hitungHargaTotal(5));
        System.out.println("Diskon = "+b1.hitungDiskon(5));
        System.out.println("Bayar = "+b1.hitungHargaBayar(5));
        b1.stok = b1.stok-5;
        b1.gantiHaga(60000);
        b1.tampilInformasi();
        System.out.println(b1);
    }
}
