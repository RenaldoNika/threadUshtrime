package org.example;

public class Main {
    public static void main(String[] args) {



        Bank bank=new Bank();

        Thread thread1=new Thread(()->bank.terhiq(700));

        Thread thread2=new Thread(()->bank.terhiq(700));

        thread1.start();
        thread2.start();
    }
}