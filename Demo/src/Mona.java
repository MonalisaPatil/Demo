import Bike.Bike;
import Car.Car;
import Food.*;
import Item.*;
import Mathematics.MathematicalFunction;
import Mathematics.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mona {
    // TODO: 8/2/23 step 1: set the values for item class
    // TODO: 8/2/23 step 2: rertieve the value from item class and modify the values
    // TODO: 8/2/23 step 3: set the values in itemSold class


    // TODO: 8/2/23  step1: prepare muliple classes for multiple food items


    // TODO: 8/2/23 step2: provide details in indiviadial classes
    // TODO: 8/2/23  step3: display all the items to cusotmer
    // TODO: 8/2/23  step4: ask the what he wants to order
    // TODO: 8/2/23  step5: once he orders place an order in system
    // TODO: 8/2/23  step6: and as soon as the order is cooked update the customer class with details of the order
    public static void main(String args[]) {

        List<ItemSold> itemSoldList= new ArrayList<>();
        itemSoldList.add(new ItemSold("laptop",1700,"Dell",2,800,100));
        itemSoldList.add(new ItemSold("headphone",1000,"Sony",4,200,200));

        for (ItemSold name: itemSoldList){
            System.out.println(name.getItemName());
        }



        // TODO: 8/2/23  step1: prepare muliple classes for multiple food items
//        // TODO: 8/2/23 step2: provide details in indiviadial classes
//        PaneerTikka paneerTikka = new PaneerTikka();
//        paneerTikka.setItemName("Paneer Tikka");
//        paneerTikka.setSpicyLevel("High");
//        paneerTikka.setIngredients("Paneer,Dry gravy, Tomato , Onion, Redchilli");
//        paneerTikka.setAvailability(true);
//        paneerTikka.setPrice(200);
//        paneerTikka.setCuisineType('V');
//
//        GobiManchurian gobiManchurian = new GobiManchurian();
//        gobiManchurian.setItemName("Gobi Manchurian");
//        gobiManchurian.setSpicyLevel("High");
//        gobiManchurian.setIngredients("Gobi,vegetables, Soya sauce, Dry gravy, Tomato , Onion, Redchilli");
//        gobiManchurian.setAvailability(true);
//        gobiManchurian.setPrice(150);
//        gobiManchurian.setCuisineType('V');
//
//        Chaat chaat = new Chaat();
//        chaat.setItemName("Chaat");
//        chaat.setSpicyLevel("High");
//        chaat.setIngredients("Samosa , curd, sev ,chutney, chaat masala,  Tomato , Onion, greenchilli");
//        chaat.setAvailability(true);
//        chaat.setPrice(100);
//        chaat.setCuisineType('V');
//
//        KadhaiPaneer kadhaiPaneer = new KadhaiPaneer();
//        kadhaiPaneer.setItemName("Kadhai Paneer");
//        kadhaiPaneer.setSpicyLevel("High");
//        kadhaiPaneer.setIngredients("Paneer, thick gravy, cashew,  Tomato , Onion, Redchilli");
//        kadhaiPaneer.setAvailability(true);
//        kadhaiPaneer.setPrice(250);
//        kadhaiPaneer.setCuisineType('V');
//
//
//        // TODO: 8/2/23 step2: provide details in indiviadial classes
//        System.out.println(paneerTikka);
//        System.out.println(gobiManchurian);
//        System.out.println(chaat);
//        System.out.println(kadhaiPaneer);
//
//        // TODO: 8/2/23  step4: ask the what he wants to order
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the item from menu");
//        String Menu = sc.nextLine();
//
//        // TODO: 8/2/23  step5: once he orders, place an order in system
//        System.out.println("customer has ordered " + Menu);
//
//        // TODO: 8/2/23  step6: and as soon as the order is cooked update the customer class with details of the order
//        Customer customer = new Customer();
//        if (Menu.equalsIgnoreCase(paneerTikka.getItemName())) {
//            customer.setCustomerOrdered(Menu);
//            customer.setCustomerSelectedSpicy(paneerTikka.getSpicyLevel());
//            customer.setItemName(paneerTikka.getItemName());
//            customer.setPrice(paneerTikka.getPrice());
//            customer.setIngrediant(paneerTikka.getIngredients());
//        } else if (Menu.equalsIgnoreCase(gobiManchurian.getItemName())) {
//            customer.setCustomerOrdered(Menu);
//            customer.setCustomerSelectedSpicy(gobiManchurian.getSpicyLevel());
//            customer.setItemName(gobiManchurian.getItemName());
//            customer.setPrice(gobiManchurian.getPrice());
//            customer.setIngrediant(gobiManchurian.getIngredients());
//        } else if (Menu.equalsIgnoreCase(chaat.getItemName())) {
//            customer.setCustomerOrdered(Menu);
//            customer.setCustomerSelectedSpicy(chaat.getSpicyLevel());
//            customer.setItemName(chaat.getItemName());
//            customer.setPrice(chaat.getPrice());
//            customer.setIngrediant(chaat.getIngredients());
//        } else if (Menu.equalsIgnoreCase(kadhaiPaneer.getItemName())) {
//            customer.setCustomerOrdered(Menu);
//            customer.setCustomerSelectedSpicy(kadhaiPaneer.getSpicyLevel());
//            customer.setItemName(kadhaiPaneer.getItemName());
//            customer.setPrice(kadhaiPaneer.getPrice());
//            customer.setIngrediant(kadhaiPaneer.getIngredients());
//
//        } else {
//            System.out.println("menu item doesn't exist");
//        }
//
//        System.out.println(customer);
    }

//}
    //   }


//      //  step 1: set the values for item class
//        Item item = new Item();
//        item.setItemName("santoor");
//        item.setItemDescription("sabun");
//        item.setItemPrice(120);
//        item.setItemAvailability(true);
//
//     //   step 2: rertieve the value from item class and modify the values
//
//        System.out.println(item.getItemName());
//        System.out.println(item.getItemDescription());
//        System.out.println(item.getItemPrice());
//        System.out.println(item);
//        int itemSoldat = item.getItemPrice()+100;
//        int itemQuantitySold = 150;
//        int totalSalePrice = itemSoldat * itemQuantitySold;
//        int itemProfitEarned = totalSalePrice - item.getItemPrice()*itemQuantitySold;
//
//        //    step 3: set the values in itemSold class
//       ItemSold Sold = new ItemSold();
//       Sold.setItemName(item.getItemName());
//       Sold.setItemDescription(item.getItemDescription());
//       Sold.setItemQuantitySold(itemQuantitySold);
//       Sold.setItemProfitEarned(itemProfitEarned);
//       Sold.setItemTotalSalePrice(totalSalePrice);
//       Sold.setItemSoldat(itemSoldat);
//        System.out.println(Sold.getItemName());
//        System.out.println(Sold.getItemDescription());
//        System.out.println(Sold.getItemProfitEarned());
//        System.out.println(Sold.getItemSoldat());
//        System.out.println(Sold.getTotalSalePrice());
//       System.out.println(Sold);


//        MathematicalFunction mf = new MathematicalFunction();
//        String output=mf.combo(45,78);
//        System.out.println(output);

//        Range r=new Range();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number:");
//        int input= sc.nextInt();
//        String result = r.rangeType(input);
//        System.out.println(result);
//        MathematicalFunction mf = new MathematicalFunction();
//        boolean greater= mf.isGreaterThanHundred(24,76);
//        System.out.println(greater);
//        String even= mf.sumIsEven(45,87);
//        System.out.println(even);
//        Item item= new Item("shubham",12,"item", true);
////        item.setItemName("Shubham");
//        System.out.println(item.getItemName());
////        item.setItemAvailability(true);
//        System.out.println(item.getItemAvailability());
////        item.setItemDescription("Awesome");
//        System.out.println(item.getItemDescription());
////        item.setItemPrice(100);
//        System.out.println(item.getItemPrice());
//        Scanner sc= new Scanner(System.in);
//        System.out.println("hello world");
//        System.out.println("Enter the first number");
//        int myFirstNumber = sc.nextInt();
//        System.out.println("Enter the second number");
//        int mySecondNumber = sc.nextInt();
//        System.out.println("Enter the third number");
//        int myThirdNumber = sc.nextInt();
//        System.out.println("sum of Your number is :");
//        System.out.println(myFirstNumber+ mySecondNumber+ myThirdNumber);
//        int myLastOne = 1000- myThirdNumber;
//        System.out.println("Last sum of Your number is :"+ myLastOne);

//         Car car = new Car();
//         System.out.println();
//        String c= car.honk(1,2,"mona", 'm',4d);
//        System.out.println(c);
//        String Result= car.printandreturnstring("mona","Shubu");
//        car.input(4,"mona");


//               }
//
//
//               }

//String s ="demo.Mona";

//    public static void main(String... args) {
//        Scanner scanner =
//    Mona.testStaticMethod("mona");
//    Mona objectCreatedForClassMona = new Mona();
//    objectCreatedForClassMona.testNonStaticMethod("mona");
//
//    Math m= new Math();
//    int result= m.Add(1,4);
//        int result2 =  m.Sub(8,4);
//        int sol = m.Solution(result, result2);
//        System.out.println(result);
//        System.out.println(result2);
//        System.out.println(sol);
//
//
//
//        Bike bike = new Bike();
//        bike.setBikeName("yamaha");
//        System.out.println(bike.getBikeName());
//
//        Car c= new Car();
//        String Type= c.Cartype("SUV");
//         c.say("SUV");
//       String type =  c.SayHi("SUV");
//        System.out.println(Type);
//
   }

//    public String test(String input) {
//        //Access modifier // returnType // methodName
//        System.out.println(s);
//        //System.out.println("Hello World");
//        System.out.println("I am happy");
//        System.out.println(2 + 4);
//        return input;
//        }
//
//    public static void testString(String input) {
//        System.out.println(input);
//        //System.out.println("Hello World");
//        System.out.println("I am happy");
//        System.out.println(2 + 4);
//    }


//  }




