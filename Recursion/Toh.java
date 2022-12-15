package Recursion;

import java.util.Scanner;

public class Toh {
  // tower of hanoi
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter Your n :-");
      int n  = input.nextInt();
      int t1 = 11;
      int t2 = 12;
      int t3 = 13;

      towerOfHonoi(n, t1, t2, t3);
    }
  }
  public static void towerOfHonoi (int n, int t1, int t2, int t3){
    if(n == 0) return;
    towerOfHonoi(n-1, t1, t3, t2);
    System.out.println(n + "[ " + t1 + " --> " + t2 + " ]");
    towerOfHonoi(n-1, t3, t2, t1);
  }
}
