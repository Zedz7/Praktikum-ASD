package Pertemuan14;
public class binaryTreeArray06 {
    mahasiswa06[] dataMahasiswa;
    int idxLast;

    public binaryTreeArray06() {
        this.dataMahasiswa = new mahasiswa06[10];
    }

    void populateData(mahasiswa06 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2); 
            }
        }
    }
}
