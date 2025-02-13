public class fungsi1 {
    static int[][] stok = {
        { 10, 5, 15, 7}, 
        { 6, 11, 9, 12},
        { 2, 10, 10, 5},
        { 5, 7, 12, 9},
    };
    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[][] pendapatanPerBunga = new int[stok.length][bunga.length];

    public static void main(String[] args) {
        int[] harga = { 75000, 50000, 60000, 10000};
        for (int i = 0; i < stok.length; i++) {
            int pendapatanPerCabang = 0;
            for (int j = 0; j < bunga.length; j++) {
                pendapatanPerBunga[i][j] = stok[i][j] * harga[j];
                pendapatanPerCabang += pendapatanPerBunga[i][j];
            }

            String[] cabang = { "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};

            for (int k = 0; k < 1; k++) {
                System.out.println("Pendapatan Cabang " + cabang[i] + " : Rp " + pendapatanPerCabang);
            }
        }
    }
   
}
