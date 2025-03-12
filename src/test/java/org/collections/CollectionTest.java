package org.collections;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionTest {

    private Collections collection;

    @BeforeEach
    void setUp(){
        collection = new Collections();
    }


    @Test
    public void test_takesMultipleVariableArgumentsOfFirstNames_eleminatesTheDuplicates() {

        Set<String> names = collection.uniqueNames("Stacy","Heidi", "Stacy");

        assertEquals(2, names.size());
        assertTrue(names.contains("Stacy"));
        assertTrue(names.contains("Heidi"));
    }

    @Test
    public void test_chooseOneOf13Colours(){

        HashMap<String, Color> colours  = collection.getColours();

        assertEquals(13, colours.size());
        assertEquals(Color.RED, colours.get("Red"));

    }

    @Test
    public void test_countHowManyLettersInString(){
        String string = "Hello there";
        Map<Character, Integer> map = collection.getCount(string);

        assertEquals(2, map.get('h'));
        assertEquals(3, map.get('e'));
        assertEquals(2, map.get('l'));
        assertEquals(1, map.get('o'));
        assertEquals(1, map.get('r'));

    }

}
