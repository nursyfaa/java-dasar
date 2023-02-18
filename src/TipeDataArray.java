public class TipeDataArray {
    public static void main(String[] args) {

        // Jumlah data d array tidak bisa berubah setelah  pertama kali dibuat

        //OPERASI DI ARRAY//
            //mengambil panjang array : array.llength

        //mengambil data di array : array[index]
        String[] stringArray;
        stringArray = new String[3]; // panjang nya 3 //

        //menambah data di array
        stringArray[0] = "Nursifa";
        stringArray[1] = "Septiani";
        stringArray[2] = "Army";

        //mengambil atau memanggil data didalam array
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] arrayString2 = new String[3];

        //mengubah atau menambah data di array : array[index] = value
        stringArray[0] = "Michella";
        System.out.println(stringArray[0]);

        //menghapus array = value . klo object = null
        //mengetahui panjang array atau mengambil panjang array

        //salah satu cara array initializer to assign a value to the array.
        int[] intArray = new int[]{
                10, 20, 30, 40, 50
        };

        //bisa juga dngn cara
        long[] longArray = {
                110, 120, 130, 140, 150
        };

        // Array length is fixed, can't delete array
        longArray[0] = 0;

        System.out.println(longArray.length);

        // array dalam array
        String[][] members = {
                {"Nursifa", "Septiani"},
                {"Sofware", "Developer"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}
