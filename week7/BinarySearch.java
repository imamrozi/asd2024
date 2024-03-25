package week7;

public class BinarySearch {
    public static void main(String[] args) {
        int data[] = {2,3,4,12,12,31,34,54,65,76,560};
        int posisi = -1;
        int key = 540;
        int i = 0;
        int j = data.length-1;
        int m;
        while(i<=j){
            m = (i+j)/2;
            if(data[m]==key){
                posisi = m;
                break;
            }else if(key>data[m]){
                i = m+1;
            }else{
                j = m-1;
            }
        }
        if(posisi>-1){
            System.out.println("Data ketemu di index = "+posisi);
        }else{
            System.out.println("Data tidak ketemu");
        }
    }
}
