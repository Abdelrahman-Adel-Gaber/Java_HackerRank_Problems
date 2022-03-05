import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String [] array = new String[s.length()-k+1] ;
        array[0] = s.substring(0,k);
        for(int i=1; i+k <=s.length();i++)
        { 
            array[i] = s.substring(i,k+i);
        }
        smallest = array[0];
        largest = array[0];
        for (int i=1; i<(s.length()-k+1); i++)  {
            if(array[i].compareTo(smallest)<0)
             smallest = array[i];
            if(array[i].compareTo(largest)>0)
             largest = array[i];
            
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
