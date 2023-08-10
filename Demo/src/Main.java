import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        List<Order> orderList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter the Order ID:");
            int orderId = sc.nextInt();
            System.out.println(" Enter the Order Name ");
            String orderName = sc.next();
            System.out.println(" Enter the Order Type");
            String orderType = sc.next();
            System.out.println(" Enter the Order Price");
            int orderPrice = sc.nextInt();
            System.out.println("  ");
            orderList.add(new Order(orderId, orderName, orderType, orderPrice));
        }
        int sum = 0;
        for (Order od : orderList) {
            sum = sum + od.getOrderPrice();
        }

        System.out.println(sum);
        for (Order order : orderList) {
            System.out.println(order.orderId + " " + order);
        }

        // printing the list of cars
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "gs200t", "Lexus", 2016, 30000));
        carList.add(new Car(2, "gs350t", "Lexus", 2018, 40000));
        carList.add(new Car(3, "evoque", "Range Rover", 2020, 50000));
        carList.add(new Car(3, "evoque", "Range Rover", 2020, 50000));

        printCarYearForAllTheCars(carList);


    }

    // car list printing
    public static void printCarYearForAllTheCars(List<Car> cars) {
        for (Car c : cars) {
            System.out.println(c.getCarMake() + " " + c.getCarYear());
        }

    }
}







