package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the number of elements :- ");
      int n = input.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = input.nextInt();
      }

      int[] ans = sortSelection(arr);
      System.out.println(Arrays.toString(ans));
    }
    
  }
  public static int[] sortSelection(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n -1; i++){
      int min = i;
      for(int j = i+1; j < n; j++){
        if(arr[j] < arr[min]){
          min = j;
        }
      }

      int temp = arr[i];
       arr[i] = arr[min];
       arr[min] = temp;
    }

    return arr;
  }
}
