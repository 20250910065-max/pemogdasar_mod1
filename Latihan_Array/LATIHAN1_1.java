public class LATIHAN1_1 {
    public static void main(String[] args) {
        String[] nim = new String[3];
        String[] nama = new String[3];
        int[] uts = new int[3];
        int[] uas = new int[3];
        double[] nilaiAkhir = new double[3];
        char[] index = new char[3];

        nim[0] = "001"; nama[0] = "Dadan"; uts[0] = 80; uas[0] = 80; nilaiAkhir[0] = 80;   index[0] = 'A';
        nim[1] = "002"; nama[1] = "Didin"; uts[1] = 75; uas[1] = 80; nilaiAkhir[1] = 77.5; index[1] = 'B';
        nim[2] = "003"; nama[2] = "Deden"; uts[2] = 60; uas[2] = 80; nilaiAkhir[2] = 65;   index[2] = 'C';

        System.out.println("==========================================================");
        System.out.println("No\tNim\tNama\tUTS\tUAS\tNilai Akhir\tIndex");
        System.out.println("==========================================================");

        for (int i = 0; i < nim.length; i++) {
            String hasil;
            if (nilaiAkhir[i] == (int) nilaiAkhir[i]) {
                hasil = "" + (int) nilaiAkhir[i];
            } else {
                hasil = "" + nilaiAkhir[i];
            }
            System.out.println((i + 1) + "\t" + nim[i] + "\t" + nama[i] + "\t" + uts[i] + "\t" + uas[i] + "\t" + hasil + "\t\t" + index[i]);
        }
        System.out.println("==========================================================");
    }
}