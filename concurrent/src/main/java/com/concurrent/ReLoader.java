package com.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Java执行重排验证
 * @author lizhenyu
 * @date 2021/9/30
 */
public class ReLoader {

    private static int a = 0;
    private static int b = 0;
    private static int x = 0;
    private static int y = 0;

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            count++;
            a = b = x = y = 0;
            CyclicBarrier cy = new CyclicBarrier(2);
            Thread t1 = new Thread(()->{
                try {
                    cy.await();
                    a = 1;
                    x = b;
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
            Thread t2 = new Thread(()->{
                try {
                    cy.await();
                    b = 1;
                    y = a;
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            if (x == 0 && y == 0) {
                System.out.println("第"+count+"次成功取值x="+x+",y="+y);
                break;
            } else {
                System.out.println("x="+x+",y="+y);
            }
        }
    }

}
