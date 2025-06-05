public class Mahasiswa06 {
    String nim;
    String nama;
    String prodi;
    String kelas;
    public int ipk;

    public Mahasiswa06(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
    public void tampilInformasi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilInformasi'");
    }
}