public class dataDosen04 {
    dosen04[] dataDosen = new dosen04[10];
    int idx;

    void tambah(dosen04 dsn){
        if (idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        }else {
            System.out.println("Data Dosen Sudah Banyak!");
        }
    }
    // Untuk menampilkan Data dosen
    void tampil (){
        if (idx == 0){
            System.out.println("Tidak Ada Data Dosen.");
            return;
        }
        for (int i = 0; i < idx; i++){
            dataDosen[i].tampil();
            System.out.println();
        }
    }

    // Metode untuk mengurutkan data dosen secara ascending (asc)
    void sortingASC(){
        for (int i = 0; i < idx - 1; i++){
            for (int j = 0; j < idx - 1 -i; j++){
                if (dataDosen[j].usia > dataDosen[j+1].usia){
                    dosen04 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    // Metode untuk mengurutkan data dosen secara descending (dsc)
    void sortingDSC(){
        for (int i = 0; i < idx - 1; i++){
            for (int j = 0; j < idx - 1 - i; j++){
                if (dataDosen[j].usia < dataDosen[j + 1].usia){
                    dosen04 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
}
