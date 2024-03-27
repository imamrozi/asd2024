package week7;

public class Searching {
    public static void main(String[] args) {
        int data[] = {23,4,3,23,22,12,6,5,47,6,0,10};
        int key = 100;
        //int pos = sequentialSearch(data, key);
        int pos = binarySearch(data, key);
        tampilArray(data);
        if(pos<0)
            System.out.println("Data tidak ada");
        else
            System.out.println("Data ditemukan di posisi ke "+(pos+1));
    }
    
    static int sequentialSearch(int data[], int key){
        int idx = -1;
        for(int i=0;i<data.length;i++){
            if(key == data[i]){
                idx = i;
                break;
            }
        }
        return idx;
    }
    static int binarySearch(int data[], int key){
        int idx = -1;
        bubbleSort(data);
        int i=0, j=data.length-1, m, counter=1;
        while(j>=i){
            m = (i+j)/2;
            System.out.println("Tahap pencarian ke-"+counter+""
                    + ", i="+i+", j="+j+", m="+m);
            if(key==data[m]){
                idx = m;
                break;
            }else if(key>data[m]){
                i=m+1;
            }else{
                j=m-1;
            }
            counter++;
        }
        return idx;
    }
    static void bubbleSort(int[] data){
        //perulangan sejumlah n-1 tahap pengurutan
        for(int i=0;i<data.length-1;i++){
            //perulangan sejumlah n-i-1 langkah pembandingan
            for(int j=0;j<data.length-i-1;j++){
                if(data[j]>data[j+1]){
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
    }
    static void tampilArray(int[] data){
        for(int x: data){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
}
