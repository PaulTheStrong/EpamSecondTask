package com.epam.task.second.strings;

public abstract class StringProcessor {
    final String VOWELS = "eyuioa";

    abstract public String changeLetterInWords(final String modifiedString, final int letterPosition, char newChar);
    abstract public String deleteWordsWithAppliedLengthStartsWithVowels(final String modifiedString, int length);


    protected boolean isVowel(char c) {
        boolean result = false;
        for (Character vowel : VOWELS.toCharArray()) {
            result |= vowel.equals(c);
        }
        return result;
    }
}
