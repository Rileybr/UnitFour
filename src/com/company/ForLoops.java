package com.company;

public class ForLoops {
    public static String printingHashTags(int x){
        String temp = "";
        for (x = x; x > 0; x--){
            temp += "#";
        }
        return temp;
    }
    public static String countDown(int start, int end){
        String temp = "";
        if (start > end){
            return "";
        }
        else {
            for (end = end; end >= start; end--){
                temp += end + " ";
            }
            return temp;
        }
    }
    public static String countDown2(int start, int end){
        String temp = "";
        if (start > end){
            for (start = start; start >= end; start--){
                temp += start + " ";
            }
            return temp;
        }
        else {
            for (end = end; end >= start; end--){
                temp += end + " ";
            }
            return temp;
        }
    }
    public static int sumNumbers(int num1, int num2){
        int total = 0;
        if (num1 > num2){
            int place_holder = num1;
            num1 = num2;
            num2 = place_holder;
        }
        for (num1 = num1; num1 <= num2; num1++){
            total += num1;
        }
        return total;
    }
    public static void main(String[] args){
        System.out.println(printingHashTags(7));
        System.out.println(countDown(0, 10));
        System.out.println(countDown2(10, 0));
        System.out.println(sumNumbers(10, 5));
    }
}
