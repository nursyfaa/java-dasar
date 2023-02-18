public class IfStatement {
    public static void main(String[] args) {

                    // if statemnet

                    // dalam java if adalah salah satu kunci yang digunakan untuk percabangan
                    //  Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenihu
                    // hampir di semua bahasa pemorgram mendukung if expression

                var nilairatarata =90;
                var absen = 80;

                if (nilairatarata >= 85 && absen >=80) {
                    System.out.println("Anda lulus!");

                    //ifelse statement
                } else {
                    System.out.println("Anda tidak Lulus!");
                }


                    // Else if Statement

                    // Kada dalam if, kita butuh membuat beberapa kondisi
                    // Kasus seperti ini di java kita bisa menggunakan else if expression
                    // Else if di java bisa lebih dari satu
                if (nilairatarata >= 90 && absen >= 80){
                     System.out.println("Nilai anda A");
                } else if (nilairatarata >= 70 && absen >= 70) {
                     System.out.println("Nilai anda B");
                } else if (nilairatarata >= 60 && absen >= 60) {
                     System.out.println("Nilai anda C");
                } else {
                    System.out.println("Nilai anda D");


                }
            }
        }

