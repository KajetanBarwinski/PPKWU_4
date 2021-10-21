package com.ppkwu.ppkwu2.services;

import com.ppkwu.ppkwu2.serviceinterfaces.StringServiceInterface;

import java.util.HashMap;
import java.util.Map;

public class StringService implements StringServiceInterface {

    @Override
    public Map<String, Integer> countCharacterOccurences(String input) {
        HashMap<String, Integer> characterOccurencesMap = new HashMap<>();

        characterOccurencesMap.put("Digits", 0);
        characterOccurencesMap.put("Letters", 0);
        characterOccurencesMap.put("Whitespaces", 0);
        characterOccurencesMap.put("Special characters", 0);

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                characterOccurencesMap.put("Digits",
                        characterOccurencesMap.get("Digits") + 1);
            } else if (Character.isLetter(input.charAt(i))) {
                characterOccurencesMap.put("Letters",
                        characterOccurencesMap.get("Letters") + 1);
            } else if (Character.isWhitespace(input.charAt(i))) {
                characterOccurencesMap.put("Whitespaces",
                        characterOccurencesMap.get("Whitespaces") + 1);
            } else {
                characterOccurencesMap.put("Special characters",
                        characterOccurencesMap.get("Special characters") + 1);

            }
        }
        return characterOccurencesMap;
    }
}
