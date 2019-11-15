/*
By Brandon Riley
11/13/19
Plays the game piglet!
 */
package com.company;

import java.util.Scanner;

public class Piglet {
    public static String roll_check(){
        System.out.println("Welcome to Piglet");
        int score = 0;
        String answer = "y";
        while (answer.equals("y")){
            int working_num = (int) ((Math.random() * 6) + 1);
            if (working_num == 1){ // creates the losing roll response
                System.out.println("You rolled a 1!");
                score = 0;
                break;
            }
            else{ // creates any response that isn't a losing one
                score += working_num;
                System.out.println("You rolled a " + working_num + "!");
                System.out.println("Roll again? (y/n)");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.nextLine();
            }
        }
        return "You got " + score + " points";
    }
    public static void main(String[] args){
        System.out.println(roll_check()); // runs the piglet game and prints the score
    }

}