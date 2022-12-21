package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairPath {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
     int n = input.nextInt();
     ArrayList<String> ans = stairPath(n);
     System.out.println(ans);
    }
  }
  public static ArrayList<String> stairPath (int n){
    if(n == 0){
      ArrayList<String> baseRes = new ArrayList<String>();
      baseRes.add("");
      return baseRes;
    }
    if(n < 0){
      ArrayList<String> baseRes = new ArrayList<String>();
      return baseRes;
    }
    ArrayList <String> sub_res = stairPath(n-1);
    ArrayList <String> sub_res1 = stairPath(n-2);
    ArrayList <String> sub_res2 = stairPath(n-3);
    ArrayList <String> res = new ArrayList<String>();

    for(int i = 0; i < sub_res.size(); i++){
      res.add(1 + sub_res.get(i));
    }
    for(int i = 0; i < sub_res1.size(); i++){
      res.add(2 + sub_res1.get(i));
    }
    for(int i = 0; i < sub_res2.size(); i++){
      res.add(3 + sub_res2.get(i));
    }

    return res;
  }
}
