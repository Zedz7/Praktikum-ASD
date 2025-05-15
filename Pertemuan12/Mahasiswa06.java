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
        System.out.println(nama + "     " + nim + "     " + kelas + "       " + ipk);
    }
}
