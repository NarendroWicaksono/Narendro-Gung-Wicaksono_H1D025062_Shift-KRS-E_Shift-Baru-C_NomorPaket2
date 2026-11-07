public abstract class BahanBakar {

    public static final String NAMA_SPBU = "SPBU Pertamina Kalimanah";
    public static final double STOK_AWAL = 1000;

    private final String kode;
    private String nama;
    private double harga;
    private double stok;

    public BahanBakar(String kode, String nama, double harga, double stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public BahanBakar(String kode, String nama, double harga) {
        this(kode, nama, harga, STOK_AWAL);
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
    public double getStok() { return stok; }
    public void setStok(double stok) { this.stok = stok; }

    public void tampilkanInfo() {
        System.out.println("[" + kode + "] " + nama + " | Harga: Rp" + harga
                + "/liter | Stok: " + stok + " liter");
    }

    public double hitungTotal(double liter) {
        return liter * harga;
    }

    public abstract boolean layani(double liter);
}
