package StudyingJava;

public class lab9 { //головоломка у басейна стр.54
    public static void main(String[] args) {
        int x = 0;
   while (x < 4) {
       x = x - 1;

       if (x < 1) {
           System.out.print("а ");
           System.out.print("noise");
           x = x + 1;
       }

       if (x > 0) {
           System.out.print("an");
       }

       if (x == 1) {
           System.out.print("noys");
       }

       if (x > 1) {
           System.out.print(" oyster");
       }

       System.out.println("");
        x = x + 2;
    }
    }
}
// на решение потратил пять часов