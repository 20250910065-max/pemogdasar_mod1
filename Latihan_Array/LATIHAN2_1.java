public class LATIHAN2_1 {
    public static void main(String[] args) {

        String[] nama = new String[3];
        String[] kodeBarang = new String[3];
        String[] namaBarang = new String[3];
        int[] jumlah = new int[3];
        int[] harga = new int[3];
        int[] bayar = new int[3];

        nama[0] = "Yuzkin";
        nama[1] = "Salsabila";
        nama[2] = "Eza";

        kodeBarang[0] = "A01";
        kodeBarang[1] = "B02";
        kodeBarang[2] = "C02";

        namaBarang[0] = "Hardisk";
        namaBarang[1] = "Monitor";
        namaBarang[2] = "Mouse";

        jumlah[0] = 2;
        jumlah[1] = 1;
        jumlah[2] = 3;

        harga[0] = 700000;
        harga[1] = 800000;
        harga[2] = 50000;

        for (int i = 0; i < nama.length; i++) {
            bayar[i] = jumlah[i] * harga[i];
        }

        System.out.println("==================================================================================");
        System.out.printf("%-4s %-15s %-12s %-12s %10s %10s %10s%n",
                "No", "Nama Pembeli", "KodeBarang", "NamaBarang",
                "Jumlah", "Harga", "Bayar");
        System.out.println("==================================================================================");

        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-4d %-15s %-12s %-12s %10d %10d %10d%n",
                    (i + 1), nama[i], kodeBarang[i], namaBarang[i],
                    jumlah[i], harga[i], bayar[i]);
        }

        System.out.println("==================================================================================");
    }
}