package com.ppkwu.ppkwu2.services;

import com.ppkwu.ppkwu2.serviceinterfaces.StringServiceInterface;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StringService implements StringServiceInterface {

    @Override
    public Map<String, Integer> countCharacterOccurences(String input) {
        HashMap<String, Integer> characterOccurencesMap = new HashMap<>();

        characterOccurencesMap.put("Digits", 0);
        characterOccurencesMap.put("lowercase letters", 0);
        characterOccurencesMap.put("uppercase letters", 0);
        characterOccurencesMap.put("Whitespaces", 0);
        characterOccurencesMap.put("Special characters", 0);

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                characterOccurencesMap.put("Digits",
                        characterOccurencesMap.get("Digits") + 1);
            } else if (Character.isLetter(input.charAt(i))) {
                characterOccurencesMap.put("Letters",
                        characterOccurencesMap.get("Letters") + 1);
                if (Character.isUpperCase(input.charAt(i)))
                    characterOccurencesMap.put("lowercase letters",
                            characterOccurencesMap.get("lowercase letters") + 1);
                else
                    characterOccurencesMap.put("uppercase letters",
                            characterOccurencesMap.get("uppercase letters") + 1);
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
