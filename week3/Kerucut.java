package week3;

public class Kerucut {
    int jariJari;
    int sisiMiring;
    Kerucut(int j, int sm){
        jariJari = j;
        sisiMiring = sm;
    }
    double hitungVolume(){
        double vol = 0;
        double luasAlas = 3.14*jariJari*jariJari;
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2)-
                        Math.pow(jariJari, 2));
        vol = (1.0/3.0)*luasAlas*tinggi;
        return vol;
    }
    double hitungLuasPermukaan(){
        double lp = 0;
        lp = 3.14*jariJari*(jariJari+sisiMiring);
        return lp;
    }
}
