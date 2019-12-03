package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Deletions {
    public static void deletions(String s){
        for (int x = 0; x < s.length(); x++){
            if (s.substring(x, x+1).equals(",")){
                s = s.substring(0, x) + s.substring(x+2);
            }
        }

        System.out.println(s);

        for (int i = 0; i < s.length(); i++){
            if (s.substring(i, i+1).equals("0")){
                s = s.substring(i+1);
            }
        }
        System.out.println(s);
        int temp = 0;
        for (int ii = 0; ii < s.length(); ii++){
            if (Integer.parseInt(s.substring(ii, ii+1))>temp){
                temp = Integer.parseInt(s.substring(ii, ii+1));
            }
        }
        
    }
    public static void main(String[] args){
       deletions("7, 3, 5, 8, 0, 2, 5, 4");
    }
}
