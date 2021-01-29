package test.com.epam.task.second.string;

import com.epam.task.second.strings.StringProcessor;
import org.junit.Assert;
import org.junit.Test;

public abstract class StringProcessorTest {

    StringProcessor processorBehavior;

    protected abstract StringProcessor getProcessorBehavior();

    String TEST_STRING = "Red fox jumped over brown tree";

    @Test
    public void testChangeLettersInWordsShouldChangeLettersWhenAllWordsLengthsMoreThanLetterPosition() {
        //given
        processorBehavior = getProcessorBehavior();

        //when
        String actual = processorBehavior.changeLetterInWords(TEST_STRING, 2, 'a');

        //Then
        Assert.assertEquals("Rad fax jamped oaer baown taee", actual);
    }

    @Test
    public void testChangeLettersInWordsShouldChangeLettersWhenSomeWordsLengthsMoreThanLetterPosition() {
        //given
        processorBehavior = getProcessorBehavior();

        //when
        String actual = processorBehavior.changeLetterInWords(TEST_STRING, 4, 'a');

        //Then
        Assert.assertEquals("Red fox jumaed ovea broan trea", actual);
    }

    @Test
    public void testChangeLettersInWordsShouldChangeLettersWhenNoWordsLengthsMoreThanLetterPosition() {
        //given
        processorBehavior = getProcessorBehavior();

        //when
        String actual = processorBehavior.changeLetterInWords(TEST_STRING, 8, 'a');

        //Then
        Assert.assertEquals(TEST_STRING, actual);
    }

    @Test
    public void testDeleteWordsWithAppliedLengthStartsWithVowelsShouldDeleteWordsWhenWordsWithGivenConditionExist() {
        //Given
        processorBehavior = getProcessorBehavior();

        //When
        String actual = processorBehavior.deleteWordsWithAppliedLengthStartsWithVowels(TEST_STRING, 4);

        //Then
        Assert.assertEquals("Red fox jumped brown tree", actual);
    }


    @Test
    public void testDeleteWordsWithAppliedLengthStartsWithVowelsShouldDeleteWordsWhenNoWordsWithGivenConditionExist() {
        //Given
        processorBehavior = getProcessorBehavior();

        //When
        String actual = processorBehavior.deleteWordsWithAppliedLengthStartsWithVowels(TEST_STRING, 5);

        //Then
        Assert.assertEquals("Red fox jumped over brown tree", actual);
    }

    @Test
    public void testDeleteWordsWithAppliedLengthStartsWithVowelsShouldDeleteWordsWhenAppliedWordIsLast() {
        processorBehavior = getProcessorBehavior();
        String test = "Get out of it";

        String actual = processorBehavior.deleteWordsWithAppliedLengthStartsWithVowels(test, 2);

        Assert.assertEquals("Get out", actual);
    }

}
