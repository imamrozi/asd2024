package week3;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs[] = new Mahasiswa[3];
        double sum = 0;
        for(int i=0;i<mhs.length;i++){
            mhs[i] = new Mahasiswa("NIM"+i, "NAMA"+i, "L", Math.random()*10);
            mhs[i].print();
            sum = sum+mhs[i].IPK;
        }
        double rata2 = sum/mhs.length;
        System.out.println("IPK rata2 = "+rata2);
    }
}
