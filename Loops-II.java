import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            long s=a+b;
            for(int j=0; j<n; j++) {
                System.out.print(s+" ");
                b*=2;
                s+=b;      
            }
            System.out.println("");
        }
        in.close();
    }
}