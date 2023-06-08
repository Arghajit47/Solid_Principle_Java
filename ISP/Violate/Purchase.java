package com.Arghajit.ISP.Violate;

interface Package {
    void Mobile();
    void Accessories();
}
class Customer1 implements Package {

    @Override
    public void Mobile() {
        System.out.println("Bought the mobile for 15999/-");
    }

    @Override
    public void Accessories() {
        System.out.println("Don't want to buy");
    }
}
class Customer2 implements Package {

    @Override
    public void Mobile() {
        System.out.println("Bought the mobile for 17999/-");
    }

    @Override
    public void Accessories() {
        System.out.println("Bought the accessories worth 10999/-");

    }
}
public class Purchase {
    public static void main(String[] args) {
        Customer1 Ruby = new Customer1();
        Ruby.Mobile();
        Ruby.Accessories();

        Customer2 Nitish = new Customer2();
        Nitish.Mobile();
        Nitish.Accessories();
    }

}
