package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> split_string(String str){
        ArrayList<String> arr = new ArrayList<String>();
        int i;
        for(i = 0;i <str.length() /8;i++){
            arr.add(str.substring(i*8, i*8+8));
        }
        if(str.length() % 8 != 0){
            String s = str.substring(i*8);
            while(s.length()<8)
                s += '0';
            arr.add(s);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
        int num = scan.nextInt();
        while((num--)!=0){
           String str = scan.next();
        //    ArrayList<String> arr = split_string(str);
        //    for(String s:arr){
        //        System.out.println(s);
        //    }
        while(str.length() % 8!=0)
            str += '0';
        for(int i = 0;i < str.length();i = i + 8){
            System.out.println(str.substring(i, i+8));
        }
        }
    }
        scan.close();
    }
}
