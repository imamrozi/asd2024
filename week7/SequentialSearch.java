package week7;

public class SequentialSearch {
    public static void main(String[] args) {
        int data[] = {12,34,2,3,54,4,34,65,12,31};
        int posisi = 0;
        int key = 650;
        for(int i=0;i<data.length;i++){
            if(data[i]==key){
                posisi = i;
                break;
            }
        }
        if(posisi>-1){
            System.out.println("Data ketemu di index = "+posisi);
        }else{
            System.out.println("Data tidak ketemu");
        }
    }
}
