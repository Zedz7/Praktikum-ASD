package TugasJobsheet11;

class QueueAntrian06 {
    Node06 front, rear;
    int size;
    int MAX_SIZE;

    public QueueAntrian06(int maxSize) {
        this.front = this.rear = null;
        this.size = 0;
        this.MAX_SIZE = maxSize;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == MAX_SIZE;
    }

    void enqueue(Mahasiswa06 data) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak dapat menambahkan " + data.nama);
            return;
        }

        Node06 newNode = new Node06(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Mahasiswa " + data.nama + " berhasil ditambahkan ke antrian.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
            return;
        }

        Mahasiswa06 removedData = front.data;
        front = front.next;
        size--;

        if (isEmpty()) {
            rear = null;
        }

        System.out.println("Memanggil: ");
        removedData.tampilInformasi();
    }

    void peekDepan() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    void peekBelakang() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    void tampilkanJumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar antrian:");
        Node06 current = front;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }
}
