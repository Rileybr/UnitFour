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

        String line = scanner.nextLine();
        return "hi";
    }
    public static void main(String[] args){
       System.out.println(findScore());
    }
}
