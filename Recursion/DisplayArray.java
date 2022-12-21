package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayArray {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the name of element of the array:-");
      int n = input.nextInt();
      int[] arr = new int[n];

      for(int i = 0; i < n; i++){
        arr[i] = input.nextInt();
      }

      // prArray(arr, 0);
      // prArrayReverse(arr, 0);
      // int max = maxOfAnArray(arr, 0);
      // System.out.println(max);
      int[] ans = allIdexes(arr, 0, 4, 0);
      System.out.println(Arrays.toString(ans));

    }

  }

  public static void prArray(int[] arr, int idx){
    if(idx == arr.length) return;
    System.out.println(arr[idx]);
    prArray(arr, idx+1);
  }

  public static void prArrayReverse(int[] arr, int idx){
     if(idx == arr.length) return;
     prArrayReverse(arr, idx+1);
     System.out.print(arr[idx] + " ");
  }

  public static int maxOfAnArray(int[] arr, int idx){

    if(idx == arr.length -1){
      return arr[idx];
    }

    int possibleMax = maxOfAnArray(arr, idx + 1);
    int max  = arr[idx];
    if(possibleMax > max){
      return possibleMax;
    }else{
      return max;
    }

  }

  public static int firstIndex(int[] arr, int idx, int target){
    if(idx == arr.length){
      return -1;
    }
    if(target == arr[idx]){
      return idx;
    }else{
      return firstIndex(arr, idx+1, target);
    }
  }

  public static int lastIndex(int[] arr, int idx, int target){
    if(idx == arr.length){
      return -1;
    }
    int subAns = lastIndex(arr, idx+1, target);

    if(subAns == -1){
      if(arr[idx] == target){
        return idx;
      }else{
        return -1;
      }
    }else{
      return subAns;
    }

  }

  public static int[] allIdexes(int[] arr, int idx, int target, int fsf){

    // fsf = found so far

    if(idx == arr.length && fsf > 0){
      return new int[fsf];
    }

    if(idx == arr.length && fsf == 0){
      return new int[0];
    }

    if(arr[idx] == target){
      int[] iarr = allIdexes(arr, idx+1, target, fsf + 1);
      iarr[fsf] = idx;
      return iarr;
    }else{
      int[] iarr = allIdexes(arr, idx+1, target, fsf);
      return iarr;
    }

  }
}
