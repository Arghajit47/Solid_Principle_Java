package com.Arghajit.OCP.Obey;
interface Condition1 {
    public void discount();

}
class First_Disc implements Condition1 {
    @Override
    public void discount() {
        System.out.println("Congrats! You got 20% discount on your whole purchase");
    }
}
class Sec_Disc implements Condition1 {
    @Override
    public void discount() {
        System.out.println("Congrats! You got 5% discount on your whole purchase");
    }
}
class Third_Disc implements Condition1 {
    @Override
    public void discount() {
        System.out.println("Better luck next time");
    }
}

public class StoreDiscount1 {
    public static void main(String[] args) {
        int a =10;
        if(a<=10){
            First_Disc objone = new First_Disc();
            objone.discount();
        }
        else if(a>10 && a<20) {
            Sec_Disc objone = new Sec_Disc();
            objone.discount();
        }
        else {
            Third_Disc objone = new Third_Disc();
            objone.discount();
        }





    }
}
