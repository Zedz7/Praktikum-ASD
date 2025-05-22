package Pertemuan13;

public class Mahasiswa06 {
    public String nim;
    public String nama;
    public String kelas;
    public Double ipk;

    public Mahasiswa06(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void Tampil() {
            System.out.println("Nim: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
}