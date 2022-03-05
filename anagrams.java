import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        else {
          a = a.toLowerCase();
          b = b.toLowerCase();
          
          int [] count = new int [26];
          
          for(int i=0; i< a.length(); i++) {
              int a_index = (int) a.charAt(i) -(int)'a' ;
              int b_index = (int) b.charAt(i) -(int)'a' ;
              
              count[a_index] ++;
              count[b_index] -- ;
          }
          for(int  i=0 ;i<26; i++) 
          {
              if(count[i] != 0)
                return false;}    
           }
     return true;
    }

    public static void main(String[] args) {
