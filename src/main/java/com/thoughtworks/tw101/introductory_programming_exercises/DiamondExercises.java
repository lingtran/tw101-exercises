package com.thoughtworks.tw101.introductory_programming_exercises;

import org.apache.commons.lang3.StringUtils;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamond(3);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        String triangle = "";

        for(int numberOfStars = 1; numberOfStars <= n+2; numberOfStars+=2){
            String row = centerRow(drawRow(numberOfStars), n+2);
            triangle = triangle.concat(row + "\n");
        }

        System.out.println(triangle);
    }

    private static String drawRow(int n){
        String stars = "*";
        return new String(new char[n]).replace("\0", stars);
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
        if(n % 2 == 0) {
            System.out.println("Argument must be an even number");
        } else {
            String diamond = drawTop(n) + drawBottom(n);
            System.out.println(diamond);
        }
    }

    private static String drawTop(int n) {
        String topHalf = "";

        for(int numberOfStars = 1; numberOfStars <= n+2; numberOfStars+=2){
            String row = centerRow(drawRow(numberOfStars), n+2);
            topHalf = topHalf.concat(row + "\n");
        }

        return topHalf;
    }

    private static String drawBottom(int n) {
        String bottomHalf = "";

        for(int numberOfStars = n; numberOfStars > 0; numberOfStars-=2) {
            String row = centerRow(drawRow(numberOfStars), n+2);
            bottomHalf = bottomHalf.concat(row + "\n");
        }

        return bottomHalf;
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
