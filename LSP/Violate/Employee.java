//LSP: Liskov Substitution Principle states that child/derived class should be able to properly substitute the parent class.
//


package com.Arghajit.LSP.Violate;
class Ideal {
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
class Trainee1 extends Ideal {
    Trainee1() {
    }
}
class Trainee2 extends Ideal {
    Trainee2() {
    }
}
public class Employee {
    public static void main(String[] args) {
        Trainee1 T1 = new Trainee1();
        System.out.println("Followings are Trainee1 details: ");
        T1.isHumble(2);
        T1.isGoodCommunicator(4);


        Trainee2 T2 = new Trainee2();
        System.out.println("Followings are Trainee2 details: ");
        T2.isHumble(5);
        T2.isGoodCommunicator(1);
    }

}
