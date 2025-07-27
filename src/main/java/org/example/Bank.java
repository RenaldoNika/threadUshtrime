package org.example;

public class Bank {


    int balance = 1000;


    public synchronized boolean terhiq(int shuma) {
        if (balance >= shuma) {
            System.out.println(Thread.currentThread().getName() + " po terhiq " + shuma);
            balance -= shuma;
            System.out.println(Thread.currentThread().getName() + " terhiqi. Bilanci i ri: " + balance);
            return true;  // terheqje e suksesshme
        } else {
            System.out.println(Thread.currentThread().getName() + " nuk ka mjaftueshëm para për të terhiqur " + shuma);
            return false;  // terheqje e refuzuar
        }
    }

    public void withdraw(int shuma) {
        if (balance >= shuma) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }

            balance -= shuma;  // Dy thread mund ta bëjnë këtë njëkohësisht
            System.out.println(Thread.currentThread().getName() + " u terhoq " + shuma);
            System.out.println("Balanca tani: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " ska fonde");
        }

    }
}
