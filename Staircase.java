import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
         String s=" ";
         String st=String.format("%"+n+"s",s);
         StringBuilder myString = new StringBuilder(st);
         for(int i=n-1;i>=0;i--){
            myString.setCharAt(i,'#');
             System.out.println(myString);
         }
       /* for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
            for(int k=1;k<=i;k++){
            System.out.print("#");
        }
            System.out.print("\n");
        }*/

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n=6;

        staircase(n);


    }
}
