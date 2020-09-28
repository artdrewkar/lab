package StudyingJava;

public class TapeDeckTestDrive {
    public static void main (String [] args) {
        TapeDeck t = new TapeDeck(); //добавили в код для компиляции
        t.canRecord = true; //даны переменные
        t.playTape();

        if (t.canRecord == true) { //если переменная итинная
            t.recordTape();
        }//закрывает ветвление
    }//закрывает метод
}//закрывает класс
