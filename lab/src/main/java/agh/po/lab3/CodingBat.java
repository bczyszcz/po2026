package agh.po.lab3;


import java.util.Arrays;

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


    public static void main(String[] args) {
        CodingBat codingBat=new CodingBat();
        codingBat.doubleX("aaxx");

        codingBat.array123(new int[]{2, 2, 1, 2, 3, 4, 4, 4, 6});
        codingBat.noTriples(new int[]{2, 2, 1, 2, 3, 4, 4, 4, 6});

        codingBat.altPairs("CodingHorror");
    }

}

