package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private float sumOfRectangleAreas;
    private float numberOfRectangles;

    public float averageArea(Rectangle[] rectangles) {
        numberOfRectangles = rectangles.length;

        addUpRectangleAreas(rectangles);

        return sumOfRectangleAreas/numberOfRectangles;
    }

    private void addUpRectangleAreas(Rectangle[] rectangles) {
        for(Rectangle rectangle: rectangles) {
           sumOfRectangleAreas += rectangle.area();
        }
    }
}
