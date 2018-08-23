import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(sumOfLengths(A, B));
        System.out.println(isLexicographicalString(A, B));
        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
        
    }
    
    static int sumOfLengths(String s, String n) {
        return s.length() + n.length();
    }
    
    static String isLexicographicalString(String s, String n) {
        if(s.charAt(1) < n.charAt(1)) {
            return "Yes";
        } else {
            return "No";
        }
    }
    
    static String capFirstLetter(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}
