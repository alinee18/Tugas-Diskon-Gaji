import java.util.Scanner;

public class Soal {
    public static void main(String[] args) {
        System.out.println("Kalkulator barang");
        String Nama_Barang;
        double Harga ;
        double Jumlah;
        double diskon;
        double jadi_satu;
        double total;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang = ");
        Nama_Barang = masukan.next();

        System.out.println("Masukkan Harga Barang = ");
        Harga = masukan.nextDouble();

        System.out.println("MAsukkan Jumlah Barang = ");
        Jumlah = masukan.nextDouble();
        jadi_satu = Harga * Jumlah;

        System.out.println("Masukkan diskon = ");
        diskon = masukan.nextDouble();

        total = ( Harga * Jumlah );
        diskon = diskon / 100 * jadi_satu;
        total = total - diskon;
        System.out.println("Jadi total harga adalah = "+total);




    }
}
