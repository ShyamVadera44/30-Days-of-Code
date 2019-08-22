import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //String str;
        sc.nextLine();
        for(int j=0;j<n;j++){
            String str=sc.nextLine();
            //System.out.println(str);
            char[] charArray=str.toCharArray();
            for(int i=0;i<charArray.length;i++){
                if(i%2==0){
                    System.out.print(charArray[i]);
                }
            }
            System.out.print(" ");
            for(int i=0;i<charArray.length;i++){
                if(i%2!=0){
                    System.out.print(charArray[i]);
                }
            }
            System.out.println("");
        }
    }
}

