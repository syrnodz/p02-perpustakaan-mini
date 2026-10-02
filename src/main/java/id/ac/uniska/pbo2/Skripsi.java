package id.ac.uniska.pbo2;

public class Skripsi extends Koleksi {
    private String penulis;
    private String programStudi;

    public Skripsi(String id, String judul, int tahunTerbit, String penulis, String programStudi) {
        super(id, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }

    public String getPenulis() { return penulis; }
    public String getProgramStudi() { return programStudi; }

    @Override
    public int batasHariPinjam() {
        return 0;
    }

    @Override
    public boolean pinjam() {
        return false;
    }

    @Override
    public int hitungDenda(int keterlambatanHari) {
        return 0; // Denda selalu 0
    }

    @Override
    public String keterangan() {
        return "penulis serta program studi";
    }
}