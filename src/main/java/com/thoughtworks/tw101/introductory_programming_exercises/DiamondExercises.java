package com.thoughtworks.tw101.introductory_programming_exercises;

import org.apache.commons.lang3.StringUtils;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        String triangle = "";

        for(int i = 1; i <= n+2; i+=2){
            String row = centerRow(drawRow(i), n+2);
            triangle = triangle.concat(row + "\n");
        }

        System.out.println(triangle);
    }

    private static String drawRow(int n){
        String star = "*";
        return new String(new char[n]).replace("\0", star);
    }

    private static String centerRow(String starsForRow, int lengthOfRow) {
        return StringUtils.center(starsForRow, lengthOfRow);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {

    }
}
