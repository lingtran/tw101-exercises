package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    String triangle;
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
            String row = drawRow(i);
            triangle += row + "\n";
        }

        System.out.println(triangle);
    }

    private static String drawRow(int n){
        String star = "*";
        return new String(new char[n]).replace("\0", star);
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
