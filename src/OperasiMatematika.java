public class OperasiMatematika {
    public static void main(String[] args) {

        //Deklarasi Variabel
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assigment adalah operasi ke variabel itu sendiri
        int c = 10000;
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        //  Unary Operator adalah operator yang  ditempatkan di depan variabel
        int d = 200;
        int e = -20;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);

    }
}