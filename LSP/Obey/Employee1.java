package com.Arghajit.LSP.Obey;
class Ideal1 {
    public void isHumble(int num_Argus){
        if (num_Argus < 3) {
            System.out.println("He/She is Humble");
        }
        else {
            System.out.println("Not Humble");
        }
    }
    public void isQuick(int num_Bills) {
        if (num_Bills > 100) {
            System.out.println("He/She is Quick");
        }
        else {
            System.out.println("Not Quick enough");
        }
    }
    public void isAccurate(int num_Errors) {
        if (num_Errors < 5) {
            System.out.println("He/She is Accurate");
        }
        else {
            System.out.println("Not Accurate");
        }
    }
    public void isGoodCommunicator(int num_Langs) {
        if (num_Langs > 3) {
            System.out.println("He/She is a good communicator");
        }
        else {
            System.out.println("Not a good communicator");
        }
    }

}
class Trainee3 extends Ideal1 {
    Trainee3() {
    }
}
public class Employee1 {
    public static void main(String[] args) {
        Ideal1 T3 = new Trainee3();
        System.out.println("Followings are Trainee3 details: ");
        T3.isAccurate(3);
        T3.isQuick(110);
        T3.isGoodCommunicator(5);
        T3.isHumble(2);
    }
}
