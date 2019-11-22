package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GolfMedium {
    public static int checkScore(int par, int using_score){
        int score = 0;
        String output = "";
        if (par == using_score){
            score += 0;
        }
        else if (par == (using_score + 1)){
            output += "birdie\n";
            score += -1;
        }
        else if (par == (using_score + 2)){
            output += "eagle\n";
            score += -2;
        }
        else if (par == (using_score - 1)){
            output += "bogey\n";
            score += 1;
        }
        else if (par == (using_score - 2)){
            output += "double bogey\n";
            score += 2;
        }
        return score;
    }

    public static String findScore(){
        File file = new File("C:\\Users\\rileybr\\IdeaProjects\\UnitFour\\src\\com\\company\\golf_medium_scores.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String output = "";
        String temp_output = "";
        int a_num_holes = 0;
        int b_num_holes = 0;
        int a_score = 0;
        int b_score = 0;
        int a_score_total = 0;
        int b_score_total = 0;
        int temp_1;
        int temp_2= 0;
        int par;
        int player_a_score;
        int player_b_score;

        for (int temp = 0; temp < 9; temp++){
            String line = scanner.nextLine();
            String first_temp = line.substring(0, 1);
            String second_temp = line.substring(2,3);
            String third_temp = line.substring(4,5);
            par = Integer.parseInt(first_temp);
            player_a_score = Integer.parseInt(second_temp);
            player_b_score = Integer.parseInt(third_temp);

            a_score_total += player_a_score;
            b_score_total += player_b_score;
            a_score += checkScore(par, player_a_score);
            b_score += checkScore(par, player_b_score);

            temp_1 = player_a_score + player_b_score;

            if (temp_1 > temp_2){
                temp_2 = temp_1;
                temp_output = (temp + 1) + " " + temp_2;
            }

            if (player_a_score < player_b_score){
                a_num_holes ++;
            }
            else if (player_a_score > player_b_score){
                b_num_holes ++;
            }
        }


        String a_par = "";
        if (a_score < 0){
            a_par = (int) Math.abs(a_score) + " under par\n";
        }
        else {
            a_par = a_score + " over par\n";
        }
        String b_par = "";
        if (b_score < 0){
            b_par = (int) Math.abs(b_score) + " under par\n";
        }
        else {
            b_par = b_score + " over par\n";
        }

        if (a_score <= b_score){
            output += a_score_total + " " + b_score_total+"\n";
            output += a_par;
            output += b_par;
            output += a_num_holes +"\n";
            output += temp_output;
        }
        else {
            output += b_score_total + " " + a_score_total+"\n";
            output += b_par;
            output += a_par;
            output += b_num_holes +"\n";
            output += temp_output;
        }
        return output;
    }
    public static void main(String[] args){
        System.out.println(findScore());
    }
}
