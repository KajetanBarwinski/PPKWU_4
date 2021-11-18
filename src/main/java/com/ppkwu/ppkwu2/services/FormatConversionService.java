package com.ppkwu.ppkwu2.services;

import com.ppkwu.ppkwu2.serviceinterfaces.FormatConversionInterface;

import java.util.HashMap;
import java.util.Scanner;

public class FormatConversionService implements FormatConversionInterface {
    @Override
    public String convertFormat(String string, String format) {
        Scanner scanner = new Scanner(string);
        String[] mapKeys = {"Special characters", "Whitespaces", "Combination", "Digits", "Lowercase letters", "Uppercase letters"};
        HashMap<String, Integer> occurencesMap = new HashMap<>();
        int keyCounter = 0;

        if (format.equals("xml")) {
            //Skips first two redundant lines in xml
            scanner.nextLine();
            scanner.nextLine();
        }
        while (scanner.hasNextInt()) {
            occurencesMap.put(mapKeys[keyCounter], scanner.nextInt());
            keyCounter += 1;
        }

        OccurencesToFileService occurencesToFileService = new OccurencesToFileService();
        return occurencesToFileService.showOccurencesInFormat(occurencesMap, format);
    }
}
