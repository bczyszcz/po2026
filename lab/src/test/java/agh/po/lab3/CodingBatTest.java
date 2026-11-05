package agh.po.lab3;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class CodingBatTest {

    @org.junit.Test
    public void doubleX() {
        CodingBat codingBat=new CodingBat();
        assertTrue(codingBat.doubleX("xxx"));
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        assertEquals("cake", map.get("c"));
        assertEquals("aaa", map.get("b"));
        assertEquals("aaa", map.get("a"));

        Map<String, Integer> map2 = new HashMap<>();
        String[] words = {"a", "b", "a", "c", "b"};
        for (String word : words) {
            if (map2.containsKey(word)) {
                map2.put(word, map2.get(word) + 1);
            } else {
                map2.put(word, 1);
            }
        }

        assertEquals(Integer.valueOf(2), map2.get("a"));


    }

    @org.junit.Test
    public void main() {

    }
}