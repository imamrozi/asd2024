package week9;

public class Nasabah {
    String noRek, nama, alamat;
    int umur;
    double saldo;

    public Nasabah(String no, String na, String al, int u, double sa){
        noRek = no;
        nama = na;
        alamat = al;
        umur = u;
        saldo = sa;
    }
    public void print(){
        System.out.println("Nama = "+nama);
        System.out.println("No Rek = "+noRek);
        System.out.println("Alamat = "+alamat);
        System.out.println("Umur = "+umur);
        System.out.println("Saldo = "+saldo);
        System.out.println("-------------------------");
    }
}
