public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80, 60, 75, 65, 50};
        sayCongrats( "Nursifa", values);

        sayCongrats("Jimin", 90, 80, 76, 80);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalvalue = total / values.length;

        if (finalvalue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}

