public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Mahasiswa04[] arrayOfMahasiswa = new Mahasiswa04[3];
        arrayOfMahasiswa[0] = new Mahasiswa04();
        arrayOfMahasiswa[0].nim = "244107020188";
        arrayOfMahasiswa[0].nama = "Arifah Zhafirah Wikananda";
        arrayOfMahasiswa[0].kelas = "TI-1E";
        arrayOfMahasiswa[0].ipk = (float) 4.00; 

        arrayOfMahasiswa[1] = new Mahasiswa04();
        arrayOfMahasiswa[1].nim = "244107020189";
        arrayOfMahasiswa[1].nama = "rani miftahul sa'adah";
        arrayOfMahasiswa[1].kelas = "TI-1E";
        arrayOfMahasiswa[1].ipk = (float) 4.00;

        arrayOfMahasiswa[2] = new Mahasiswa04();
        arrayOfMahasiswa[2].nim = "244107020198";
        arrayOfMahasiswa[2].nama = "Faiva Puspa Sahara";
        arrayOfMahasiswa[2].kelas = "TI-1E";
        arrayOfMahasiswa[2].ipk = (float) 4.00;

        System.out.println("NIM   : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[0].ipk);
        System.out.println("----------------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[1].ipk);
        System.out.println("----------------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[2].ipk);
        System.out.println("----------------------------------");
    }
    

}
