package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_IsSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
        Assert.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_IsHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualResult = moodAnalyzer.analyseMood("I am in Happy Mood");
        Assert.assertEquals("Happy", actualResult);
    }
}
