package week7;

public class MergeSortMahasiswa {
    public void mergeSort(Mahasiswa[] data){
        sort(data, 0, data.length-1);
    }
    
    private void merge(Mahasiswa[] data , int left , int midle , int right){
        Mahasiswa[] temp = new Mahasiswa[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = midle + 1;
        int c = left ;

        //membandingkan setiap bagian
        while (a<=midle && b <= right){
            if(temp[a].nim <= temp[b].nim){
                data[c] = temp [a];
                a++;
            } else{
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = midle-a;
        for (int i = 0; i <= s; i++) {
            data[c+i] = temp[a+i];
        }
    }

    //Membagi menjadi 2 bagian dan dibagi kembali hingga tak dapat dibagi kembali
    private void sort(Mahasiswa data[], int left, int right){
        if(left < right){
            int midle = (left+right)/2;
            sort (data, left, midle);
            sort (data, midle + 1 , right);
            merge(data, left, midle, right);
        }
    }

    public void printArray(Mahasiswa arr[]){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            //System.out.print(arr[i]+" ");
            arr[i].tampil();
        }
        System.out.println();
    }
}
