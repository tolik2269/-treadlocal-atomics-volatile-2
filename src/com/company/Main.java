package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        LongAdder longSum = new LongAdder();

        Thread thread1= new Thread(sumComputer(longSum), "Магазин 1");
        Thread thread2= new Thread(sumComputer(longSum), "Магазин 2");
        Thread thread3= new Thread(sumComputer(longSum), "Магазин 3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread3.join();
        thread2.join();
        thread1.join();

        System.out.println("\n Общий размер выручки всех магазинов составляет "+ longSum.result());
    }

    private static Runnable sumComputer(LongAdder longSum) {
        return ()-> {
            int length = new Random().nextInt(100);
            for (int i = 0; i < length; i++) {
                longSum.addRandom();
            }
        };
    }

}

