package Utilities;

import java.util.concurrent.atomic.AtomicLong;

public class SequenceGenerator {

    private static AtomicLong value = new AtomicLong(1);

    public static long getNext() {
        return value.getAndIncrement();
    }

}
