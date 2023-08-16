
public class Main {
    public static void main(String args[]) {
        char array1[] = new char[]{'a', 'b', 'c', 'd'};
        char array2[] = new char[array1.length];
        for (int c = 0; c < array1.length; c++) {
            array2[c] = array1[c];
        }
        System.out.println("Element of Original array:");
        for (int c = 0; c < array1.length; c++) {
            System.out.println(array1[c]);
        }

        System.out.println("Element of duplicate array:");
        for (int c = 0; c < array2.length; c++) {
            System.out.println(array2[c]);
        }


    }
}