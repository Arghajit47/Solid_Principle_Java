package com.Arghajit.DIP.Violate;

public class Online_Booking {
    private ItemChecking items = new ItemChecking();
    private DeliveryInitiating delivery = new DeliveryInitiating();

    public void implement() {
        items.check();
        delivery.packing();

    }

    public static void main(String[] args) {
        Online_Booking ob1 = new Online_Booking();
        ob1.implement();
    }

}
