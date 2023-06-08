package com.Arghajit.DIP.Obey;

public class DeliveryInitiating1 implements Formalities {
    public void formalities() {
        this.packing();
    }
    public void packing() {
        System.out.println("Items verified and packed for initiating delivery");
    }
}
