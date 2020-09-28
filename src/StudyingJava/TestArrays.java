package StudyingJava;

public class TestArrays {
    public static void main (String [] args) {
    int y = 0; //объявляем переменную
    String [] islands = new String[4]; //создаем массив типа String
    int [] index = new int[4]; //создаем массив типа int

    // и поместим в него несколько элементов
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        islands[0] = "Бермуды"; // Теперь получаем доступ к объектам DOG
        islands[1] = "Фиджи";   // с помощью ссылок из массива
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        // теперь переберем все элементы массива
        //int y = 0; //объявляем переменную
        int ref;

        while (y < 4){
        ref = index[y];
        y = y + 1;
        System.out.println(islands[ref]); //выведим значения

    }
    }
}
