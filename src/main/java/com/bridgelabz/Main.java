package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am happy");
        System.out.println(mood);
        mood = moodAnalyzer.analyseMood("I am sad");
        System.out.println(mood);
    }
}
