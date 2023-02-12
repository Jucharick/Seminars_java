import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Hello {
    // сниппет main
    public static void main(String[] args) {
        // сниппет sout
        System.out.println("Hello, world!");

        // тип        название переменной 
        LocalDateTime now = LocalDateTime.now ();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.mm.YYYY");
        System.out.println(now.toString());
        System.out.println(formatter.format(now));
    }
}