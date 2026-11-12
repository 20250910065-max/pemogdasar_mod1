import java.util.Locale;
public class Latihan_MOD3 {
    public static void main(String[] args) {
        Locale id = Locale.of("id", "ID");

        String[] nama = new String[2];
        String[] jabatan = new String[2];
        int[] gapok = new int[2];
        int[] tunjangan = new int[2];

        nama[0] = "RADIT"; nama[1] = "JANI";

        jabatan[0] = "DIREKTUR"; jabatan[1] = "MANAGER";

        gapok[0] = 10000000;
        gapok[1] = 8000000;

        tunjangan[0] = 5000000;
        tunjangan[1] = 3500000;

        System.out.println("=================================================================");
        System.out.printf("%-4s %-12s %-12s %14s %14s%n", "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");
        System.out.println("=================================================================");

        for (int i = 0; i < nama.length; i++) {
            String g = String.format(id, "%,d", gapok[i]);
            String t = String.format(id, "%,d", tunjangan[i]);
            System.out.printf("%-4d %-12s %-12s %14s %14s%n", (i + 1), nama[i], jabatan[i], g, t);
        }

        System.out.println("=================================================================");
    }
}