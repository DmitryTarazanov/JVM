package src;

public class JvmComprehension {
    public static void main(String[] args) {
        int i = 1;
        // 1 Ранее отработал ClassLoader и загрузил классы(в частности Metaspace имя классов) В момент вызова метода
        //создается фрейм(кадр) в стеке от метода main, и инициализируется переменная i
        Object o = new Object();        // 2 в стеке появляется перемення o, которая ссылается на объект Object в куче
        Integer ii = 2;                 // 3 в стеке появляется перемення ii, которая ссылается на объект Integer в куче
        printAll(o, i, ii);             // 4 создается фрейм(кадр) в стеке от метода printAll, и параметры
        System.out.println("finished");
        // 7 создается фрейм(кадр) в стеке от метода println
        //Отрабатывает фоном Garbage Collection, считающий в тч ссылки на объекты в куче, и в случае недостижимости удаляет их (ставя программу на паузу)
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 в стеке появляется перемення uselessVar, которая ссылается на  объект Integer в куче
        System.out.println(o.toString() + i + ii);  //6 создается фрейм(кадр) в стеке от метода println, с притягиванием параметров

    }
}

