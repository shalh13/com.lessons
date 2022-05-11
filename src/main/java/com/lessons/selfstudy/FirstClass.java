package com.lessons.selfstudy;

import com.lessons.selfstudy.SecondClass;

public class FirstClass {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        //вызов метода из клаcca SecondClass с модификатором static
        int z = SecondClass.add(5, 4);
        System.out.println(z);

        //вызов метода из клаcca SecondClass без модификатора static, т.е. необходимо создать объект класса
        SecondClass object = new SecondClass();
        object.average(2, 4);

    }

}
