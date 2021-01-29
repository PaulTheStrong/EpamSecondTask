package com.epam.task.second.strings;

import org.apache.log4j.Logger;

public class BasicStringProcessor extends StringProcessor {

    Logger LOGGER = Logger.getRootLogger();

    public String changeLetterInWords(String modifiedString, int letterPosition, char newChar) {
        String[] words = modifiedString.split(" ");
        LOGGER.debug("Input string - " + modifiedString);

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() >= letterPosition) {
                result.append(word.subSequence(0, letterPosition - 1));
                result.append(newChar);
                result.append(word.subSequence(letterPosition, word.length()));
                result.append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        LOGGER.debug("Output string - " + result.toString().trim());
        return result.toString().trim();
    }

    public String deleteWordsWithAppliedLengthStartsWithVowels(String modifiedString, int length) {
        String[] words = modifiedString.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!isVowel(word.charAt(0)) || word.length() != length) {
                result.append(word);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}
