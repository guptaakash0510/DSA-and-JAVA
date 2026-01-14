package String_And_Stringbuilders;

import java.util.Scanner;

class reverseEachWord {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a sentence: ");
         StringBuilder str = new StringBuilder(input.nextLine());
         StringBuilder sc = new StringBuilder();
         StringBuilder gtr = new StringBuilder();
         for(int i = 0; i<str.length(); i++) {
             if(str.charAt(i) == ' ') {
                 gtr.reverse();
                 gtr.append(' ');
                 sc.append(gtr);
                 gtr.delete(0,gtr.length());
                 continue;
             }
             else {
                 gtr.append(str.charAt(i));
             }
         }
         System.out.println(sc);
     }
}
