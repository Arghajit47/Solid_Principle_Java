package com.Arghajit.ISP.Obey;

interface Mobile01 {
    void Mobile1();
}
interface Accessories01 {
    void Accessories1();
}
class Customer01 implements Mobile01 {

    @Override
    public void Mobile1() {
        System.out.println("Bought the mobile for 15999/-");
    }
}
class Customer02 implements Mobile01,Accessories01 {

    @Override
    public void Mobile1() {
        System.out.println("Bought the mobile for 17999/-");
    }

    @Override
    public void Accessories1() {
        System.out.println("Bought the accessories worth 10999/-");
    }
}
public class Purchase1 {
    public static void main(String[] args) {
        Customer01 Ruby = new Customer01();
        Ruby.Mobile1();

        Customer02 Nitish = new Customer02();
        Nitish.Mobile1();
        Nitish.Accessories1();
    }

}
