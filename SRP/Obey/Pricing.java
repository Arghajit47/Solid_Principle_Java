//part of 'Store1.java' file
package com.Arghajit.SRP.Obey;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Pricing {
    int bp = 70000;
    int sp = 159900;
    void buy_price() {
        System.out.println("The Buying price is " +bp);
    }
    void sell_price() {
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
