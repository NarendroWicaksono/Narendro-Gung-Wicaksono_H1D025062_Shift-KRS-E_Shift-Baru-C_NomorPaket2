public class Main {
    public static void main(String[] args) {

        System.out.println("[1] State dan Behavior");
        Pertalite pertalite = new Pertalite("BB-01", 10000);
        pertalite.tampilkanInfo();
        System.out.println("Total beli 5 liter: Rp" + pertalite.hitungTotal(5));

        System.out.println("\n[2] Immutability");
        System.out.println("Konstanta NAMA_SPBU : " + BahanBakar.NAMA_SPBU);
        System.out.println("Konstanta STOK_AWAL : " + BahanBakar.STOK_AWAL);
        System.out.println("Atribut final kode  : " + pertalite.getKode());

        System.out.println("\n[3] Enkapsulasi dan Overloading");
        Pertamax pertamax1 = new Pertamax("BB-02", 13500, 95);
        Pertamax pertamax2 = new Pertamax("BB-03", 14000);
        System.out.println("Oktan konstruktor 1: " + pertamax1.getOktan());
        System.out.println("Oktan konstruktor 2: " + pertamax2.getOktan());
        pertamax1.setHarga(13800);
        System.out.println("Harga setelah setter: Rp" + pertamax1.getHarga());

        System.out.println("\n[4]-[7] Inheritance, Super Chaining, Overriding, Abstract");
        BahanBakar[] daftar = {pertalite, pertamax1};
        for (BahanBakar bb : daftar) {
            bb.tampilkanInfo();
        }

        System.out.println("\n[8] Logika State Percabangan");
        System.out.println("Isi 20 liter Pertalite:");
        System.out.println("Berhasil? " + pertalite.layani(20));
        System.out.println("Isi 50 liter Pertalite:");
        System.out.println("Berhasil? " + pertalite.layani(50));
        pertalite.tampilkanInfo();

        System.out.println("\n[9] Polimorfisme Interface");
        Pengisian p1 = new Pertalite("BB-04", 10000);
        Pengisian p2 = new Pertamax("BB-05", 13500);
        p1.isiTangki(10);
        p2.isiTangki(1500);

        System.out.println("\n[10] Multiple Interface");
        Pertalite pl = new Pertalite("BB-06", 10000);
        Pengisian pengisian = pl;
        Struk struk = pl;
        pengisian.isiTangki(8);
        System.out.println(struk.cetakStruk(8));
    }
}
