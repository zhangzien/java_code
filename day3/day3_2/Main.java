package day3.day3_2;

import java.util.Scanner;

public class Main {
    public static int count_one(int num){
        int count  = 0;
       while(num != 0){
           if((num & 1) == 1)
               count++;
           num >>= 1;
       }
       return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
           // System.out.println(Integer.bitCount(scan.nextInt()));
           System.out.println(count_one(scan.nextInt()));
        }
        scan.close();
    }
}
