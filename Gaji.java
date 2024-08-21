import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {

        double jamKerja;
        double tarifPerJam;
        double potonganPajak; 
        double gajiBruto;
        double gajiBersih;

        Scanner input = new Scanner(System.in);;

        System.out.println("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextDouble();
        System.out.println("Masukkan tarif per jam: ");
        tarifPerJam = input.nextDouble();


        //Menghitung gaji bruto
        gajiBruto = jamKerja*tarifPerJam;

        //Menghitung potongan ajak (10% daro gaji bruto);
        potonganPajak = gajiBruto * 0.10;
        
        //Menghitung gaji berih
        gajiBersih = gajiBruto - potonganPajak;

        // Menampilkan hasil
        System.out.println("Gaji Bruto: Rp " + gajiBruto);
        System.out.println("Potongan Pajak (10%): Rp " + potonganPajak);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);



    }



}
