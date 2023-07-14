package com.yovvis.testthread;

/**
 * 描述
 *
 * @author
 */
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        // 创建cat对象
        Cat cat = new Cat();
        cat.start();//启动

        for (int i = 0; i < 60; i++) {
            System.out.println("main" + Thread.currentThread().getName() + i);
            Thread.sleep(1000);
        }
    }
}

// 只要继承了这个类就相当于一个线程了
class Cat extends Thread {
    @Override
    public void run() {
        // 这个run方法本质上是runnable的run方法
        int times = 0;
        while (true) {

            System.out.println("喵喵喵" + (++times)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) {
                break;
            }
        }
    }
}
