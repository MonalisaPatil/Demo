import java.util.*;

public class Main {
    public static void main(String args[]) {
   // creating entry

        Map<Integer, String> classes = new HashMap<>();
        classes.put(1, "name1");
        classes.put(2,"name2");
        classes.put(3, "name3");

        for (Map.Entry<Integer, String> i: classes.entrySet()){
            System.out.println("Roll number: "+ i.getKey() + " is " + i.getValue());

        }

        Map<String, Integer> map= new HashMap<>();
        map.put("shubham", 1);
        map.put("monfgfa", 4);
        map.put("tuvjlsi", 4);
        map.put("vhhvh", 4);
        map.put("mummy", 4);
        map.put("papa",6);
        map.put("shubham", 7);
        map.put("tulsi", 8);
        map.put("mummy", 9);
        map.put("tulsi", 3);


        Set<String> jisKoLoopKarnaHai = map.keySet();
         for (String individualDataType: jisKoLoopKarnaHai){
             System.out.println(individualDataType);
         }

         Map<Integer,Integer> CountMap = new HashMap<>();
         Collection<Integer> collection = map.values();
         Iterator<Integer> iterator = collection.iterator();

//        for (Integer i: collection){
//            if (CountMap.containsValue(collection.get(i))){
//                CountMap.replace(collection.get(i),CountMap.get(collection.get(i))+1);
//            }
//            else {
//                CountMap.put(collection.get(i),i);
//            }
//
//            System.out.println(CountMap);
//
//        }

        while (iterator.hasNext()){
            if (CountMap.containsValue(iterator.next())){
                CountMap.replace(iterator.next(),CountMap.get(iterator.next())+1);
            }
            else {
                CountMap.put(iterator.next(),1);
            }
            System.out.println(CountMap);
        }


        }



        }









