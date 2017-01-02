package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int areaSum = 0;
        for(Rectangle rect: rectangles){
//            System.out.println(rect.area());
            areaSum += rect.area();
        }
        return areaSum / rectangles.length;
    }
}
