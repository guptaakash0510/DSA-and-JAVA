package String_And_Stringbuilders;

import java.util.Scanner;

class palindrome3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        boolean flag = isPalindrome(str);
        if(flag) {
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not a palindrome String");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
