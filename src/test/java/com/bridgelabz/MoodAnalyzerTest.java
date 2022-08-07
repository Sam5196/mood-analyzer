package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void givenMessage_IsSad_ShouldReturnSad() {
        moodAnalyzer.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_IsHappy_ShouldReturnHappy() {
        moodAnalyzer.setMessage("I am in Happy Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

    /**
     * Method to check if any is present in string, it should return Happy. Used the
     * assert equals to check if the method output is happy.
     */
    @Test
    public void givenMessage_IsAny_ShouldReturnHappy() {
        moodAnalyzer.setMessage("I am in Any Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

    @Test
    public void givenMessage_IsInvalid_ShouldReturnInvalidMood() {
        moodAnalyzer.setMessage(null);
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Invalid Mood", actualResult);
    }
}
