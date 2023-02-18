public class OperasiBoolean {
    public static void main(String[] args) {


        // Operasi boolean adalah operasi yang digunakan untuk 2 data boolean
        // Operasi &&
        // Operasi ||
        // Operasi !


        // Buat variable absen dan nilai akhir
        var absen = 70;
        var nilaiAkhir = 80;


        // Kondisi jika variable absen dan nilai akhir >= 75 maka nilainya true
        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        //
        boolean lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);




    }
}