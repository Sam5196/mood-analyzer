package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import com.moodanalyzer.MoodAnalyzer;
import com.moodanalyzer.MoodAnalyzerException;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
    @Test
    public void givenMessage_IsSad_ShouldReturnSad() throws MoodAnalyzerException {
        moodAnalyzer.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }
    @Test
    public void givenMessage_IsHappy_ShouldReturnHappy() throws MoodAnalyzerException {
        moodAnalyzer.setMessage("I am in Happy Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
    @Test
    public void givenMessage_IsAny_ShouldReturnHappy() throws MoodAnalyzerException {
        moodAnalyzer.setMessage("I am in Any Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

    @Test
    public void givenMessage_IsInvalid_ShouldReturnHappy() throws MoodAnalyzerException {
        try {
            moodAnalyzer.setMessage(null);
            String actualResult = moodAnalyzer.analyseMood();
            Assert.assertEquals("Invalid Mood", actualResult);
        } catch (MoodAnalyzerException e) {
            System.out.println("Invalid Mood");
        }
    }
}