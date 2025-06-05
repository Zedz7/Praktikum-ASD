public class Antrian06 {
    mahasiswa06[] data;
    int front, rear, size, max;
    int totalDiproses = 0;
    int kuotaMahasiswa = 30;

    public Antrian06(int max) {
        this.max = max;
        this.data = new mahasiswa06[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void enqueue(mahasiswa06 mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian penuh. Tidak bisa menambahkan.");
        }
    }
    public void dequeueBatch() {
        System.out.println("Memanggil 2 mahasiswa untuk proses KRS:");
        for (int i = 0; i < 2 && !isEmpty(); i++) {
            mahasiswa06 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDiproses++;
        }
    }
    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            int i = front;
            int urut = 1;
            while (urut <= size) {
                System.out.print(urut + ". ");
                data[i].tampilkanData();
                i = (i + 1) % max;
                urut++;
            }
        }
    }
    public void tampilDuaTerdepan() {
        System.out.println("2 Antrian Terdepan:");
        int i = front;
        int jumlah = 2;
        if (size < 2) {
            jumlah = size;
        }
        for (int j = 0; j < jumlah; j++) {
            if (data[i] != null) {
                data[i].tampilkanData();
            }
            i = (i + 1) % max;
        }

    }
    public void tampilTerakhir() {
        if (!isEmpty()) {
            System.out.println("Antrian Terakhir:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah diproses KRS: " + totalDiproses);
    }

    public void cetakSisaMahasiswa() {
        System.out.println("Sisa mahasiswa yang belum diproses KRS: " + (kuotaMahasiswa - totalDiproses));
    }
}