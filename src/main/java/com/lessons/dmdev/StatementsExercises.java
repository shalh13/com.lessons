package com.lessons.dmdev;

import java.util.Scanner;

public class StatementsExercises {


    public static void main(String[] args) {

          monthNameByNumber(10);
          lastNumber(-9);
          sumRubFromConsole();
          isLeapYearFromConsole();

         }

    // 1. Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
    public static void monthNameByNumber (int mNumber){

        if(mNumber==12 || mNumber==1 || mNumber==2){
            System.out.println("Winter");
        } else if (2<mNumber && mNumber<6) {
            System.out.println("Spring");
        } else if (5<mNumber && mNumber<9) {
            System.out.println("Summer");
        } else if (8<mNumber && mNumber<12){
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong month number");
        }

    }

    // 2. Дано целое число. Определить, является ли последняя цифра этого числа - цифрой 3.
    public static void  lastNumber (int lNumber){

        if ((lNumber % 10 == 3) || (lNumber % 10 == -3)){
            System.out.println("последняя цифра числа равна 3");
        }else{
            System.out.println("последняя цифра числа не равна 3");
        }

    }

    /* 3. Пользователь вводит целое число с консоли. Это число - сумма денег в рублях.
     Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
     рубль - 1, 21, 31 , но если заканчивается на 11, то рублей
     рубля - 2,3,4, 22 - 24, 32 - 34 , но если заканчивается на 12,13,14, то рублей
     рублей - 0,  5-20, 25 -  30, 35 - 40
     */
    public static void sumRubFromConsole (){

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int sumRub = Integer.parseInt(in.nextLine());

        int d10 = sumRub % 10;
        int d100 = sumRub % 100;

        if (sumRub<0){
            System.out.println("Введите положительное число");
        }else if ((d10 == 1) && (d100 != 11)){
            System.out.println(sumRub + " рубль");
        }else if(((d10 == 2) || (d10 == 3) || (d10 == 4)) && !((d100 == 12) ||(d100 == 13)||(d100 == 14))){
            System.out.println(sumRub + " рубля");
        }else{
            System.out.println(sumRub + " рублей");
        }
    }

    /* 4. Пользователь вводит год. Определить является ли этот год високосным.
    Год считается високосным, если он делится без остатка на 4. Но, если год также делится на 100, то этот год не високосным,
    за исключением годов, делящихся на 400.
    Например:
    1992 - високосным
    1900 - не високосный
    2000 - високосный
    */
    public static void isLeapYearFromConsole () {

        Scanner in = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = Integer.parseInt(in.nextLine());

        int d4 = year % 4;
        int d100 = year % 100;
        int d400 = year % 400;

        if (year<0){
            System.out.println("Введите год нашей эры");
        } else if ((d400 == 0) || ((d4 == 0) && (d100 != 0))) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }

    }

}
