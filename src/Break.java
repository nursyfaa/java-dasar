public class Break {
    public static void main(String[] args) {

        // Break & Continue

        // Pada swicth statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
        // break juga digunakan untuk  menghentikan seluruh perulangan

        var counter = 1;

        while (true) {
            System.out.println("Perulangan" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan Berhenti");

    }
}
