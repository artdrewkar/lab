package StudyingJava;

public class Dogs {
    String name;
    public static void main (String[] args) {

        // СОЗДАЕМ объект DOG и получаем к нему доступ
        Dogs dog1 = new Dogs();
        dog1.bark();
        dog1.name = "Барт";

        // теперь создаем массив типа Dog
        Dogs[] myDogs = new Dogs[3];
        // и поместим в него несколько элементов
        myDogs[0] = new Dogs();
        myDogs[1] = new Dogs();
        myDogs[2] = dog1;

        // Теперь получаем доступ к объектам DOG
        // с помощью ссылок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        // хммммм... какое имя у MyDogs[2]?
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        // теперь переберем все элементы массива
        // и вызовем для каждого метода bark()
        int x = 0;
        while (x < myDogs.length) { // массивы содержат переменную length
            // которая предоставляет количество хранимых элементов
            myDogs[x].bark();
            x = x + 1;
        }
    }
            public void bark() {
                System.out.println(name + " сказал Гав!");
            }
            public void eat() {}
            public void chaseCat() {}



}
