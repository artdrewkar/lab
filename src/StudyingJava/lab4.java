package StudyingJava;

public class lab4 { //Песня 99 бутылок пива стояло на полке стр.44
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "бутылок";
        while (beerNum > 0) {
            if ((beerNum == 1) || (beerNum == 21) || (beerNum == 31) || (beerNum == 41) || (beerNum == 51) ||
                    (beerNum == 61) || (beerNum == 71) || (beerNum == 81) || (beerNum == 91)){
                word = "бутылка"; //в единственном числе - ОДНА бутылка
                //System.out.println(beerNum + " " + word + " пива на полке");
            }
            if ((beerNum > 1) && (beerNum < 5)) {
                word = "бутылки"; // 5 бутылок, но 4, 3, 2 бытылки
                //System.out.println(beerNum + " " + word + " пива на полке");
            }
            if ((beerNum > 4 && beerNum < 21) || (beerNum > 21 && beerNum < 31) || (beerNum > 31 && beerNum < 41) ||
                    (beerNum > 41 && beerNum < 51) || (beerNum > 51 && beerNum < 61) ||
                    (beerNum > 61 && beerNum < 71) || (beerNum > 71 && beerNum < 81) ||
                    (beerNum > 81 && beerNum < 91)) {
                word = "бутылок"; // 5 бутылок
                //System.out.println(beerNum + " " + word + " пива на полке");
            }
            System.out.println(beerNum + " " + word + " пива на полке,");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            System.out.println(" ");
            beerNum = beerNum - 1;
            if (beerNum == 0) {
                System.out.println("Нет бутылок пива на полке");
                System.out.println("Пора спать!!!");
            }
        } // Конец while
    } // Конец метода main
} // Конец класса
