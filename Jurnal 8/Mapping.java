import java.util.HashMap;

public class Mapping {
    private HashMap<Mahasiswa, Double> mahasiswaMap = new HashMap<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaMap.put(mahasiswa, 0.0);
    }

    public void hapusMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaMap.remove(mahasiswa);
    }

    public void simpanNilai(Mahasiswa mahasiswa, double nilai) {
        mahasiswaMap.put(mahasiswa, nilai);
    }

    public void tampilkanNilai() {
        for (HashMap.Entry<Mahasiswa, Double> entry : mahasiswaMap.entrySet()) {
            System.out.println("NIM: " + entry.getKey().getNim());
            System.out.println("Nama: " + entry.getKey().getNama());
            System.out.println("Kelas: " + entry.getKey().getKelas());
            System.out.println("Nilai: " + entry.getValue());
            System.out.println("-----------");
        }
    }

    public double hitungRataRata() {
        double totalNilai = 0;
        for (double nilai : mahasiswaMap.values()) {
            totalNilai += nilai;
        }
        return totalNilai / mahasiswaMap.size();
    }
}
