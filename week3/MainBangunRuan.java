package week3;
import java.util.Scanner;

public class MainBangunRuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kerucut krc[] = new Kerucut[3];
        LimasS4SamaSisi lim[] = new LimasS4SamaSisi[3];
        for(int i=0;i<3;i++){
            System.out.print("r kerucut(int) = ");
            int rKerucut = sc.nextInt();
            System.out.print("SM kerucut(int) = ");
            int smKerucut = sc.nextInt();
            krc[i] = new Kerucut(rKerucut, smKerucut);
            System.out.print("sisi alas limas(int) = ");
            int saLimas = sc.nextInt();
            System.out.print("tinggi limas(int) = ");
            int tLimas = sc.nextInt();
            lim[i] = new LimasS4SamaSisi(saLimas, tLimas);
        }
        for(int i=0;i<3;i++){
            System.out.println("Vol kerucut ke-"+i+"="+krc[i].hitungVolume());
            System.out.println("Luas kerucut ke-"+i+"="+krc[i].hitungLuasPermukaan());
            System.out.println("Vol limas ke-"+i+"="+lim[i].hitungVolume());
            System.out.println("Luas limas ke-"+i+"="+lim[i].hitungLuasPermukaan());
        }
        //volume kerucut terbesar
        double maxVol = krc[0].hitungVolume();
        int maxVolIdx = 0;
        for(int i=1;i<3;i++){
            if(krc[i].hitungVolume()>maxVol){
                maxVol = krc[i].hitungVolume();
                maxVolIdx = i;
            }
        }
        System.out.println("Max volume = "+maxVol);
        System.out.println("Jari-jari = "+krc[maxVolIdx].jariJari);
        System.out.println("Sisi miring = "+krc[maxVolIdx].sisiMiring);
        //volume terbesar melalui method
        maxVol(krc);
    }

    static void maxVol(Kerucut[] x){
        //volume kerucut terbesar
        double maxVol = x[0].hitungVolume();
        int maxVolIdx = 0;
        for(int i=1;i<3;i++){
            if(x[i].hitungVolume()>maxVol){
                maxVol = x[i].hitungVolume();
                maxVolIdx = i;
            }
        }
        System.out.println("Max volume = "+maxVol);
        System.out.println("Jari-jari = "+x[maxVolIdx].jariJari);
        System.out.println("Sisi miring = "+x[maxVolIdx].sisiMiring);
    }
}    
