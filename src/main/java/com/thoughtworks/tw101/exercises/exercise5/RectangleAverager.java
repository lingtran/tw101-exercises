package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float sumOfRectangleAreas = 0;

        for(Rectangle rectangle: rectangles) {
           sumOfRectangleAreas += rectangle.area();
        }

        return sumOfRectangleAreas/rectangles.length;
    }
}
