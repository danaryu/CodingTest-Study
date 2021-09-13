package com.hello.algo.level1;

public class FindTreasureMap {

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(solution(n ,arr1 ,arr2));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String[] temp = new String[n];
        String[] temp2 = new String[n];
                
        for (int i=0 ; i<arr1.length ; i++) {
            int number = Integer.parseInt(Integer.toString(arr1[i], 2));
            String s = String.format("%05d", number);
            temp[i] = s;
        }

        for (int i=0 ; i<arr2.length ; i++) {
            int number = Integer.parseInt(Integer.toString(arr2[i], 2));
            String s = String.format("%05d", number);
            temp2[i] = s;
        }

        for (int i=0; i<temp.length ; i++) {
            char[] chars = temp[i].toCharArray();
            char[] chars2 = temp2[i].toCharArray();
            for (int j=0; j<temp.length ; j++) {
                if (chars[j] == '0' && chars2[j] == '0') answer[j] += " ";
                else answer[j] += "#";
            }

        }

        for (String str : answer) {
            str = str.substring(4, str.length());
            System.out.println("str = " + str);
        }

        return answer;
    }

}
