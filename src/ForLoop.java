public class ForLoop {
    public static void main(String[] args) {

        // For adalah salah kata kunci yang bisa digunakan untuk melakukan perulangan
        // Blok kode yang  terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi


        //for(;;){
        // Infinity Looping
        // System.out.println("Looping"); // Deadlock or stuck
        // }

        // Looping with init statement
        for (var counter = 1; counter <= 10; counter++ ){
            System.out.println("Perulangan ke-" + counter);

        }
    }
}
