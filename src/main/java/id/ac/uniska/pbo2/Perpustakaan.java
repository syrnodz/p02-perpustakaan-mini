package id.ac.uniska.pbo2;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Koleksi> daftarKoleksi = new ArrayList<>();

    public void tambahKoleksi(Koleksi k) {
        daftarKoleksi.add(k);
    }

    public List<Koleksi> cariJudul(String kataKunci) {
        List<Koleksi> hasil = new ArrayList<>();
        for (Koleksi k : daftarKoleksi) {
            if (k.getJudul().toLowerCase().contains(kataKunci.toLowerCase())) {
                hasil.add(k);
            }
        }
        return hasil;
    }
}