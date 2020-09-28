package StudyingJava;

public class lab7_c {//в примере не объявлен метод main. Без этого программа не будет компилироваться.
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("маленький икс");
            }
        }
    }
}
