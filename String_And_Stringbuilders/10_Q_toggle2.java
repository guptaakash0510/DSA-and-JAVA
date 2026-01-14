package String_And_Stringbuilders;

import java.util.Scanner;

class toggle2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         System.out.println(str);
         for(int i = 0; i < str.length(); i++){
             boolean flag = true;
             char ch = str.charAt(i);
             if(ch == ' ') continue;
             int asci = (int) ch;
             if(asci >= 97) flag = false;
             if(flag) {
                 asci += 32;
                 char dh = (char) asci;
                 str = str.substring(0,i) + dh + str.substring(i+1);
             }
             else{
                  asci -= 32;
                  char dh = (char) asci;
                  str = str.substring(0,i) + dh + str.substring(i+1);
             }
         }
         System.out.println(str);
     }
}
