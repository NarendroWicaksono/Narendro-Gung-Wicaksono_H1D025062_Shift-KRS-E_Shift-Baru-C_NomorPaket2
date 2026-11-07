public class Pertalite extends BahanBakar implements Pengisian, Struk {

    private double batasPembelian;

    public Pertalite(String kode, double harga, double batasPembelian) {
        super(kode, "Pertalite", harga);
        this.batasPembelian = batasPembelian;
    }

    public Pertalite(String kode, double harga) {
        this(kode, harga, 60);
    }

    public double getBatasPembelian() { return batasPembelian; }
    public void setBatasPembelian(double batasPembelian) { this.batasPembelian = batasPembelian; }

    @Override
    public boolean layani(double liter) {
        if (liter > batasPembelian) {
            System.out.println("Ditolak: melebihi batas pembelian (" + batasPembelian + " liter).");
            return false;
        } else if (liter > getStok()) {
            System.out.println("Ditolak: stok tidak cukup.");
            return false;
        } else {
            setStok(getStok() - liter);
            batasPembelian = batasPembelian - liter;
            return true;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Sisa batas pembelian: " + batasPembelian + " liter");
    }

    @Override
    public void isiTangki(double liter) {
        if (layani(liter)) {
            System.out.println("Pengisian " + liter + " liter Pertalite berhasil.");
        } else {
            System.out.println("Pengisian Pertalite gagal.");
        }
    }

    @Override
    public String cetakStruk(double liter) {
        return "STRUK " + NAMA_SPBU + " | " + getNama() + " " + liter
                + " liter | Total: Rp" + hitungTotal(liter);
    }
}
