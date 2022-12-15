package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * InsertionSort
 */
public class InsertionSort {
public static void main(String[] args) {
  try (Scanner input = new Scanner(System.in)) {
    System.out.print("Enter the number of elements :-");
    int n = input.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i]  = input.nextInt();
    }

    int[] ans = sortInsertion(arr);
    System.out.println(Arrays.toString(ans));
  }
}

public static int[] sortInsertion (int[] arr){
  int n = arr.length; 
  for(int i = 1; i < n; i++){
    for(int j = i-1; j >= 0; j--){
      if(arr[j] > arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
  return arr;
 }
   
}