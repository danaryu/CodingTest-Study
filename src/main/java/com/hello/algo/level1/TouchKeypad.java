package com.hello.algo.level1;


public class TouchKeypad {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String id = "right";

        System.out.println("Solution = " + solution(numbers, id));

    }

    public static String solution(int[] numbers, String hand) {

        StringBuilder stringBuilder = new StringBuilder();

        int positionX = 10;
        int positionY = 12;
        int distanceFromX, distanceFromY = 0;

        for (int number : numbers) {
            number = (number == 0) ? 11 : number;

            if (number == 1 || number == 4 || number == 7) {
                stringBuilder.append("L");
                positionX = number;
            } else if (number == 3 || number == 6 || number == 9) {
                stringBuilder.append("R");
                positionY = number;
            } else {
                // 2, 5, 8, 0
                distanceFromX = getDistance(number, positionX);
                distanceFromY = getDistance(number, positionY);

                if (distanceFromX > distanceFromY) {
                    stringBuilder.append("R");
                    positionY = number;
                } else if (distanceFromY > distanceFromX) {
                    stringBuilder.append("L");
                    positionX = number;
                // 같은 경우
                } else {
                    if (hand.equals("left")) {
                        stringBuilder.append("L");
                        positionX = number;
                    } else if (hand.equals("right")) {
                        stringBuilder.append("R");
                        positionY = number;
                    }
                }
            }
        }

        return new String(stringBuilder);

    }

    private static int getDistance(int number, int position) {
        return (Math.abs(number-position)) % 3 + (Math.abs(number-position)) / 3 ;
    }

}
