package Pertemuan12;
import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkList06 sll = new SingleLinkList06();
        // int pilihan;

        // do { 
        //     System.out.println("\n=== Menu Linked List Mahasiswa ===");
        //     System.out.println("1. Tambah Mahasiswa");
        //     System.out.println("2. Tampilkan Mahasiswa");
        //     System.out.println("3. Keluar");
        //     System.out.print("Pilh menu: ");
        //     pilihan = sc.nextInt();
        //     sc.nextLine();

        //     switch (pilihan) {
        //         case 1: 
        //             System.out.print("Masukkan NIM      : ");
        //             String nim = sc.nextLine();
        //             System.out.print("Masukkan Nama     : ");
        //             String nama = sc.nextLine();
        //             System.out.print("Masukkan Kelas    : ");
        //             String kelas = sc.nextLine();
        //             System.out.print("Masukkan IPK      : ");
        //             double ipk = sc.nextDouble();
        //             Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
        //             sll.addLast(mhs);
        //             System.out.println("Data mahasiswa berhasil ditambahkan");
        //             break;
        //         case 2: 
        //             sll.print();
        //             break;
        //         case 3: 
        //             System.out.println("Terima kasih");
        //             break;
        //         default:
        //             System.out.println("Pilihan tidak valid");
        //     }
        // } while (pilihan != 3);

        Mahasiswa06 mhs1 = new Mahasiswa06("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa06 mhs2 = new Mahasiswa06("23212201", "Bimon", "2B", 3.8);
        Mahasiswa06 mhs3 = new Mahasiswa06("22212202", "Cintia", "3C", 3.5);
        Mahasiswa06 mhs4 = new Mahasiswa06("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);     
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " +sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}