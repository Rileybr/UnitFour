package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Golf {
    public static String findScore(){
        File file = new File("C:\\Users\\rileybr\\IdeaProjects\\UnitFour\\src\\com\\company\\golf_scores.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String output = "";
        int score = 0;
        for (int temp = 0; temp < 4; temp++){
            String line = scanner.nextLine();
            String first_temp = line.substring(0, 1);
            String second_temp = line.substring(2);
            int first = Integer.parseInt(first_temp);
            int second = Integer.parseInt(second_temp);

            if (first == second){
                output += "par\n";
            }
            else if (first == (second + 1)){
                output += "birdie\n";
                score += -1;
            }
            else if (first == (second + 2)){
                output += "eagle\n";
                score += -2;
            }
            else if (first == (second - 1)){
                output += "bogey\n";
                score += 1;
            }
            else if (first == (second - 2)){
                output += "double bogey\n";
                score += 2;
            }
        }
        String output_score = "";
        if (score < 0){
            output_score = (int) Math.abs(score) + " under par";
        }
        else {
            output_score = score + " over par";
        }
        return output + output_score;
    }
    public static void main(String[] args){
       System.out.println(findScore());
    }
}
