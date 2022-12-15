package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the number of elements :-");
      int n1 = input.nextInt();
      int[] arr1 = new int[n1];
      for(int i = 0; i < n1; i++) {
        arr1[i] = input.nextInt();
      }
      System.out.print("Enter the number of elements :-");
      int n2 = input.nextInt();
      int[] arr2 = new int[n2];
      for(int i = 0; i < n2; i++) {
        arr2[i] = input.nextInt();
      }

      int[] ans = mergeSortedArray(arr1, arr2);
      System.out.println(Arrays.toString(ans));
    }
    
  }

  public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
    int n = arr1.length;
    int m = arr2.length;
    int [] ans = new int[n+m];
    int i = 0;
    int j = 0;
    int k = 0;

    while(i < n && j < m) {
      if(arr1[i] > arr2[j]){
        ans[k] = arr2[j];
        j++;
        k++;
      }else{
        ans[k] = arr1[i];
        i++;
        k++;
      }
    }

    while(i < n){
      ans[k] = arr1[i];
      i++;
      k++;
    }

    while(j < m){
      ans[k] = arr2[j];
      j++;
      k++;
    }

    return ans;
  }
}
