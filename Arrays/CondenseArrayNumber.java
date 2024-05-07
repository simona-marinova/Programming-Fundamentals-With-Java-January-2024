package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CondenseArrayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
if(nums.length==1) {
    System.out.print(nums[0]);
    return;
}
        while(nums.length>1) {
          int [] condensed = new int [nums.length-1];
            for (int i = 0; i <nums.length-1 ; i++) {
                condensed[i] = nums[i] + nums[i+1];
                nums[i] = condensed[i];
            }
           nums=condensed;

        }
        System.out.println(nums[0]);
    }
}