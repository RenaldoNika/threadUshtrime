package org.example;

public class MyThread  {


    public void a(){
        System.out.println("hehe");
    }

    public static void main(String[] args) {

        MyThread myThread=new MyThread();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                myThread.a();
            }
        };

        Thread myThread1=new Thread(runnable);
        myThread1.start();


    }

}
