package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am Happy");
        System.out.println(mood);
        mood = moodAnalyzer.analyseMood("I am Sad");
        System.out.println(mood);
    }
}
