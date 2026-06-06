// Nama: Muhammad Ferdy Firdaus
// NPM : 2410010232
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Data Mining", "AI"};
        System.out.println("=== Daftar Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        KelasKuliah kelas = new KelasKuliah();

        System.out.println("\n=== Data Mahasiswa ===");
        kelas.tampilkanSemua();

        System.out.println("\nRata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah mahasiswa lulus: " + kelas.jumlahLulus());

        
        kelas.tambahMahasiswa(new Mahasiswa("Muhammad Ferdy Firdaus ", "2210010232", 85));
        System.out.println("\nSetelah menambah 1 mahasiswa baru:");
        System.out.println("Jumlah data terbaru: " + kelas.getJumlahMahasiswa());
        
        // tampilkan semua data setelah penambahan
System.out.println("\n=== Data Mahasiswa Terbaru ===");
kelas.tampilkanSemua();

    }
}
