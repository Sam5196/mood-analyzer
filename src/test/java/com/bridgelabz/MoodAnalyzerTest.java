package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
    @Test
    public void givenMessage_IsSad_ShouldReturnSad() {
        String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
        Assert.assertEquals("Sad", actualResult);
    }
    @Test
    public void givenMessage_IsHappy_ShouldReturnHappy() {
        String actualResult = moodAnalyzer.analyseMood("I am in Happy Mood");
        Assert.assertEquals("Happy", actualResult);
    }
}
