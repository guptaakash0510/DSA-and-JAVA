package String_And_Stringbuilders;

import java.util.Scanner;

class palindrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sc = input.nextLine();
        StringBuilder str = new StringBuilder(sc);
        int i = 0;
        int j = str.length() - 1;
        while(i<j) {
           char a = str.charAt(i);
           char b = str.charAt(j);
           str.setCharAt(i,b);
           str.setCharAt(j,a);
           i++;
           j--;
        }
        System.out.println(str);
    }
}
