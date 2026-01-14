package String_And_Stringbuilders;

 class interning {
     public static void main(String[] args) {
         //1)
//         String s = "Hello";
//         String x = "Hello";
//         x = "Mello";
//         System.out.println(s);
//         System.out.println(x);

         //2)
         String s = "Hello";
         s = s.substring(0,2) + 'y' + s.substring(3);
         System.out.println(s);
     }
}
