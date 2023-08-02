package Mathematics;

public class Range {
    public String rangeType(int input){
        String output;
        if (input>0 && input<=100){
            output="range type is between o to 100";
        } else if ( input>100 && input<=200) {
            output="range type is between 100 to 200";
        } else if (input>200 && input<=300) {
            output= "range is between 200 to 300";
        } else if (input>300 && input<=400) {
            output= "range is between 300 to 400";
        } else if (input>400 && input<=500) {
            output= "range is between 400 to 500";
        } else {
            output = "range is more than 500";
        }
         return output;
    }

}
