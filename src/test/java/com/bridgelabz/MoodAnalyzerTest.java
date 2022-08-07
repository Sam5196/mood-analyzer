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

    @Test
    public void givenMessage_IsAny_ShouldReturnHappy() {
        moodAnalyzer.setMessage("I am in Any Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
    @Test
    public void givenMessage_IsInvalid_ShouldReturnHappy() {
        moodAnalyzer.setMessage(null);
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
}
