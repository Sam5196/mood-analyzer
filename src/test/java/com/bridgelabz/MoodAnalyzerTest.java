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

    /**
     * Method to check the happy mood. Provided string with happy then method should
     * return happy. Used the assert equals to check if the method output is happy.
     *
     */
    @Test
    public void givenMessage_IsHappy_ShouldReturnHappy() {
        moodAnalyzer.setMessage("I am in Happy Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

}
