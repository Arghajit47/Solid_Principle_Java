//OCP: Open Closed Principle states that any application should be open for extension and closed for modification.
//Here, Discount is the class in which We have considered That the first customer will get 20% Discount and the second customer on the store will get 5% discount only.
//But, what if We want our 15th customer and 50th customer to feel a bit special by providing discount.
//Then we need to modify our Condition class which will violate the OCP principle and code fragility will tend to increase.

package com.Arghajit.OCP.Violate;
class Condition {
    public void discount(int a) {
        if (a <= 10) {
            System.out.println("Congrats! You got 20% discount on your whole purchase.");
        }
        else if (a > 10) {
            System.out.println("Better luck next time but still you get 5% discount.");
        }
        }
    }

public class StoreDiscount {
    public static void main(String[] args) {
        Condition d = new Condition();
        d.discount(9);
        d.discount(20);
    }
}
