public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        //  Tipe  data bukan primitif bisa memiliki method/function

        // long adalah primitif. sedangkan Long bukan primitif
        // int adalah primitif. sedangkan Integer bukan primitif
        // char adalah primitif. sedangkan Character bukan primitif
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        // Jika variable non primitif tidak diisi, null value agar bisa di print
        Byte iniByte = null; // non primitif tidak memiliki default value
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        // Konversi primitif ke non primitif
        int iniInt = 500;
        Integer iniObject = iniInt;

        //ketika konversi lintas tipe data primitif ke non primitif Harus menggunakan .xValue();
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 100000L;
        long amount2 = amount.longValue();
            //jadi semua tipe data non primitif punya function/method seperti .xValue(); ini, tinggal menggunakannya saja
        //untuk menkonversi dari yg non primitif ke primitif.
    }
}