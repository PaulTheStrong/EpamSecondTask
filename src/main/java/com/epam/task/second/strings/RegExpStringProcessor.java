package com.epam.task.second.strings;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpStringProcessor extends StringProcessor {

    public String changeLetterInWords(String modifiedString, int letterPosition, char newChar) {
        throw new NotImplementedException();
    }

    public String deleteWordsWithAppliedLengthStartsWithVowels(String modifiedString, int length) {
        String[] words = modifiedString.split(" ");
        String wordStartsWithVowelPatternWithAppliedLength = "[eyuioa]\\S{" + (length - 1) + "}";
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.matches(wordStartsWithVowelPatternWithAppliedLength))
                result.append(word).append(" ");
        }
        return result.toString().trim();
    }
}
