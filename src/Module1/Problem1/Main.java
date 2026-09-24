package Module1.Problem1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String Name = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String BirthPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        String BirthDay = input.nextLine();

        System.out.print("Masukkan Bulan Lahir: ");
        int Case = input.nextInt();
        input.nextLine();

        String BirthMoon = "";

        switch (Case) {
            case 1:
                BirthMoon = ("Januari");
                break;
            case 2:
                BirthMoon = ("Februari");
                break;
            case 3:
                BirthMoon = ("Maret");
                break;
            case 4:
                BirthMoon = ("April");
                break;
            case 5:
                BirthMoon = ("Mei");
                break;
            case 6:
                BirthMoon = ("Juni");
                break;
            case 7:
                BirthMoon = ("Juli");
                break;
            case 8:
                BirthMoon = ("Agustus");
                break;
            case 9:
                BirthMoon = ("September");
                break;
            case 10:
                BirthMoon = ("Oktober");
                break;
            case 11:
                BirthMoon = ("November");
                break;
            case 12:
                BirthMoon = ("Desember");
                break;
        }

        System.out.print("Masukkan Tahun Lahir: ");
        String BirthYear = input.nextLine();

        System.out.print("Masukkan Tinggi Badan: ");
        String BodyHeight = input.nextLine();

        System.out.print("Masukkan Berat Badan: ");
        String BodyWeight = input.nextLine();

        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %s %s %s Tinggi Badan %s cm dan Berat Badan %s kilogram", Name, BirthPlace, BirthDay, BirthMoon, BirthYear, BodyHeight, BodyWeight);
    }
}
