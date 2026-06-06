package tugas;

import java.util.ArrayList;
import java.util.Arrays;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    // constructor langsung isi data awal
    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>(Arrays.asList(
            new Mahasiswa("Ali Husin", "2210010123", 75),
            new Mahasiswa("Ahmad Arsya Zauhuri Ahda", "2410010456", 55),
            new Mahasiswa("Melvin Dwi Setiawan", "2410010789", 90),
            new Mahasiswa("M.Rifky", "2410010098", 60),
            new Mahasiswa("Arief Rahman", "2410010765", 40)
        ));
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilkanSemua() {
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilData();
            System.out.println("-------------------");
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return daftarMahasiswa.isEmpty() ? 0 : total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) count++;
        }
        return count;
    }

    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
