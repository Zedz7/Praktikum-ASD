package Pertemuan13;

public class DoubleLinkedList06 {
    Node06 head;
    Node06 tail;

    public DoubleLinkedList06() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa06 data) {
        Node06 current = head;

        //Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node06 newNode = new Node06(data);

        //Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            //Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            Node06 current = head;
            while (current != null) {
                current.data.Tampil();
                current = current.next;
            }
        }
    }
    public Node06 search(String nim) {
        Node06 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List masih kosong, tidak dapat dihapus.");
            return;
        }
        Mahasiswa06 datahapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus. Data yang dihapus: ");
        datahapus.Tampil();
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List masih kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa06 datahapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus. Data yang dihapus: ");
        datahapus.Tampil();
    }
    public void add(int index, Mahasiswa06 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        } if (index == 0) {
            addFirst(data);
            return;
        }
        Node06 current = head;
        int i = 0;
            while (current != null && i < index - 1) {
                current = current.next;
                i++;
            } if (current == null) {
                addLast(data);
            } else if (current == tail) {
                addLast(data);
            } else {
                Node06 newNode = new Node06(data);
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
                System.out.println("Node berhasil ditambahkan pada indeks ke-" + index);
            }
    }
    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus.");
            return;
    } Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        } if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " yang bisa dihapus.");
            return;
        }
        Node06 toRemove = current.next;
        Mahasiswa06 removedData = toRemove.data;
            if (toRemove == tail) {
                tail = current;
                current.next = null;
            } else {
                current.next = toRemove.next;
                toRemove.next.prev = current;
            }
            System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus. Data yang terhapus:");
            removedData.Tampil();
    }
    public void remove(int index) {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa menghapus.");
        return;
    } if (index < 0) {
        System.out.println("Indeks tidak valid.");
        return;
    } if (index == 0) {
        removeFirst();
        return;
    }
    Node06 current = head;
    int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        } if (current == null) {
            System.out.println("Indeks di luar jangkauan.");
            return;
        }
        Mahasiswa06 removedData = current.data;
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                System.out.println("Node pada indeks ke-" + index + " berhasil dihapus. Data yang terhapus:");
                removedData.Tampil();
            }
    }
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data pertama dalam list:");
            head.data.Tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data terakhir dalam list:");
            tail.data.Tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        } if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        Node06 current = head;
        int i = 0;
            while (current != null && i < index) {
                current = current.next;
                i++;
            } if (current == null) {
                System.out.println("Indeks melebihi jumlah elemen.");
            } else {
                System.out.println("Data pada indeks ke-" + index + ":");
                current.data.Tampil();
            }
    }
    public int size() {
        int count = 0;
        Node06 current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
    }
}