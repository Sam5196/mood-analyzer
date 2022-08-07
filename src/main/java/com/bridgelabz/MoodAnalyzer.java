package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    /**
     * Parameterized constructor and passing message.
     *
     * @param message - String message to be checked by methods.
     */
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    /**
     * Default constructor.
     */
    public MoodAnalyzer() {

    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("any")) {
            return "Happy";
        } else {
            return null;
        }
    }
}
