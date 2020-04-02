package com.mycode.measurable;

import static com.mycode.measurable.Date.average;
import static com.mycode.measurable.Date.largest;
/*
1. Provide an interface Measurable with a method double getMeasure() that measures
        an object in some way. Make Employee implement Measurable. Provide
        a method double average(Measurable[] objects) that computes the average
        measure. Use it to compute the average salary of an array of employees.
        2. Continue with the preceding exercise and provide a method Measurable
        largest(Measurable[] objects). Use it to find the name of the employee with
        the largest salary.*/

public class Main {
    public static void main(String[] args) {

        Measurable employee1 = new Employee("L", 60000);
        Measurable employee2 = new Employee("M", 30000);
        Measurable employee3 = new Employee("N", 90000);
        Measurable employee4 = new Employee("N", 10000);
        Measurable[] employers = new Measurable[4];

        employers[0] = employee1;
        employers[1] = employee2;
        employers[2] = employee3;
        employers[3] = employee4;

        System.out.println(average(employers));
        System.out.println(largest(employers));

    }
}