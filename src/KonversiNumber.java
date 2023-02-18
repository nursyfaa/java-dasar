public class KonversiNumber {
    public static void main(String[] args) {

        //Konversi Tipe Data Number ada 2 jenis:
        //Widening Casting (otomatis) oleh javanya, aturannya :
        //byte->short->int->long->float->double
        //Narrowing Casting (Manual) oleh javanya, aturannya :
        //double->float->long->int->short->byte

        byte iniByte=  10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float  iniFloat = iniLong;
        double iniDouble = iniFloat;


        int iniInt2 = 1000;

        //konversi manual
        byte iniByte2 = (byte) iniInt2;
        // jika dikonversi akan terjadi number overflow

    }
}
