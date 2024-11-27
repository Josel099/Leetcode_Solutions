package com.random.practice;

public class StringContainsVowels {
   public  static  void main(String [] args){
    System.out.println(stringContatinsVowels("Hello"));
       System.out.println(stringContatinsVowels("BCdFG"));

   }

    private static boolean stringContatinsVowels(String str) {

      return str.toLowerCase().matches(".*[aeiou].*");


    }

}
