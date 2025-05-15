package Pertemuan12;
import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkList06 sll = new SingleLinkList06();
        int pilihan;

        do { 
            System.out.println("\n=== Menu Linked List Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilh menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1: 
                    System.out.print("Masukkan NIM      : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama     : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas    : ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK      : ");
                    double ipk = sc.nextDouble();
                    Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
                    sll.addLast(mhs);
                    System.out.println("Data mahasiswa berhasil ditambahkan");
                    break;
                case 2: 
                    sll.print();
                    break;
                case 3: 
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 3);

        // Mahasiswa06 mhs1 = new Mahasiswa06("121", "Amba", "SIB 1F", 3.5);
        // Mahasiswa06 mhs2 = new Mahasiswa06("122", "Rusdi", "TI 1A", 3.1);
        // Mahasiswa06 mhs3 = new Mahasiswa06("123", "Andre", "TI 1G", 3.7);
        // Mahasiswa06 mhs4 = new Mahasiswa06("124", "Fuad", "SIB 1D", 3.9);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
    }
}