package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the number of element :-");
      int n = input.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = input.nextInt();
      }
      int[] ans = sortBubble(arr);
      System.out.println(Arrays.toString(ans));
    }

  }


  public static int[] sortBubble(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n; i++) {
      for(int j = i+1; j < n; j++) {
        if(arr[j] < arr[i]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    return arr;
  }
  
}
