package com.lessons.dmdev;

public class FunctionExercises {

    public static void main(String[] args) {

        int result = getMax(5,22);
        System.out.println(result);

        int resultDegree = getNumberToDegree3(3);
        System.out.println(resultDegree);

    }

    /* 1. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.*/
    public static int getMax (int x, int y){
        if (x>y){
            return x;
        }
            return y;
    }

    /* 2. Написать функцию, которая принимает 1 целочисленный параметр, и возвращает значение,
    равное этому параметру возведенному в куб*/
    public static int getNumberToDegree3 (int z){
        z=z*z*z;
        return z;
    }

}
