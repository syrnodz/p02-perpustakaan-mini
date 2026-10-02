package id.ac.uniska.pbo2;

import java.util.List;

public class AplikasiPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("B002", "Cara Menjadi Karbit", 2008, "Robert C. Martin");
        Skripsi skripsi1 = new Skripsi("S001", "Rancang Bangun System...", 2023, "Siti Rahmah", "Informatika");

        perpustakaan.tambahKoleksi(buku1);
        perpustakaan.tambahKoleksi(skripsi1);

        String kataKunci = "Karbit";
        List<Koleksi> hasilCari = perpustakaan.cariJudul(kataKunci);
        System.out.println("Hasil pencarian \"" + kataKunci + "\": " + hasilCari.size() + " koleksi");
        for (Koleksi k : hasilCari) {
            System.out.println(k);
        }

        System.out.println();

        boolean statusPinjam = skripsi1.pinjam();
        if (!statusPinjam) {
            System.out.println("Siti Rahmah meminjam " + skripsi1.getId() + ": gagal");
        }
    }
}