package String_And_Stringbuilders;

import java.util.Scanner;

class palindrome {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String str = input.nextLine();
         StringBuilder gtr = new StringBuilder(str);
         gtr.reverse();
         String s = gtr + "";
         if(str.equals(s)) {
             System.out.println("The string is palindrome");
         }
         else {
             System.out.println("The string is not palindrome");
         }
     }
}
