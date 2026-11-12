import java.util.Scanner;

public class latihan_01 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String Nama, Jurusan, Kelas;
        int JTiket=0,Harga=0;

        System.out.print("Masukan Nama : ");
        Nama = input.nextLine();
        System.out.print("Kode (Bandung / Jakarta) : ");
        Jurusan = input.nextLine();
        System.out.print("Kelas (Bisnis / Ekonomi) : ");
        Kelas = input.nextLine();
        System.out.print("Jumlah Tiket  : ");
        JTiket = input.nextInt();

        System.out.println("\n\n\n");
        System.out.println("Nama Pembeli : " + Nama );
        System.out.println("Jurusan : " + Jurusan );
        System.out.println("Kelas : " + Kelas );
        System.out.println("Jumlah Tiket : " + JTiket );
        if (Jurusan.equals("Bandung") && Kelas.equals("Bisnis")) {
            Harga=40000;
        }else if(Jurusan.equals("Jakarta") && Kelas.equals("Bisnis")) {
            Harga=60000;
        }else if(Jurusan.equals("Bandung") && Kelas.equals("Ekonomi")) {
            Harga=20000;
        }else if (Jurusan.equals("Jakarta") && Kelas.equals("Ekonomi")) {
            Harga=40000;
        }


        System.out.println("Harga : " + String.valueOf(Harga));
        System.out.println("Jumlah Bayar : " + String.valueOf(JTiket*Harga));
    }
    }
    
