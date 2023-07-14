package com.yovvis.testsyn;


/**
 * 售票超卖问题
 *
 * @author
 */
public class SellTickets {
    public static void main(String[] args) {
        SellTicket ticket = new SellTicket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        t1.start();
        t2.start();
        t3.start();
    }

}

class SellTicket implements Runnable {
    private int tickctNum = 100;

    private boolean loop = true;

    private synchronized void sell() {
        if (tickctNum <= 0) {
            System.out.println("票已售空");
            loop = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tickctNum--;
        System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票,剩余票数" + tickctNum);
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}
