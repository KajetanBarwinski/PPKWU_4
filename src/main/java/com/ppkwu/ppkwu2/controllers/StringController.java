package com.ppkwu.ppkwu2.controllers;

import com.ppkwu.ppkwu2.services.StringService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class StringController {
    @GetMapping("count_string/{str}")
    public String reverseString(@PathVariable String str) {
        StringService stringService = new StringService();
        HashMap<String, Integer> resultMap;

        resultMap = (HashMap<String, Integer>) stringService.countCharacterOccurences(str);

        return resultMap.toString();
    }
}