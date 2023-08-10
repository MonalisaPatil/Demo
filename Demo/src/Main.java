import car.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String args[]) {


        List<Car> carList = new ArrayList<>();
    carList.add(new Car(1,"gs200t","Lexus",2016,30000));
    carList.add(new Car(2,"gs350t","Lexus",2018,40000));
    carList.add(new Car(3,"evoque","Range Rover",2020,50000));
    carList.add(new Car(3,"evoque","Range Rover",2020,50000));

        printCarYearForAllTheCars(carList);




    }

    public static void printCarYearForAllTheCars(List<Car> cars){
        for (Car c: cars){
            System.out.println(c.getCarMake()+ " "+ c.getCarYear());
        }

    }



}






