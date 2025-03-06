package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double mediun = medNum(new double[]{7.4, 3.9, 1.2, 9.7, 2.3, 8.2});

        System.out.println(mediun);

    }
    public static int maxNum(int[] nums){
        Arrays.sort(nums);

        return nums[nums.length - 1];
    }
    public static int[] extraxtEvenArra(int[] nums){
        int count =0;
        for (int num : nums){
            if (num%2 == 0){
                count++;
            }
        }
        int[] newArr = new int[count];
        int i = 0;
        for (int num : nums){
            if (num%2 == 0){
                newArr[i] = num;
                i++;
            }
        }
        return newArr;

    }

    public static String[] reverse(String[] strings){
        String[] newArr = new String[strings.length];
        for(int i = 0; i < strings.length; i++){
            newArr[i] = strings[strings.length - 1 - i];
        }
        return newArr;
    }

    public static boolean isAnagram(String w1, String w2){
        char[] c1 = w1.toCharArray();
        char[] c2 = w2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (c1.length != c2.length) return false;
        return Arrays.equals(c1, c2);
    }

    public static double medNum(double[] arr){
        int i = arr.length - 1;
        Arrays.sort(arr);
        if (i%2 == 0){
            return arr[i/2];
        }
        else {
            int l = i +1;
            int n1 = l/2;
            int n2 = n1 -1;
            return (arr[n1] + arr[n2])/2.0;
        }
    }



}

