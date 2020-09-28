package StudyingJava;

public class EchoTestDrive {
    public static void main (String [] args) {
        Echo e1 = new Echo(); // Echo - тип переменной,
        // e1 - говорим VJM выделить место в памяти
        // для ссылочной переменной
        // создаем объект и говорим VJM выделить место
        //в памяти для объекта
        //связываем ссылку на объект
        Echo e2 = new Echo(); //или echo e2=e1;
        // Echo - тип переменной,
        // e2 - говорим VJM выделить место в памяти
        // для ссылочной переменной
        //и первая и вторая переменная связана с объектом

        int x = 0;
        while (x < 4) {

            e1.hello();
            e1.count = e1.count + 1;

            if (x == 3) {
                e2.count = e2.count + 1;
            }

            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
