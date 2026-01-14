package String_And_Stringbuilders;

 class builder {
     public static void main(String[] args) {
         //1)
//         StringBuilder str = new StringBuilder("hello");
//         str.append("world");
//         System.out.println(str);

         //2)
//         StringBuilder str = new StringBuilder("hello");
//         System.out.println(str);
//         // hello -> mello
//         str.setCharAt(0,'m');
//         System.out.println(str);
//        // str.append(true); // in the place of true there can be any int or float or double etc. value.
//        // str.append(" world");
//         str.append(10);
//         System.out.println(str);
//         str.insert(2,'y');
//         System.out.println(str);
//         str.deleteCharAt(0);
//         System.out.println(str);

         //3)
         StringBuilder sb = new StringBuilder("physics");
         System.out.println(sb);
         sb.reverse();
         System.out.println(sb);
         sb.reverse();
         System.out.println(sb);
         sb.delete(2,5);
         System.out.println(sb);
     }
}
