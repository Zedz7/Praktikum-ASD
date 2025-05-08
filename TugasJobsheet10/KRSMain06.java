import java.util.Scanner;
public class KRSMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian06 antrian = new Antrian06(10);

        int pilihan;
        do {
            System.out.println("\n=========== MENU ANTRIAN KRS ===========");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah Diproses KRS");
            System.out.println("11. Cetak Sisa Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa06 mhs = new Mahasiswa06(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeueBatch();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampilDuaTerdepan();
                    break;

                case 5:
                    antrian.tampilTerakhir();
                    break;

                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
                    break;

                case 7:
                    System.out.println(antrian.isFull() ? "Antrian penuh" : "Antrian tidak penuh");
                    break;

                case 8:
                    antrian.clear();
                    break;

                case 9:
                    antrian.cetakJumlahAntrian();
                    break;

                case 10:
                    antrian.cetakJumlahDiproses();
                    break;

                case 11:
                    antrian.cetakSisaMahasiswa();
                    break;

                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        } while (pilihan != 0);

        sc.close();
    }
}