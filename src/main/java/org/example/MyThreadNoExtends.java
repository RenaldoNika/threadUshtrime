package org.example;

public class MyThreadNoExtends {

    void a(){
        System.out.println("1");
    }

    void b(){
        System.out.println("2");
    }

    public static void main(String[] args) {


        MyThreadNoExtends myThreadNoExtends=new MyThreadNoExtends();

        Thread thread1=new Thread(()->myThreadNoExtends.a());
        Thread thread2=new Thread(()->myThreadNoExtends.b());
    }
}
