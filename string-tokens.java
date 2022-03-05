import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.next().trim();
        // Write your code here.
        scan.close();
        if(s.length() == 0) {System.out.println("0");}
        else{
            String [] arrs = s.split("[!,?._'@\\s]+");
            System.out.println(""+arrs.length);
            for(String D : arrs)
                System.out.println(D);
        }        
    }
}


