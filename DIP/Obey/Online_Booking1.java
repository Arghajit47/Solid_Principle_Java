package com.Arghajit.DIP.Obey;

public class Online_Booking1 {

    public static void main(String[] args) {
        ItemChecking1 items = new ItemChecking1();
        DeliveryInitiating1 delivery = new DeliveryInitiating1();
        items.formalities();
        delivery.formalities();
    }
}

