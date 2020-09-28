package StudyingJava;

public class GuessGame { //GuessGame содержит
    Player p1;           //три переменных экземпляра
    Player p2;           //для трех объектов Play
    Player p3;

    public void startGame() { //Создаем три объекта Player
        p1 = new Player();    //и присваиваем трем
        p2 = new Player();    //переменным экземпляра
        p3 = new Player();

        int guessp1 = 0; //объявляем три переменные
        int guessp2 = 0; //для хранения вариантов
        int guessp3 = 0; //от каждого игрока

        boolean p1isRight = false; //объявляем три переменные для хранения
        boolean p2isRight = false; //правильности или неправильности
        boolean p3isRight = false; // (true или false) ответов игроков

        int targetNumber = (int) (Math.random() * 10);        //создаем число, которое
        System.out.println("Я загадываю число от 0 до 9..."); //игроки должны угадать

        while (true) {
            System.out.println("Число, которое нужно угадать, " + targetNumber);

            p1.guess(); // Вызываем метод guess() из каждого объекта Player
            p2.guess();
            p3.guess();

            guessp1 = p1.number;                                           //Извлекает варианты
            System.out.println("Первый игрок думает, что это " + guessp1); //каждого игрока
            guessp2 = p2.number;                                           //(результаты работы их
            System.out.println("Второй играк думает, что это " + guessp2); //(МЕТОДОВ guess()),
            guessp3 = p3.number;                                           //получая доступ к их
            System.out.println("Третий игрок думает, что это " + guessp3); //переменным number

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Третий игрок угадал? " + p3isRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз");
            } //конец if/else
        } //конец цикла
    } //конец метода
} //конец класса


