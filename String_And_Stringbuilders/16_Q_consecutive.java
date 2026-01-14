package String_And_Stringbuilders;

import java.util.Scanner;

class consecutive {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a String: ");
         String str = input.nextLine();
         String result = "";
         int count = 1;
         for(int i = 0; i< str.length(); i++) {
             if(i == str.length() - 1) {
                 if (count == 1) {
                     result += str.charAt(i);
                 } else {
                     result += (str.charAt(i-1) );
                 }
             }
             if(i == 0) continue;
             if(str.charAt(i) == str.charAt(i - 1)) {
                 count++;
             }
             if(str.charAt(i) != str.charAt(i-1)) {
                 if (count == 1) {
                     result += str.charAt(i);
                 } else {
                     result += (str.charAt(i-1) );
                 }
                 count = 1;
             }
         }
         System.out.println(result);
     }
}
