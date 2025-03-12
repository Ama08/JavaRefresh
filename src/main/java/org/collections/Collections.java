package org.collections;

import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Collections {
    public Set<String> uniqueNames(String... names){
        Set<String> uniqueNames = new HashSet<>();
        for (String name : names){
            uniqueNames.add(name);
        }
        return  uniqueNames;
    }

    public HashMap<String, Color> getColours(){
        HashMap<String, Color> map = new HashMap<>();
        map.put("Red", Color.RED);
        map.put("Blue", Color.BLUE);
        map.put("Green", Color.GREEN);
        map.put("Black", Color.BLACK);
        map.put("Yellow", Color.YELLOW);
        map.put("Gray", Color.GRAY);
        map.put("Magenta", Color.MAGENTA);
        map.put("Cyan", Color.CYAN);
        map.put("Orange", Color.ORANGE);
        map.put("Pink", Color.PINK);
        map.put("White", Color.WHITE);
        map.put("Dark Gray", Color.DARK_GRAY);
        map.put("Light Gray", Color.LIGHT_GRAY);

        return map;
    }

    public Map<Character, Integer > getCount(String string){
        Map<Character, Integer> map = new HashMap<>();
        string = string.toLowerCase().replaceAll(" ", "");

        for (char chars : string.toCharArray()){
            map.put(chars, map.getOrDefault(chars, 0) + 1);
        }
        return map;
    }

    public int getDuplicateWordCount(String sentence){
        String string = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = string.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int duplicateCount = 0;
        for(int count : map.values()){
            if(count > 1){
                duplicateCount ++;
            }
        }
        return duplicateCount;
    }
}
