package Recursion;

import java.util.Scanner;

public class Pzz {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the number:-");
      int n = input.nextInt();
      pzz(n);
    }
  }

  public static void pzz (int n){
    if(n == 0) return;
    System.out.println("pre => " + n);
    pzz(n-1);
    System.out.println("in => " + n);
    pzz(n-1);
    System.out.println("post => " + n);
  }
}