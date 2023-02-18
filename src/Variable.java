public class Variable {
    public static void main(String[] args) {

        // Variabel : tempat untuk menyimpan data
        //  Java adalah language static type, jdi kalo di static type language
           //sebuah variabel hanya bisa digunakan untuk menyimpan tipe data yang sama,
            //tidak bisa berubah-ubah tipe data seperti di bahasa pemrograman PHP atau JavaScript
        // Untuk membuat variabel di Java kita bisa  menggunakan nama tipe data lalu diikuti dengan nama variabel nya
        // Syarat yg harus digunakan saat membuat variabel tidak boleh mengandung/membuat whitespace (spasi, enter,tab)
            //contoh : nur syifa yg benar yaitu nursyifa (harus digabung)
            //kalo menambahkan angka tidak seluruhnya angka misal : nur99


        //variable yg disimpan di string
        String name;
        name = "Nursyifa Septiani";

        int age = 17;
        String address =  "Indonesia";

        System.out.println(age);
        System.out.println(address);
        System.out.println(name);

        //mengubah value variable name
        name = "Kim Teahyung";
        System.out.println(name);


        // Syntax var
        // Sejak versi java 10 Java mendukung pembuatan variable dengan kata kunci var, sehingga kita tidak perlu untuk menyebutkan tipe datanya.
        // Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variabel, kita harus menginisiasi value/ nilai dari variabel tersebut secara langsung.

        var firstName = "Jeon";
        var  lastName = "Jongkook";

        var company = "Army is BTS";
        System.out.println(company);

        System.out.println(firstName);
        System.out.println(lastName);

        //konstan. value dari kata kunci final tidak bisa diubah stlah pertama kali diset datanya
        final String application = "Belajar Java";

    }
}
