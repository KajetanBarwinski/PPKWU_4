package com.ppkwu.ppkwu2.serviceinterfaces;

import java.util.Map;

public interface StringServiceInterface {
    Map<String,Integer> countCharacterOccurences(String input);
    Map<String,Integer> countCombinationOccurences(String input, String combination);
}
