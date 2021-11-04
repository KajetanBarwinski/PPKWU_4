package com.ppkwu.ppkwu2.controllers;

import com.ppkwu.ppkwu2.services.OccurencesToFileService;
import com.ppkwu.ppkwu2.services.StringService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OccurencesToFileController {
    @GetMapping("show_occurences/{format}/{str}")
    public String countCharacterOccurences(@PathVariable String format, @PathVariable String str) {
        StringService stringService = new StringService();
        HashMap<String, Integer> resultMap;

        resultMap = (HashMap<String, Integer>) stringService.countCharacterOccurences(str);

        OccurencesToFileService occurencesService = new OccurencesToFileService();

        return occurencesService.showOccurencesInFormat(resultMap,format);
    }

    @GetMapping("show_occurences/{format}/{str}/{strtofind}")
    public String countCharacterOccurencesWithCombinations(@PathVariable String format, @PathVariable String str, @PathVariable String strtofind) {
        StringService stringService = new StringService();
        HashMap<String, Integer> resultMap;

        resultMap = (HashMap<String, Integer>) stringService.countCombinationOccurences(str,strtofind);

        OccurencesToFileService occurencesService = new OccurencesToFileService();

        return occurencesService.showOccurencesInFormat(resultMap,format);
    }
}
