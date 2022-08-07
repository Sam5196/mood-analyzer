package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
        Assert.assertEquals("Sad", actualResult);
    }
}
