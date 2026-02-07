package OOPS_IN_JAVA;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static class Arraylist{
        int[] arr = new int[2];
        int idx = 0;
        int size = 0;
        public void add(int ele){

            if(size==arr.length) {
                int[] brr = Arrays.copyOf(arr, arr.length * 2);
                arr = brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }

        public void set(int idx,int val) {
            arr[idx] = val;
        }
    }

    public static void main(String[] args) {

        // 1) Normal ArrayList
//        ArrayList<Integer> arr = new ArrayList<>(4);
//        arr.add(1);
//        arr.add(2);
//        arr.add(9);
//        arr.add(3);
//        arr.add(2);
//        arr.set(1,20);
//        System.out.println(arr.size());
//        System.out.println(arr);

        //2) Own ArrayList
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
        arr.set(0,10);
    }
}
