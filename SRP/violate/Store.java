//SRP: Single Responsibility Principle states that Class/Package/Component/API should have only one reason to change.
// Here we can see an example of class named Inventory where we have itemname,quantity, buy_price and sell_price named methods.
//But if in some future reference we need to change the selling price with respect to the buying price then the whole class can get compromise and maintenance of such codes become hard.
package com.Arghajit.SRP.violate;

import static java.lang.Math.abs;

class inventory {
    int bp = 70000;
    int sp = 159900;
    public void itemName(String name) {
        System.out.println("The item name is "+ name + " present in the Store inventory" );
    }
    public void quantity(int i) {
        System.out.println("There are " + i + " number of quantity of that item present in the store");
    }
    public void buy_price() {
        System.out.println("The Buying price is " +bp);
    }
    public void sell_price() {
        System.out.println("The Selling price is "+ sp);
    }
    public void getProfitLoss() {
        int res = sp-bp;
        if (res > 0) {
            System.out.println("Sold the item with " + res + "/- profit");
        }
        else if (res < 0) {
            System.out.println("Sold the item with " + abs(res) + "/- loss");
        }
        else {
            System.out.println("Gained nothing, Lost nothing");
        }
    }


}
public class Store {
    public static void main(String[] args) {
        inventory one = new inventory();
        one.itemName("iPhone");
        one.quantity(2);
        one.buy_price();
        one.sell_price();
        one.getProfitLoss();

    }

}
