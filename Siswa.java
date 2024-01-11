package PBO;

public class Siswa {
    public static void main(String[] args) {
        System.out.println("Semangat Belajar");
        Siswa a = new Siswa();
        a.tampilnama();
        System.out.println(a.usia(2007));
    }

    public void tampilnama(){
        String Nama = "Aksa";
        System.out.println("nama siswa : "+ Nama);
    }

    public int usia (int tahunLahir){
        int usia = 2024-tahunLahir;
        return usia;
    }
}
