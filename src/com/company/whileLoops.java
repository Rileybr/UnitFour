package com.company;

import java.util.Scanner;

public class whileLoops {
    static Scanner scanner = new Scanner(System.in);
    public static String fromHereToThere(int a, int b){
        String temp = "";
        if (a > b){
            return "Invalid Input";
        }
        else {
            while (a < (b + 1)){
                temp += a + " ";
                a ++;
            }
            return temp;
        }
    }
    public static String factors(int y){
        int x = 1;
        String temp = "";
        while (x < (y + 1)){
            if (y%x == 0){
                temp += x + " ";
            }
            x ++;
        }
        return temp;
    }
    public static String countPosAndNeg(){
        int value = 1;
        int pos = 0;
        int neg = 0;
        while (value != 0){
            System.out.println("Enter a positive or negative number or 0 to quit: ");
            value = scanner.nextInt();
            if (value > 0){
                pos ++;
            }
            else if (value < 0){
                neg ++;
            }
        }
        return "There were " + pos + " positive and " + neg + " numbers.";
    }
    public static String findMinAndMax(){
        int temp = 0;
        int min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;
        int num_total = 0;
        while(temp < 5){
            System.out.println("Enter Number: ");
            num_total = scanner.nextInt();
            temp ++;
            if (num_total > max_value) {
                max_value = num_total;
            }
            if (num_total < min_value){
                min_value = num_total;
            }
        }
        String return_line = "Max value is: " + max_value + "\nMin value is: " + min_value;
        return return_line;
    }
    public static String gradePoint(){
        double temp = 0;
        double grade_point = 0;
        System.out.println("Enter seven letter grades (A, B, C, D, or F)");
        while (temp < 7){
            String grade = scanner.nextLine();
            if (grade.equals("A")){
                grade_point += 4;
            }
            else if (grade.equals("B")){
                grade_point += 3;
            }
            else if (grade.equals("C")){
                grade_point += 2;
            }
            else if (grade.equals("D")){
                grade_point += 1;
            }
            else if (grade.equals("F")){
                grade_point += 0;
            }
            else {
                temp --;
                System.out.println("Invalid Input");
            }
            temp ++;
        }
        grade_point = grade_point / 7;
        temp = ((int)((grade_point * 100) + 0.5));
        temp = temp / 100;
        return "GPA = " + temp;
    }
    public static void main(String[] args){

        System.out.println("Enter start number:");
        int a = scanner.nextInt();
        System.out.println("Enter end number:");
        int b = scanner.nextInt();
        System.out.println(fromHereToThere(a,b));

        System.out.println("Enter value:");
        int y = scanner.nextInt();
        System.out.println(factors(y));

        System.out.println(countPosAndNeg());

        System.out.println(findMinAndMax());

        System.out.println(gradePoint());

    }
}
