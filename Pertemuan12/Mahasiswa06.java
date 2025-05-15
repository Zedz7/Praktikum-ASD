package Pertemuan12;

public class Mahasiswa06 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa06() {

    }
    public Mahasiswa06(String nm, String name, String kls, double ip) {
        this.nama = name;
        this.nim = nm;
        this.kelas = kls;
        this.ipk = ip;
    }
    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %-4.1f\n", 
        nama, nim, kelas, ipk);
    }
}
