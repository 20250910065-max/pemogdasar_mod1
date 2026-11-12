public class LATIHAN1_2 {
    public static void main(String[] args) {

        String[] nama = new String[3];
        String[] jurusan = new String[3];
        String[] kelas = new String[3];
        int[] jumlah = new int[3];
        int[] harga = new int[3];
        int[] bayar = new int[3];

        nama[0] = "Yuzkin";
        nama[1] = "Salsabila";
        nama[2] = "Eza";

        jurusan[0] = "Bandung";
        jurusan[1] = "Jakarta";
        jurusan[2] = "Bandung";

        kelas[0] = "Ekonomi";
        kelas[1] = "Bisnis";
        kelas[2] = "Bisnis";

        jumlah[0] = 2;
        jumlah[1] = 1;
        jumlah[2] = 3;

        harga[0] = 20000;
        harga[1] = 60000;
        harga[2] = 40000;

        for (int i = 0; i < nama.length; i++) {
            bayar[i] = jumlah[i] * harga[i];
        }

        System.out.println("==================================================================================");
        System.out.printf("%-4s %-15s %-12s %-12s %10s %10s %10s%n",
                "No", "Nama Pembeli", "Jurusan", "Kelas", "Jum Tiket", "Harga", "Bayar");
        System.out.println("==================================================================================");

        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-4d %-15s %-12s %-12s %10d %10d %10d%n",
                    (i + 1), nama[i], jurusan[i], kelas[i],
                    jumlah[i], harga[i], bayar[i]);
        }

        System.out.println("==================================================================================");
    }
}