package com.hello.algo.level1;

import org.apache.logging.log4j.util.Strings;

import java.util.Arrays;

public class FindKim {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
      for (int i=0 ; i<seoul.length ; i++) {
            if (seoul[i].equals("Kim")) return "김서방은 "+ i + "에 있다";
        }
      return "김서방은 없";
    }
}
