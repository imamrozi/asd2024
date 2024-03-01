package week3;

public class Matakuliah {
    String kode;
    String nama;
    int sks;
    int jam;
    Dosen dosen;
    int kuota;
    Mahasiswa mhs[];

    void gantiKodeMK(String newKode){
        kode = newKode;
    }
    void gantiNamaMK(String newNama){
        nama = newNama;
    }
    void gantiDosen(Dosen newDosen){
        dosen = newDosen;
    }
    void tampilMahasiswa(){
        for(Mahasiswa m:mhs){
            System.out.println(m.alamat);
        }
    }
    public static void main(String[] args) {
        
    }
}
