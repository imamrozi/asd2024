package week5;

public class Faktorial {
    int faktorialBF(int n){
        int faktorial = 1;
        for(int i=1;i<=n;i++){
            faktorial *= i;
        }
        return faktorial;
    }
    int faktorialDC(int n){
        if(n==1)
            return 1;
        else
            return n*faktorialDC(n-1);
    }
    public static void main(String[] args) {
        Faktorial f = new Faktorial();
        System.out.println("Faktorial 5 = "+f.faktorialBF(5));
        System.out.println("Faktorial 5 = "+f.faktorialDC(5));
    }
}
