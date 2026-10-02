package id.ac.uniska.pbo2;

public class Buku extends Koleksi {
    private String penulis;
    private boolean dipinjam = false;

    public Buku(String id, String judul, int tahunTerbit, String penulis) {
        super(id, judul, tahunTerbit);
        this.penulis = penulis;
    }

    @Override
    public int batasHariPinjam() { return 14; }

    @Override
    public boolean pinjam() {
        if (!dipinjam) {
            dipinjam = true;
            return true;
        }
        return false;
    }

    @Override
    public int hitungDenda(int keterlambatanHari) {
        return keterlambatanHari * 1000;
    }

    @Override
    public String keterangan() {
        return "Buku karya " + penulis;
    }

    @Override
    public String toString() {
        String status = dipinjam ? "[TERPINJAM]" : "[TERSEDIA]";
        return status + " " + super.getId() + " " + super.getJudul() + " (" + super.getTahunTerbit() + "), " + keterangan();
    }
}