package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      String str = input.nextLine();

      ArrayList<String> res = gss(str);
      System.out.println(res);
    }
  }

  public static ArrayList<String> gss(String str){

    if(str.length() == 0){
     ArrayList<String> base_res = new ArrayList<>();
     base_res.add("");
     return base_res;
    }

    char ch = str.charAt(0);
    String sub_str = str.substring(1);
    ArrayList<String> sub_res = gss(sub_str);
    ArrayList<String> res = new ArrayList<>();

    for(String st: sub_res){
      res.add("" + st);
      res.add(ch + st);
    }

    return res;
  }
}
