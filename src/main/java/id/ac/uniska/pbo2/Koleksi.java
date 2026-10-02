package id.ac.uniska.pbo2;

public abstract class Koleksi {
    private String id;
    private String judul;
    private int tahunTerbit;

    public Koleksi(String id, String judul, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String getId() { return id; }
    public String getJudul() { return judul; }
    public int getTahunTerbit() { return tahunTerbit; }

    public abstract int batasHariPinjam();
    public abstract boolean pinjam();
    public abstract int hitungDenda(int keterlambatanHari);
    public abstract String keterangan();

    @Override
    public String toString() {
        return "[" + id + "] " + judul + " (" + tahunTerbit + "), " + keterangan();
    }
}