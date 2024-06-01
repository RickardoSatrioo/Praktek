public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = nim.hashCode();
        result = prime * result + nama.hashCode();
        result = prime * result + kelas.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Mahasiswa other = (Mahasiswa) obj;
        return nim.equals(other.nim) && nama.equals(other.nama) && kelas.equals(other.kelas);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    @Override
    public String toString() {
        return "Mahasiswa [NIM=" + nim + ", Nama=" + nama + ", Kelas=" + kelas + "]";
    }
}
