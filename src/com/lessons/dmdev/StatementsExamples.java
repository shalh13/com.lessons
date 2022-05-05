package com.lessons.dmdev;

import java.sql.SQLOutput;

public class StatementsExamples {

// [модифиакторы] - public static, [возвращаемый тип] - void, [название] - main, ([параметры])
    public static void main(String[] args) {

        statementIfElse();
        statementSwitchCase(6);
        statementSwitchCaseArrow(4);
        statementSwitchCaseArrowValue(1);
    }

    public static void statementIfElse() {

        int a = 5;
        if (a < 0){
        System.out.println("a меньше 0");
        } else if (a > 0) {
        System.out.println("a больше 0 ");
        } else {
        System.out.println("a равно 0");
        }

    }

    public static void statementSwitchCase (int a) {

       //в switch можно указать byte, short, int, char, String, enum
        switch(a) {
            case 2:
            case 4:
            case 10:
                System.out.println("а четное и равно " + a);
                break;
            case 13:
                System.out.println("a равнялось 13");
                a = a-3;
                System.out.println("сейчас а равно: " + a);
                break;
            default:
                a +=5;
                System.out.println("а равно: " + a);
                break;
        }
    }

    public static void statementSwitchCaseArrow(int b){
        switch(b){
            case 3 -> System.out.println("b равно три");
            case 2,4,6,8 -> System.out.println("b четное");
            default -> System.out.println("b не равно ни три ни восемь");
        }
    }

    // var - заменяет тип данных и сам задает его, используем при создании переменной и ее инициализации

    public static void statementSwitchCaseArrowValue(int c){
        char charValue = switch(c){
            case 1 -> '1';
            case 2,4,6,8 -> '2';
            default -> '0';
        };
    }



}
