package week5;

public class Pangkat {
    int pangkatBF(int m, int n){
        int pangkat = 1;
        for(int i=1;i<=n;i++){
            pangkat *= m;
        }
        return pangkat;
    }
    int pangkatDC(int m, int n){
        if(n==1)
            return m;
        else{
            if(n%2==0)
                return pangkatDC(m, n/2)*pangkatDC(m, n/2);
            else
                return pangkatDC(m, n/2)*pangkatDC(m, n/2)*m;
        }
    }

    public static void main(String[] args) {
        Pangkat p = new Pangkat();
        System.out.println("hasil 5^4 = "+p.pangkatBF(5, 4));
        System.out.println("hasil 5^4 = "+p.pangkatDC(5, 4));
    }
}
