/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author Imam
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {10,4,5,3,23,5,6};
        tampilArray(data);
        //bubbleSort(data);
        //selectionSort(data);
        insertionSort(data);
        tampilArray(data);
    }
    
    static void tampilArray(int[] data){
        for(int x: data){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
    static void insertionSort(int[] data){
        for(int i=0;i<data.length;i++){
            int temp = data[i];
            int j = i;
            while(j>0 && data[j-1]>temp){
                data[j] = data[j-1];
                j--;
            }
            data[j] = temp;
        }
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
    static void selectionSort(int[] data){
        //perulangan tahap pengurutan n-1 kali
        for(int i=0;i<data.length-1;i++){
            //perulangan cari nilai min
            int minValue = data[i];
            int idxMin = i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]<minValue){
                    minValue = data[j];
                    idxMin = j;
                }
            }
            //swap
            int tmp = data[i];
            data[i] = data[idxMin];
            data[idxMin] = tmp;
        }
    }
}
