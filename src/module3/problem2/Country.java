package module3.problem2;

import java.util.HashMap;

public class Country {
    private String countryName;
    private String leadershipType;
    private String leaderName;
    private String independenceDate;
    private String independenceYear;

    public Country(String countryName, String leadershipType, String leaderName, String independenceDate, String independenceYear) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDate = independenceDate;
        this.independenceYear = independenceYear;
    }

    public Country(String countryName, String leadershipType, String leaderName) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public void printInfo() {
        // TODO: Buat HashMap untuk nama bulan dengan type parameter Integer (nomor bulan) dan String (nama bulan)
        //  Hint: HashMap<Type, Parameter> monthNames = new HashMap<>();

        // TODO: Masukkan nilai ke HashMap dengan method .put()
        //  Hint: monthNames.put(1, "Januari");


        // TODO: Gunakan switch-case (atau if-else) untuk menentukan gelar pemimpin
        //  "monarki" -> "Raja"
        //  "presiden" -> "Presiden"
        //  "perdana menteri" -> "Perdana Menteri"
        //  Hint: bisa gunakan .toLowerCase() pada leadershipType (jenis kepemimpinan) jika mau lebih aman
        //        Misal "PREsiden" atau "presiDeN" dsb. bakal jadi "presiden"
        String leaderTitle = switch (this.leadershipType) {
            default -> this.leadershipType;
        };

        // TODO: Print informasi tentang negara
        //  Baris 1: Negara Indonesia mempunyai Presiden bernama Joko Widodo (biarin tetap Jokowi)
        //  Baris 2: Deklarasi Kemerdekaan pada Tanggal 17 Agustus 1945
        System.out.println("Negara " + this.countryName
                + " mempunyai " + (this.leadershipType.equals("monarki") ? "Raja" : (this.leadershipType.substring(0, 1).toUpperCase() + this.leadershipType.substring(1)))
                + " bernama " + this.leaderName
        );

        // TODO: Gunakan if agar baris 2 hanya di-print untuk negara dengan jenis kepemimpinan selain monarki
        System.out.println("Deklarasi Kemerdekaan pada Tanggal "
                + this.independenceDate + " "
                + monthNames.get(independenceMonth) + " "
                + this.independenceYear
        );
    }
}
