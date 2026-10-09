
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU BENTUK =====");
            System.out.println("1. Informasi semua bentuk");
            System.out.println("2. Hitung luas bujursangkar");
            System.out.println("3. Hitung luas lingkaran");
            System.out.println("4. Hitung volume silinder");
            System.out.println("5. Contoh polymorphism");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    Bentuk bentuk = new Bentuk("Merah");
                    BujurSangkar persegi =
                        new BujurSangkar(4, "Biru");
                    Lingkaran lingkaran =
                        new Lingkaran(7, "Hitam");
                    Silinder tabung =
                        new Silinder(10, 2, "Ungu");

                    bentuk.printInfo();
                    persegi.printInfo();
                    lingkaran.printInfo();
                    tabung.printInfo();
                    break;

                case 2:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = input.nextDouble();

                    BujurSangkar b =
                        new BujurSangkar(sisi, "Biru");

                    System.out.println("Luas bujursangkar = "
                            + b.hitungLuas());
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari: ");
                    double radius = input.nextDouble();

                    Lingkaran l =
                        new Lingkaran(radius, "Hitam");

                    System.out.println("Luas lingkaran = "
                            + l.hitungLuas());
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari: ");
                    double r = input.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();

                    Silinder s =
                        new Silinder(tinggi, r, "Ungu");

                    System.out.println("Volume silinder = "
                            + s.hitungVolume());
                    break;

                case 5:
                    Bentuk b1 =
                        new BujurSangkar(5, "Abu-abu");
                    Bentuk b2 =
                        new Lingkaran(3, "Putih");

                    b1.printInfo();
                    b2.printInfo();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println(
                        "Pilihan tidak valid. Coba lagi."
                    );
            }

        } while (pilihan != 0);

        input.close();
    }
}