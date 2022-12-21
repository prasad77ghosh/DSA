package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc{
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      String str = input.nextLine();
      ArrayList<String> ans = getKpc(str);
      System.out.println(ans);
    }
  }

  static String[] keys = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
  public static ArrayList<String> getKpc (String str){

    if(str.length() == 0){
      ArrayList<String> baseRes = new ArrayList<String>();
      baseRes.add("");
      return baseRes;
    }
    char ch = str.charAt(0);
    String sub_str = str.substring(1);
    ArrayList<String> sub_res = getKpc(sub_str);
    String code = keys[ch - '0'];
    ArrayList<String> res = new ArrayList<String>();

    for(int i = 0; i < code.length(); i++){
      char c = code.charAt(i);
      for(int j = 0;  j < sub_res.size(); j++){
        res.add(c + sub_res.get(j));
      }
    }
    return res;
  }
}
