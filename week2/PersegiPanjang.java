package week2;

public class PersegiPanjang {
    int panjang;
    int lebar;
    int hitungLuas(){
        return panjang*lebar;
    }
    int hitungKeliling(){
        return 2*(panjang+lebar);
    }

    public static void main(String[] args) {
        PersegiPanjang[] pArr = new PersegiPanjang[7];
        for(int i=0;i<pArr.length-3;i++){
            pArr[i] = new PersegiPanjang();
            pArr[i].panjang = (int)(Math.random()*10);
            pArr[i].lebar = (int)(Math.random()*10);
        }
        for(PersegiPanjang obj:pArr){
            System.out.println("P = "+obj.panjang+", L = "+obj.lebar);
        }
    }
}
