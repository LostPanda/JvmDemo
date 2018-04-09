package com.kidhx.jvmdemo.gc.memanatool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 16:43
 */
public class JConsoleThreadPanelObject {
    //线程死循环演示
    public static void createBusyThread(){
        Thread thread=new Thread(new Runnable() {
            public void run() {
                while (true); //第12行
            }
        },"testBusyThread");

        thread.start();
    }

    /**
     * 线程等待演示
     */
    public static void createLockThread(final Object lock){
        Thread thread=new Thread(new Runnable() {
            public void run() {
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"testLockThread");
        thread.start();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        createBusyThread();
        bufferedReader.readLine();
        createLockThread(new Object());
    }

}
