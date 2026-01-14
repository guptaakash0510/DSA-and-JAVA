package String_And_Stringbuilders;

import java.util.Scanner;

class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        for(int i = 0; i < str.length(); i++ ) {
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int num = (int) ch;
            if(num >= 97) flag = false;
            if(flag) {
                num += 32;
                char dh = (char) num;
                str.setCharAt(i,dh);
            }
            else {
                num -= 32;
                char dh = (char) num;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }

}
