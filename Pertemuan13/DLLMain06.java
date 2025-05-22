package Pertemuan13;
import java.util.Scanner;

public class DLLMain06 {
    public static Mahasiswa06 inputMahasiswa06(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        Double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa06(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        DoubleLinkedList06 list = new DoubleLinkedList06();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do { 
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan setelah NIM tertentu");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus node setelah NIM tertentu");
            System.out.println("10. Hapus node berdasarkan indeks");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data (size)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa06 mhs = inputMahasiswa06(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa06 mhs = inputMahasiswa06(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                     System.out.print("Masukkan NIM yang dicari:");
                     String nim = scan.nextLine();
                     Node06 found = list.search(nim);
                     if (found != null) {
                         System.out.println("Data ditemukan:");
                         found.data.Tampil();
                     } else {
                         System.out.println("Data tidak ditemukan");
                     }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node06 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.Tampil();
                        System.out.println("Masukkan data baru:");
                        Mahasiswa06 mhs = inputMahasiswa06(scan);
                        list.insertAfter(nim, mhs);
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 8 -> {
                    System.out.print("Masukkan indeks tempat data disisipkan: ");
                    int indexAdd = scan.nextInt();
                    scan.nextLine(); 
                    Mahasiswa06 mhsAdd = inputMahasiswa06(scan);
                    list.add(indexAdd, mhsAdd);
                    break;
                }
                case 9 -> {
                    System.out.print("Masukkan NIM sebelum node yang akan dihapus: ");
                    String keyNimRemove = scan.nextLine();
                    list.removeAfter(keyNimRemove);
                    break;
                }
                case 10 -> {
                    System.out.print("Masukkan indeks node yang akan dihapus: ");
                    int indexRemove = scan.nextInt();
                    scan.nextLine();
                    list.remove(indexRemove);
                    break;
                }
                case 11 -> {
                    list.getFirst();
                    break;
                }
                case 12 -> {
                    list.getLast();
                    break;
                }
                case 13 -> {
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idx);
                    break;
                }
                case 14 -> {
                    System.out.println("Jumlah data dalam list: " + list.size());
                    break;
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }
}