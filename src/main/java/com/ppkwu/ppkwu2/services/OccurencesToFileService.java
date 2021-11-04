package com.ppkwu.ppkwu2.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
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
        else if(format.equals("json")){
            ObjectMapper objectMapper = new ObjectMapper();
            try{
                result.append(objectMapper.writeValueAsString(input));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return result.toString();
    }
}
