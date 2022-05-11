package com.lessons.selfstudy;

public class SecondClass {

    //метод с модификатором static доступен через <название класса содержащего метод>.<название метода>
    public static int add (int x,int y){
        int z = x+y;
        return z;
    }

    //метод без модификатора static доступен только через созданный в конструкторе объект <название объекта>.<название метода>
    public void average (int x,int y){
        int z = (x+y)/2;
        System.out.println(z);
    }

}
