public class SwitchStatement {
    public static void main(String[] args) {

        // Switch adalah statement percabangan yang sma dengan if, namun lebih sederhana cara pembuatannya
        // Kondisi switch statement hanya untuk perbandingan ==

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Woaw Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");

        }

        // Switch Lambda
        // Lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi
        // menggunakan kata kunci break

        switch (nilai){
            case "A" -> System.out.println("Kamu lulus dengan baik!)");
            case "B", "C" -> System.out.println("Kamu lulus!");
            case "D" -> {
                System.out.println("Kamu tidak lulus!");
            }
            default -> System.out.println("Kamu salah jurusan!");
        }

        // Syntax yield for return value
        String ucapan = switch (nilai){
            case "A" :
                yield "Kamu lulus dengan baik!)";
            case "B", "C" :
                yield  "Kamu lulus!";
            case "D" :
                yield "Kamu tidak lulus!";
            default :
                yield "Kamu salah Coba Lagi";
        };
        System.out.println(ucapan);

    }
}