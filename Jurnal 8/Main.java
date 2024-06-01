import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mapping mahasiswaList = new Mapping();

        while (true) {
            System.out.println("Pilih opsi: \n1. Tambah data mahasiswa \n2. Hapus data mahasiswa \n3. Simpan nilai mahasiswa \n4. Tampilkan nilai mahasiswa \n5. Keluar");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.next();
                    scanner.nextLine();  // konsumsi newline
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.nextLine();

                    mahasiswaList.tambahMahasiswa(new Mahasiswa(nim, nama, kelas));
                    System.out.println("Data mahasiswa berhasil ditambahkan");
                    break;
                case 2:
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.next();
                    scanner.nextLine();  // konsumsi newline
                    System.out.print("Masukkan Nama: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    kelas = scanner.nextLine();

                    mahasiswaList.hapusMahasiswa(new Mahasiswa(nim, nama, kelas));
                    System.out.println("Data mahasiswa berhasil dihapus");
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.next();
                    scanner.nextLine();  // konsumsi newline
                    System.out.print("Masukkan Nama: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    kelas = scanner.nextLine();
                    System.out.print("Masukkan Nilai: ");
                    double nilai = scanner.nextDouble();

                    mahasiswaList.simpanNilai(new Mahasiswa(nim, nama, kelas), nilai);
                    System.out.println("Nilai mahasiswa berhasil disimpan");
                    break;
                case 4:
                    mahasiswaList.tampilkanNilai();
                    System.out.println("Rata-rata nilai: " + mahasiswaList.hitungRataRata()); 
                    break;
                case 5:
                    System.out.println("Program selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}
