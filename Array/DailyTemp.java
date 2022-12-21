package Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DailyTemp {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the name of element :- ");
      // int n = input.nextInt();
      int[] arr = {73,74,75,71,69,72,76,73};

      int[] ans = getAns(arr);
      System.out.println(Arrays.toString(ans));
    }
  }

  public static int[] getAns(int[] arr){
    Stack<Integer> stk  = new Stack<Integer>();
    int[] ans = new int[arr.length];
    for(int i = arr.length - 1; i >= 0; i--){
      while(!stk.isEmpty() && arr[i] >= arr[stk.peek()]){
        stk.pop();
      }
      if(!stk.isEmpty()){
        ans[i] = stk.peek() - i;
      }

      stk.push(i);
    }

    return ans;
  }
}
