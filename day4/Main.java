package day4;

import java.util.Scanner;

public class Main {
 
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            System.out.println(count_rabbits(scan.nextInt()));
        }
        scan.close();
    }

   /*  private static int count_rabbits(int month) {
         if(month == 1 || month == 2)
             return 1;
         return count_rabbits(month-1) + count_rabbits(month-2);
    } */

    private static int count_rabbits(int month){
        if(month == 1 || month == 2)
           return 1;
        int month1 = 1,month2 = 1,sum = 0;//前1月，和前2月数量
        int count_month = 3; //记录月份，从第三个月开始
        while(count_month <= month){
           sum = month1+month2;
           month1 = month2;
           month2 = sum;//月分增加，数量更新
           count_month++;
        }
        return sum;
    }
}

