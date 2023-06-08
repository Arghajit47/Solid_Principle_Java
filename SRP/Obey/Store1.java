//But here what we have done is created 2 classes where one named as inventory,consists of itemname and quantity & other one named commercial consists of buying and selling price.
//How it will benefit us is like with this way of coding if we want to manipulate selling and buying price then we don't need to touch inventory class unnecessarily so maintenance of such large codes become hard.
package com.Arghajit.SRP.Obey;

class inventory1 {
    void itemname(String name1) {
        System.out.println("The item name is " + name1 + " present in the Store inventory");
    }

    void quantity(int i1) {
        System.out.println("There are " + i1 + " number of quantity of that item present in the store");
    }
}

public class Store1 {
    public static void main(String[] args) {
        inventory1 one = new inventory1();
        one.itemname("iPhone");
        one.quantity(2);

        Pricing com = new Pricing();
        com.buy_price();
        com.sell_price();
        com.getProfitLoss();
    }

}

