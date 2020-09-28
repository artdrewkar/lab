package StudyingJava;

public class Hobbits {
    String name;

    public static void main (String[] args) {

        Hobbits [] h = new Hobbits[4];
        int z = 0;

        while (z < 3) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Бильбо";
            if (z == 1) {
                h[z].name = "Фордо";
            }
            if (z == 2) {
                h[z].name = "Сэм";
            }
            System.out.print(h[z].name + " -- ");
            System.out.println("имя хорошего хоббита");
        }
    }
}
