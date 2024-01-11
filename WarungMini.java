public class WarungMini {
    public static void main(String[] args) {
        System.out.println("Selamat datang Warung Mini");
        System.out.println("Mau pesan apa");
        WarungMini b = new WarungMini();
        b.tampilkopi();
        System.out.println(b.harga(2));
    }
    public void tampilkopi(){
        String Nama = "Kopi susu jayaa";
        System.out.println("Pesanan : " + Nama);
    }

    public int harga (int pesanberapa){
        int harga = 5000*pesanberapa;
        return harga;
    }
}
