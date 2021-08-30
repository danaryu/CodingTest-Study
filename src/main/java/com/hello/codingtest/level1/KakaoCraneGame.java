package com.hello.codingtest.level1;

import java.util.*;

public class KakaoCraneGame {

    public static void main(String[] args) {
        //        String id = "123";
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println("Solution = " + solution(board, moves));

    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int moveIndex = 0;

        // board[i][j]
        // i: move-1
        // j: 0에서부터 시작해서, 0이 아닌 숫자가 나올 때 까지
        for (int move : moves) {
            moveIndex = move-1;
            for (int i=0 ; i<board.length ; i++) {
                int doll = board[i][moveIndex];
                // 0이 아니면 맨 끝 (빈 칸)
                if (doll != 0) {
                    if (stack.size() > 0) {
                        if (stack.peek() == doll) {
                            Integer pop = stack.pop();
                            board[i][moveIndex] = 0;
                            answer+=2;
                            break;
                        } else {
                            board[i][moveIndex] = 0;
                            stack.push(doll);
                            break;
                        }
                    } else {
                        board[i][moveIndex] = 0;
                        stack.push(doll);
                        break;
                    }
                }
            }
        }

        return answer;
    }

}
