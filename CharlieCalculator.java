import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CharlieCalculator {
    public CharlieCalculator(){
        
    }

    public static HashMap<Integer, Integer> calc(int total, ArrayList<Integer> percents){
        HashMap<Integer, Integer> popList = new HashMap<Integer,Integer>();
        for (Integer percent : percents){
            popList.put(percent, (total * percent / 100));
        }
        return popList;
    }

    public static void setValCalc(){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your total value/population?");
        Integer totalPop = input.nextInt();

        System.out.println("How many percentages are you looking at?");
        Integer percentNums = input.nextInt();
        
        ArrayList<Integer> testList = new ArrayList<>(percentNums);
        for (int i = 1; i <= percentNums; i++){
            System.out.println("What is your #" + i + " percentage interval?");
            testList.add(input.nextInt());
        }
        input.close();

        HashMap<Integer, Integer> testResult = calc(totalPop, testList);
        System.out.println(testResult);

    }


    public static void asManyAsYouWantCalc(){
        Scanner input = new Scanner(System.in);
        Integer val = 1;

        System.out.println("What is your total value/population?");
        Integer totalPop = input.nextInt();

        // While the value is not 0 and is greater than
        ArrayList<Integer> testList = new ArrayList<>();
        System.out.println("What percentages would you like? (Type a number outside of 0 and 100 when done)");
        while ((val > 0) && (val < 100)){
            val = input.nextInt();
            if (((val > 0) && (val < 100))){
                testList.add(val);
            }
            else{
                break;
            }
        }
        input.close();

        HashMap<Integer, Integer> testResult = calc(totalPop, testList);
        System.out.println(testResult);
    }

    public static void main(String args[]){

        // setValCalc();
        asManyAsYouWantCalc();

       
    }
}
