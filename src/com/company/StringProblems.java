package com.company;

public class StringProblems {
    public static String printTheLetters(String s){
        String output = "";
        for(int temp = 0; temp <s.length(); temp++){
             output += s.substring(temp, temp + 1) + "\n";
        }
        return output;
    }
    public static String everyOtherLetter(String s){
        String output = "";
        for(int temp = 0; temp <s.length(); temp += 2){
            output += s.substring(temp, temp + 1);
        }
        return output;
    }
    public static int countTheVowels(String s){
        int output = 0;
        s = s.toLowerCase();
        for (int temp = 0; temp <s.length(); temp ++){
            if (s.substring(temp, temp+1).equals("a")){
                output++;
            }
            else if (s.substring(temp, temp+1).equals("e")){
                output++;
            }
            else if (s.substring(temp, temp+1).equals("i")){
                output++;
            }
            else if (s.substring(temp, temp+1).equals("o")){
                output++;
            }
            else if (s.substring(temp, temp+1).equals("u")){
                output++;
            }
        }
        return output;
    }
    public static String differentStrings(String s1, String s2){
        int temp = 0;
        if (s1.equals(s2)){
            return s1 + " and " + s2 + " are the same";
        }
        else{
            for (int i = 0; i < s1.length(); i++){
                while (s1.substring(i, i+1).equals(s2.substring(i, i+1))){
                    temp ++;
                    break;
                }
            }
            return s1 + " and " + s2 + " are not the same. They differ at letter number " + (temp+1);
        }
    }
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
    public static void main(String[] args){
        // System.out.println(printTheLetters("Pizza"));
        // System.out.println(everyOtherLetter("Computer Science"));
        // System.out.println(countTheVowels("COMPUTER science"));
        //System.out.println(differentStrings("bowl", "bowling"));
        //System.out.println(isPalindrome("rAcECaR"));
    }
}
