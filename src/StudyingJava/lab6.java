package StudyingJava;
class lab6 { //Лабораторная "магнитики с кодом" стр.50
    public static void main (String[] args) {

        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("а");
            } // x=2 > x=3 - выводится а

            x = x - 1;
            System.out.print("-"); //x - 1 & выводится знак "-"

            if (x == 2) {
                System.out.print("b c");
            } // x=2 = x=2 - выводится b c

            if (x == 1) {
                System.out.print("d");
                x = x - 1; // x=1 = x=1 - выводится d и сразу минусутся 1 чтобы закрыть цикл
            } //закрывается последнее ветвление
        } //закрывается цикл
    } // закрывается метод main
} // закрывается class

