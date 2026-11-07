public class Pertamax extends BahanBakar implements Pengisian {

    private int oktan;

    public Pertamax(String kode, double harga, int oktan) {
        super(kode, "Pertamax", harga);
        this.oktan = oktan;
    }

    public Pertamax(String kode, double harga) {
        this(kode, harga, 92);
    }

    public int getOktan() { return oktan; }
    public void setOktan(int oktan) { this.oktan = oktan; }

    @Override
    public boolean layani(double liter) {
        if (liter > getStok()) {
            System.out.println("Ditolak: stok Pertamax tidak cukup.");
            return false;
        } else {
            setStok(getStok() - liter);
            return true;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Oktan: RON " + oktan);
    }

    @Override
    public void isiTangki(double liter) {
        if (layani(liter)) {
            System.out.println("Pengisian " + liter + " liter Pertamax berhasil.");
        } else {
            System.out.println("Pengisian Pertamax gagal.");
        }
    }
}
