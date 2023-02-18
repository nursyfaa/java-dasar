public class TenaryOperator {
    public static void main(String[] args) {

        //Tanpa Tenary Operator
        var nilai = 70;
        String ucapan;

        if(nilai >= 75){
            ucapan = "Selamat Anda Lulus!";
        }else {
            ucapan = "Maaf Anda Tidak Lulus";
        }

        System.out.println(ucapan);

        //Dengan Tenary Operator
        var nilai2 = 75;
        String ucapan2 = nilai2 >= 75 ? "Selamat, Anda lulus" : "Maaf, Anda Tidak Lulus";

        System.out.println(ucapan2);

    }
}
