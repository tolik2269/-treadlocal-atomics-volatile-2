package com.company;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Market1 market1= new Market1();

        long [] many1 = {8,100,65, 96};
        long sumshop1 = Arrays.stream(many1).sum();

        long [] many2 = {62,2548,95, 50};
        long sumshop2 = Arrays.stream(many2).sum();

        long [] many3 = {958,2,45, 65};
        long sumshop3 = Arrays.stream(many3).sum();

        Thread thread1= new Thread(null,()->market1.summaney1(sumshop1), "Магазин 1");
        Thread thread2= new Thread(null,()->market1.summaney1(sumshop2), "Магазин 2");
        Thread thread3= new Thread(null,()->market1.summaney1(sumshop3), "Магазин 3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread3.join();
        thread2.join();
        thread1.join();

        System.out.println("\n Общий размер выручки всех магазинов составляет "+market1.getCurrent());




//        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        LongAdder summany=new LongAdder();
//        IntStream.range(0,500)
//                .forEach(i->executorService.submit(()->summany.add(i)));
//        executorService.awaitTermination(3, TimeUnit.SECONDS);
//        System.out.println("result " + summany.sum());
//        executorService.shutdown();


//        int[] many = {8,100,65, 96};
//        int sum = Arrays.stream(many).sum();
//        System.out.println(sum);

        //for (int i = 0; i < array.length; i++) {
        //  array[i] += (int) Math.round((Math.random() * 12) );
//int sum= IntStream.of(array).sum();
        //System.out.println(array[i]);
    }
    }

