public class ForEach {
    public static void main(String[] args) {


     String[] names = {
             "Nur", "Syifa", "Septiani",
             "Orang", "Inspiratif", "Jujur"
     };

     for (var i = 0; i < names.length; i++){
         System.out.println(names[i]);
     }

     //foreaach
     for(var name: names){
         System.out.println(name);
     }
    }
}

