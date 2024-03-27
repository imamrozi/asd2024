package week7;

class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[2];
    int idx;
    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
            } else {
                System.out.println("Data sudah penuh !!");
            }
    }

    void tampil(){
        for(Mahasiswa m : listMhs ){
            m.tampil();
            System.out.println("-----------------------");
        }

            // for (int i = 0; i < listMhs.length; i++) {
            //     listMhs[i].tampil();
            // }
        
    } 

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
             if(listMhs[j].nim==cari){
                posisi = j ;
                break;
            }
        }
        return posisi;
    }
    
    public int FindSeqSearchByNama(String cari){
        int posisi = -1, counter = 0;
        for (int j = 0; j < listMhs.length; j++) {
             if(listMhs[j].nama.equalsIgnoreCase(cari)){
                posisi = j ;
                counter++;
                //break;
            }
        }
        return counter;
    }
    

    public void tampilPosisi(int x , int pos){
        if(pos!=-1){
            System.out.println("Data :  " + x + " ditemukan pada indeks " + pos);
        } else{
            System.out.println("Data " + x +  " tidak ditemukan");
        }
    }


    public void TampilData(int x , int pos){
        if(pos!=-1){
            System.out.println("Nim\t : "+x);
            System.out.println("Nama\t :" +listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else {
            System.out.println("Data " + x + "tidak ditemukan!");
        }
    }

    public int FindBinarySearch(int cari, int left , int right){
        int mid;
        if(right>=left){
            mid= (left+right)/2;
            if (cari == listMhs[mid].nim){
                return (mid);
            } else if (listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid-1);
            } else{
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return-1;
    }
}
