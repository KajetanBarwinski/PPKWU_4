package com.ppkwu.ppkwu2.services;

import com.ppkwu.ppkwu2.serviceinterfaces.OccurencesToFileInterface;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OccurencesToFileService implements OccurencesToFileInterface {
    @Override
    public String showOccurencesInFormat(Map<String, Integer> input, String format){
        StringBuilder result= new StringBuilder();
        if(format.equals("txt")){
            for(Map.Entry<String, Integer> entry : input.entrySet()){
                result.append(entry.getKey()).append(":").append(entry.getValue()).append("\n");
            }
        }
        return result.toString();
    }
}
