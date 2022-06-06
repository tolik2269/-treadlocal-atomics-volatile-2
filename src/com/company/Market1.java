package com.company;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class Market1 {
AtomicLong money = new AtomicLong(0);

public void summaney1 (long diff){
//    long [] many = {8,100,65, 96};
//long sum = Arrays.stream(many).sum();
System.out.printf("%s отправляет отчет на %d руб.\n", Thread.currentThread().getName(),diff);
long result= money.addAndGet(diff);
    System.out.printf("В налоговую отправлен отчет на сумму %d рублей\n", result);

}
public long getCurrent(){
    return money.get();
}

}
