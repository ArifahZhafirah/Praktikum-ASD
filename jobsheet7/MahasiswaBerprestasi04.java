package jobsheet7;
public class MahasiswaBerprestasi04 {
    Mahasiswa04 [] listMhs = new Mahasiswa04 [5];
    int idx;

    void tambah (Mahasiswa04 m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa04 m:listMhs){
            m.tampilInformasi();
            System.out.println("-------------------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            for (int j = 1; j < listMhs.length - i; j++){
                if (listMhs[j].ipk > listMhs[j - 1].ipk){
                    Mahasiswa04 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa04 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa04 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    } 

    //mulai dari sini jobsheet6
    int sequentialSearching (double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!= -1){
            System.out.println("data mahasiswa dengan IPK "+ x +" berada di posisi ke "+pos);
        } else {
            System.out.println("data "+ x +" tidak ditemukan");
        }
    }

    void tampilDataSearch (double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : " +listMhs[pos].nim);
            System.out.println("nama\t : " +listMhs[pos].nama);
            System.out.println("kelas\t : " +listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
            System.out.println("================================");
        } else {
            System.out.println("data mahasiswa dengan IPK "+ x +" tidak ditemukan");
        }
    } 
}