package Bike;

import java.util.Scanner;

public class Bike {
    String bikeName;

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getBikeName() {
        return bikeName;
    }

    public static void main(String... args) {
        Bike bike = new Bike();
        bike.setBikeName("hero");
        System.out.println(bike.getBikeName());
    }



}
