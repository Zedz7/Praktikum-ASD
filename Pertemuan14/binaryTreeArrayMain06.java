package Pertemuan14;
public class binaryTreeArrayMain06 {
    public static void main(String[] args) {
        binaryTreeArray06 bta = new binaryTreeArray06();
        mahasiswa06 mhs1 = new mahasiswa06("244160121", "Ali", "A", 3.57);
        mahasiswa06 mhs2 = new mahasiswa06("244160185", "Candra", "C", 3.41);
        mahasiswa06 mhs3 = new mahasiswa06("244160221", "Badar", "B", 3.75);
        mahasiswa06 mhs4 = new mahasiswa06("244160220", "Dewi", "B", 3.35);

        mahasiswa06 mhs5 = new mahasiswa06("244160131", "Devi", "A", 3.48);
        mahasiswa06 mhs6 = new mahasiswa06("244160205", "Ehsan", "D", 3.61);
        mahasiswa06 mhs7 = new mahasiswa06("244160170", "Fizi", "B", 3.86);    

        mahasiswa06[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
