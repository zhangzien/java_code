package day1;

import java.util.Scanner;

public class Main {
    //两个数的乘积等于这两个数的最小公因数乘以最大公倍数
    public static int LCM(int a, int b){
         return a * b / GCD(a ,b);
    }
    
    //辗转相除法求最小公因数
    public static int GCD(int a,int b){

        int max = Math.max(a,b);
        int min = Math.min(a,b);
        if(max % min == 0) return min;
        return GCD(min, max % min);
        //return 
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
           int a = scan.nextInt();
           int b = scan.nextInt();
           System.out.println(LCM(a,b));
        }
        scan.close();
    }
}