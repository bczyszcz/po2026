package agh.po.lab3;


import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    boolean doubleX(String str) {

        int i = str.indexOf("x");
        if (i == -1) return false;

        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
    }
    boolean array123(int[] nums) {
        for (int i=0; i<nums.length-2;i++){
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                return true;
            }
        }
        return false;
    }
    boolean noTriples(int[] nums) {
        for (int i=0; i<nums.length-2;i++){
            if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
                return false;
            }
        }
        return true;
    }
    String altPairs(String str) {
        String result = "";

        for (int i=0; i<str.length(); i += 4) {

            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : strings) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }


    public static void main(String[] args) {
        CodingBat codingBat=new CodingBat();
        codingBat.doubleX("aaxx");

        codingBat.array123(new int[]{2, 2, 1, 2, 3, 4, 4, 4, 6});
        codingBat.noTriples(new int[]{2, 2, 1, 2, 3, 4, 4, 4, 6});

        codingBat.altPairs("CodingHorror");

        Map<String, String> mapa = new HashMap<>();
        mapa.put("a", "aaa");
        mapa.put("b", "aaa");
        mapa.put("c", "cake");

        System.out.println(codingBat.mapAB2(mapa));

        Map<String, String> mapa2 = new HashMap<>();
        mapa2.put("a", "aaa");
        mapa2.put("b", "bbb");
        mapa2.put("c", "cake");

        System.out.println(codingBat.mapAB2(mapa2));

        String[] words = {"a", "b", "a", "c", "b"};
        System.out.println(codingBat.wordCount(words));
    }

}

