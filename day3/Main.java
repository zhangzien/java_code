package day3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                while(scan.hasNextLine()){
                    /* StringBuffer str = new StringBuffer();
                     str.append(scan.nextLine());
                     System.out.println(str.reverse()); */
                     String str = scan.nextLine();
                     Stack<Character> st = new Stack<Character>();
                     for(char c : str.toCharArray()) {
                         st.push(c);
                     }
                     while(!st.empty()){
                         System.out.print(st.peek()); //查看栈顶元素
                         st.pop();
                              }              
                        System.out.println("");
                            }
                scan.close();
    }
    
}