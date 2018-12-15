package session4.problems;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/*
JSR-133
Запись в volatile-поле происходит «происходит прежде» (happens before) каждого последующего чтения того же самого volatile-поля
Старая модель памяти позволила менять порядок между записью в volatile и чтением/записью обычных переменных, что не согласуется с интуитивными представлениями большинства разработчиков
 */
public class Main {
    public static void main(String[] args) {
        SomeClass smObject = new SomeClass();
        List<Long> resList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(new SingleThread(smObject, resList));
            thread.start();
        }

        resList.stream()
                .filter(i -> Collections.frequency(resList, i) >1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
