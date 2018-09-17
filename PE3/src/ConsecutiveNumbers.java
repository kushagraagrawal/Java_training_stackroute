import java.util.Arrays;
import java.util.List;

public class ConsecutiveNumbers {
    public String checkifConsecutive(String testcase) {
        String[] numbers = testcase.split(",");
        int[] Numbers = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            int tempnum = Integer.parseInt(numbers[i]);
            Numbers[i] = tempnum;
        }
        Arrays.sort(Numbers);

        boolean consecutive = true;
        for(int i=1;i<Numbers.length;i++){
            if(Numbers[i] - Numbers[i-1] != 1){
                consecutive = false;
                break;
            }
        }
        if(consecutive == true)
            return testcase + " are consecutive numbers";
        return testcase + " non consecutive numbers";

    }
}
