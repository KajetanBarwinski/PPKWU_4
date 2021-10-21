package com.ppkwu.ppkwu2.services;

import com.ppkwu.ppkwu2.serviceinterfaces.StringServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class StringService implements StringServiceInterface {

    @Override
    public Map<String, Integer> countCharacterOccurences(String input) {
        HashMap<String, Integer> characterOccurencesMap = new HashMap<>();

        characterOccurencesMap.put("Digits", 0);
        characterOccurencesMap.put("Lowercase letters", 0);
        characterOccurencesMap.put("Uppercase letters", 0);
        characterOccurencesMap.put("Whitespaces", 0);
        characterOccurencesMap.put("Special characters", 0);

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                characterOccurencesMap.put("Digits",
                        characterOccurencesMap.get("Digits") + 1);
            } else if (Character.isLetter(input.charAt(i))) {
                if (Character.isUpperCase(input.charAt(i)))
                    characterOccurencesMap.put("Uppercase letters",
                            characterOccurencesMap.get("Uppercase letters") + 1);
                else
                    characterOccurencesMap.put("Lowercase letters",
                            characterOccurencesMap.get("Lowercase letters") + 1);
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

    @Override
    public Map<String, Integer> countCombinationOccurences(String input,String combination) {
        HashMap<String,Integer> occurencesMap = (HashMap<String, Integer>) countCharacterOccurences(input);
        occurencesMap.put("Combination",StringUtils.countOccurrencesOf(input,combination));

        return occurencesMap;
    }
}
