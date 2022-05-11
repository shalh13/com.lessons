package com.lessons.dmdev;

public class CyclesExamples {

    public static void main(String[] args) {

    whileExample(3);
     doWhileExample(2);
        forExample(3);

    }

    public static void whileExample (int a){
        while (a>0){
            System.out.println(a);
            a--;
        }

    }
    
    public static void doWhileExample (int a){
        do {
            System.out.println(a);
            a--;
        }
        while (a>0);
    }

    public static void forExample (int a){

        //[инициализация][условие][изменение]
        for (int i = a; i > 0; i--){
            System.out.println(a);
            a--;
        }

        for (int b = 0; b <= 5; b++) {
            System.out.println(b);
            if (b==3){
                break; // ранний выход из цикла for
               // continue; // пропустить эту серию цикла for, но тогда System.out.println(b) должна быть после if{}
            };
        }

    }
}
