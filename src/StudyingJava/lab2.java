package StudyingJava;

public class lab2 {
    public static void main (String [] args){
    int x = 10;
    System.out.println("В начале цикла, x = " +x);
        while (x > 0){
            System.out.println("Значение x = " +x --);
            if (x == 3) {
                System.out.println("x = " +x--);
            }
    }
        System.out.println("Значение в конце цикла, x = " +x);
    }
}
