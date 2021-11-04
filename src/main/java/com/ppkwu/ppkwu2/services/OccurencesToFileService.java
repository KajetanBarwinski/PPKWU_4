package com.ppkwu.ppkwu2.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ppkwu.ppkwu2.serviceinterfaces.OccurencesToFileInterface;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
        else if (format.equals("xml")){
            result.append("<?xml[Space]version=\"1.0\"[Space]encoding=\"UTF-8\"?>\n" +
                    "<Occurences>\n");
            for(Map.Entry<String, Integer> entry : input.entrySet()){
                result.append("<").append(entry.getKey().replaceAll(" ","-")).append(">");
                result.append(entry.getValue());
                result.append("</").append(entry.getKey().replaceAll(" ","-")).append(">\n");
            }
            result.append("</Occurences>");
        }
        return result.toString();
    }
}
