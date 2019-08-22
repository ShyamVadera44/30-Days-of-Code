import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
      Difference(int[] e){
          elements=e;
      }
      void computeDifference(){
          int counts=elements.length;
          maximumDifference=0;
          int diff=0;
          for(int i=0;i<counts;i++){
              for(int j=counts-1;j>=0;j--){
                  diff=elements[i]-elements[j];
                  if(diff>maximumDifference){
                      maximumDifference=diff;
                  }  
              }
          }
      }  
	// Add your code here


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}