import java.util.Scanner;
public class QueueMain06 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        Queue06 Q = new Queue06(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1: 
                    System.out.println("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    if (!Q.Enqueue(dataMasuk)) {
                        System.out.println("Queue sudah penuh! Program dihentikan");
                        return;
                    }
                    break;
                case 2: 
                    Integer dataKeluar = Q.Dequeue();
                    if (dataKeluar == null) {
                        System.out.println("Queue masih kosong! Program dihentikan");
                        return;
                    } else {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3: 
                    Q.print();
                    break;
                case 4: 
                    Q.peek(); 
                    break;
                case 5: 
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}