import java.util.Scanner;

public class nomor4 {
    public static void main(String [] args){
    Scanner input = new Scanner (System.in);

    System.out.print("Masukkan nama mahasiswa: ");
    String nama = input.nextLine();

    System.out.print("Masukkan NPM: ");
    String npm = input.nextLine();

    System.out.print("Masukkan nilai UTS: ");
    int uts = input.nextInt();

    System.out.print("Masukkan nilai UAS: ");
    int uas = input.nextInt();

    double rata = (uts + uas) / 2.0;

    String status = (rata >= 70) ? "Lulus" : "Tidak Lulus";

    System.out.println("========================");
    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("NPM Mahasiswa: " + npm);
    System.out.println("Nilai UTS Mahasiswa: " + uts);
    System.out.println("Nilai UAS Mahasiswa: " + uas);
    System.out.println("Rata-rata nilai Mahasiswa adalah: " + rata);
    System.out.println("Status kelulusan Mahasiswa adaalah: " + status);
    
    System.out.print("Apakah ingin mengulang program (Y/N):");
    String ulang = input.next();

    if (ulang.equalsIgnoreCase("Y")) {
        System.out.println("");
        main(args);
    } else {
        System.out.println("Terima Kasih!!");
        input.close();
    }
    }
}