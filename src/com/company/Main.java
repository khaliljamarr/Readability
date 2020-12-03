package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = keyboard.nextLine();

        int lettercount = 0;
        int wordcount = 1;
        int sentencecount = 0;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' ' && text.charAt(i) != '.'&& text.charAt(i) != ','&& text.charAt(i) != '-'&& text.charAt(i) != '?'&& text.charAt(i) != '\''&& text.charAt(i) != ';'&& text.charAt(i) != '\"') lettercount++;
        } System.out.println(lettercount + " Letter(s)");

        for (int j = 0; j <text.length() ; j++) {
            if(text.charAt(j) == ' ') wordcount ++;

        }System.out.println(wordcount + " Word(s)");
        for (int k = 0; k < text.length(); k++) {
            if(text.charAt(k) == '.'|| text.charAt(k) == '?' || text.charAt(k) == '!') sentencecount++;
        }
        System.out.println(sentencecount + " Sentence(s)");

        double L = (double)lettercount / (double)wordcount * 100;
        double S = (double)sentencecount / (double)wordcount * 100;
        double index = 0.0588 * L - 0.296 * S - 15.8;

        if(index < 1){
            System.out.println("Before Grade 1");}
        else if (index >= 16){
            System.out.println("Grade 16+");}
        else{
            System.out.println("Grade " + Math.round(index));}



    }

}