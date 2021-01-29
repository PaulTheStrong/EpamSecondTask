package com.epam.task.second.strings;

public class CharArrayStringProcessor extends StringProcessor {

    public String changeLetterInWords(String modifiedString, int letterPosition, char newChar) {
        char[] charString = modifiedString.toCharArray();

        int wordLetterPosition = 0;
        for (int i = 0; i < charString.length; i++) {
            if (charString[i] == ' ') {
                wordLetterPosition = 0;
            } else {
                ++wordLetterPosition;
                if (wordLetterPosition == letterPosition) {
                    charString[i] = newChar;
                }
            }
        }
        return new String(charString);
    }

    public String deleteWordsWithAppliedLengthStartsWithVowels(String modifiedString, int length) {
        char[] charString = modifiedString.toCharArray();

        boolean startsWithVowel = isVowel(charString[0]);
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < charString.length; i++) {
            if (charString[i] != ' ') {
                currentWord.append(charString[i]);
            } else {
                if (currentWord.length() > 0 && !(isVowel(currentWord.charAt(0)) && currentWord.length() == length)) {
                    result.append(currentWord);
                    result.append(" ");
                }
                currentWord = new StringBuilder();
            }
        }
        if (currentWord.length() > 0 && !(isVowel(currentWord.charAt(0)) && currentWord.length() == length)) {
            result.append(currentWord);
        }
        return result.toString().trim();
    }
}
