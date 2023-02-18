public class Continue {
    public static void main(String[] args) {

        //continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya

        for(var counter = 1; counter <= 1000; counter++){
            if(counter % 2 == 0) {
                continue;
            }

            System.out.println("perulangan ganjil" + counter);
        }
    }
}
