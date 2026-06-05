
package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArraylist {
    public static void main(String[] args) {
        // daftar belanja
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("sabun");
        daftarBelanja.add("Gula");
        daftarBelanja.add("permen");
        daftarBelanja.add("Odol");

        
        daftarBelanja.remove(1);

        System.out.println("Isi daftar belanja:");
        for (String item : daftarBelanja) {
            System.out.println(item);
        }
        System.out.println("Jumlah item: " + daftarBelanja.size());

        // angka
        ArrayList<Integer> angkaList = new ArrayList<>();
        angkaList.add(16);
        angkaList.add(10);
        angkaList.add(5);
        angkaList.add(19);
        angkaList.add(12);

        int max = angkaList.get(0);
        for (int a : angkaList) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Nilai terbesar: " + max);

        //nama awalan a
        ArrayList<String> namaList = new ArrayList<>();
        namaList.add("Arsya");
        namaList.add("Melvin");
        namaList.add("Ali");
        namaList.add("Rifky");
        namaList.add("Arief");
        namaList.add("Syadik");

        System.out.println("Nama yang diawali huruf A:");
        for (String n : namaList) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
