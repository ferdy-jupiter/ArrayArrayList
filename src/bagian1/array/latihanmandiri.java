
package bagian1.array;

public class latihanmandiri {
    public static void main(String[] args) {
    //suhu
    double[] suhu = {90, 60, 50, 80, 99, 70};
    double maxSuhu = suhu[0];
        double minSuhu = suhu[0];
        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > maxSuhu) {
                maxSuhu = suhu[i];
            }
            if (suhu[i] < minSuhu) {
                minSuhu = suhu[i];
            }
        }
        System.out.println("Suhu tertinggi: " + maxSuhu);
        System.out.println("Suhu terendah: " + minSuhu);
        //hari
  String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("Hari dengan >5 huruf:");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
        //angka genap
        int[] angka = {2, 4, 15, 16, 23, 42};
        int jumlahGenap = 0;
        for (int a : angka) {
            jumlahGenap += (a % 2 == 0) ? 1 : 0;
        }
        System.out.println("Jumlah angka genap: " + jumlahGenap);
    }
}
