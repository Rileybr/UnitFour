package com.company;

import java.util.Scanner;

public class NestedLoops {
    public static String xSquare(){
        String output = "";
        for (int i = 0; i < 5; i++){
            for (int ii = 0; ii < 5; ii++){
                output += "X";
            }
            output += "\n";
        }
        return output;
    }
    public static String xSquare2(int n){
        String output = "";
        for (int i = 0; i < n; i++){
            for (int ii = 0; ii < n; ii++){
                output += "X";
            }
            output += "\n";
        }
        return output;
    }
    public static String flippedTriangle(int n){
        String output = "";
        for (int i = n; i > 0; i--){
            for (int ii = i; ii > 0; ii--){
                output += "*";
            }
            output += "\n";
        }
        return output;
    }
    public static String multiplicationTable(){
        String output = "";
        for (int i = 1; i < 10; i++){
            for (int ii = 1; ii < 10; ii++){
                if (i*ii < 10){
                    output += "  ";
                }
                else {
                    output += " ";
                }
                output += (i * ii);
            }
            output += "\n";

        }
        return output;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // System.out.println(xSquare());
        /*
        System.out.println("Enter n: ");
        System.out.println(xSquare2(scanner.nextInt()));
         */
        /* System.out.println("Enter n: ");
        System.out.println(flippedTriangle(scanner.nextInt()));
         */
        /* System.out.println(multiplicationTable());
         */
    }
}
