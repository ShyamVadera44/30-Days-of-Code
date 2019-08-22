//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Map<String,Integer>phonebook=new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
           
            phonebook.put(name,phone);
        }
        System.out.println(phonebook.size());
        while(in.hasNext()){
            String s = in.next();
            if(phonebook.containsKey(s)){
                System.out.println(s+"="+phonebook.get(s));
            }else{
                System.out.println("Not found");
            }
            // Write code here
        }
        in.close();
    }
}

