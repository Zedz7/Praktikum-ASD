package TugasJobsheet11;

public class Mahasiswa06 {
    String nama;
    String nim;
    String kelas;

    public Mahasiswa06() {
    }

    public Mahasiswa06(String nm, String name, String kls) {
        this.nama = name;
        this.nim = nm;
        this.kelas = kls;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-10s\n", 
            nama, nim, kelas);
    }
}