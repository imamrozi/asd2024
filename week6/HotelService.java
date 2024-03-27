package week6;

public class HotelService {
    Hotel rooms[] ;
    int idx;
    
    HotelService(int n){
        rooms = new Hotel[n];
        idx = 0;
    }
    
    void tambah(Hotel h){
        if(idx<rooms.length){
            rooms[idx++] = h;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }
    void tampilAll(){
        for(Hotel h: rooms){
            h.tampil();
        }
    }
    void bubbleSort(){
        for(int i=0;i<rooms.length-1;i++){
            for(int j=0;j<rooms.length-i-1;j++){
                if(rooms[j+1].harga<rooms[j].harga){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0;i<rooms.length-1;i++){
            int idxMax = i;
            for(int j=i+1;j<rooms.length;j++){
                if(rooms[idxMax].bintang<rooms[j].bintang){
                    idxMax = j;
                }
            }
            Hotel tmp = rooms[i];
            rooms[i] = rooms[idxMax];
            rooms[idxMax] = tmp;
        }
    }
}
