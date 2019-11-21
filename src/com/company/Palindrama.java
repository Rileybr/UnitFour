package com.company;

import java.util.Scanner;

public class Palindrama {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        String backwards = "";
        for (int x = 0; x < s.length(); x++){
            if (s.substring(x, x+1).equals(" ")){
                s = s.substring(0, x) + s.substring(x+1);
            }
        }
        for (int i = 0; i < s.length(); i++){
            backwards = s.substring(i, i+1) + backwards;
        }
        if (s.equals(backwards)){
            return true;
        }
        else {
            return false;
        }
    }
    public static String checkPalindrome(String s){
        String temp = "";
        String output = "";
        for (int y = 0; y < s.length(); y++){
            for (int i = s.length() ; i > y; i--){
                if (isPalindrome(s.substring(y, i))){
                    temp = s.substring(y, i);
                }
                if (temp.length() > output.length()){
                    output = temp;
                }

            }
        }


        return output;
    }
    public static void main(String[] args){
        System.out.println("Enter String:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("A longest palindrome substring is: \n" +checkPalindrome(s));
    }

}
