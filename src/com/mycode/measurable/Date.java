package com.mycode.measurable;

public class Date {

    public static double average(Measurable[] objects) {
        int size = objects.length;
        double sum = 0;
        for (Measurable item : objects) {
            sum += item.getMeasure();
        }
        return size == 0 ? 0 : sum / size;
    }
    public static double largest(Measurable[] obj){
        double result = 0;

        for (Measurable item : obj) {
            if (Double.compare(item.getMeasure(), result)==1)
            {
                result = item.getMeasure();
            }
        }
        return result;
    }
}
