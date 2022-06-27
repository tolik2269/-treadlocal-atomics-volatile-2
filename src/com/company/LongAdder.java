package com.company;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class LongAdder {

    private final Random randomizer = new Random();

    private AtomicLong sum = new AtomicLong(0);

    public Long result() {
        return sum.get();
    }

    public void addRandom() {
        int increment = randomizer.nextInt(1000);
        System.out.println("От " + Thread.currentThread().getName() + " поступило " + increment);
        sum.getAndAdd(increment);
    }

    private void add(Long num) {
        sum.getAndAdd(num);
    }

}
