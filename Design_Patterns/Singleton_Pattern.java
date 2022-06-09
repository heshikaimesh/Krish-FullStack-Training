package game;

public class A {

    private A() {
    }

    private static A a;

    public static synchronized A getA() {

        if (a == null) {
            
            a = new A();
            System.out.println("ok");
        }
        return a;
    }
}

----------------------------------------------------------------------
 
package test;

import game.A;


 class Test1 {
     
     public static void main(String[] args) {
         
         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 A a1 = A.getA();
             }
         });
         Thread t2 = new Thread(new Runnable() {
             @Override
             public void run() {
                 A a1 = A.getA();
         
         
         }
     });
         
         t1.start();
         t2.start();
     }
}
