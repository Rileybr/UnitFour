package com.company;

import java.util.Scanner;

public class FizzBuzz{
    public static String fizzBuzz(int max) {
        String output = "";
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output += "FizzBuzz";
            } else if (i % 3 == 0) {
                output += "Fizz";
            } else if (i % 5 == 0) {
                output += "Buzz";
            } else {
                output += i;
            }
            output += " ";
            if (i % 20 == 0){
                output += "\n";
            }
        }
        return output;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Max Value: ");
        int max = scanner.nextInt();

        System.out.print(fizzBuzz(max));
    }
}
