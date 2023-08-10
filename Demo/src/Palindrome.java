public class Palindrome {

    public boolean palindromeCheck(String name){
        String reversed_string ="";
        char [] palin = name.toCharArray();
        for (int i=palin.length-1; i>=0; i--){
            reversed_string= reversed_string + palin[i];
        }
        return name.equalsIgnoreCase(reversed_string);
    }
}
