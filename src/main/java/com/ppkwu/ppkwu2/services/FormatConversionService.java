package com.ppkwu.ppkwu2.services;

import com.ppkwu.ppkwu2.serviceinterfaces.FormatConversionInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FormatConversionService implements FormatConversionInterface {
    @Override
    public String convertFormat(String string, String oldformat, String newformat) {
        Scanner scanner = new Scanner(string);
        String[] mapKeys = {"Special characters", "Whitespaces", "Combination", "Digits", "Lowercase letters", "Uppercase letters"};
        HashMap<String, Integer> occurencesMap = new HashMap<>();
        int keyCounter = 0;

        if (oldformat.equals("xml")) {
            //Skips first redundant line in xml
            scanner.skip("[^0-9]*");
            scanner.nextFloat();
            scanner.skip("[^0-9]*");
            scanner.nextInt();
        }
        while (scanner.hasNext()) {
            scanner.skip("[^0-9]*");
            occurencesMap.put(mapKeys[keyCounter], scanner.nextInt());
            keyCounter += 1;
        }

        OccurencesToFileService occurencesToFileService = new OccurencesToFileService();
        return occurencesToFileService.showOccurencesInFormat(occurencesMap, newformat);
    }
}
