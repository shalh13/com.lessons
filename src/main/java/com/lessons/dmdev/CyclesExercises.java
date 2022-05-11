package com.lessons.dmdev;

import java.time.LocalDate;

public class CyclesExercises {

    public static void main(String[] args) {

        int value = 5;
        int result = factorialWhile(value);
        System.out.println("Факториал числа " + value + " равен " + result);

        int result2 = factorialFor(value);
        System.out.println("Факториал числа " + value + " равен " + result2);

        int value2 = 123;
        int result3 = sumNumberWhile(value2);
        System.out.println("Сумма цифр числа " + value2 + " равна " + result3);

        int result4 = sumNumberFor(value2);
        System.out.println("Сумма цифр числа " + value2 + " равна " + result4);


       // sumForManhattan();

    }

    // 1. Написать программу высчитывающую факториал введенного числа - 1*2*3*...*n
    public static int factorialWhile (int number){
        int a = 1;
        while (number>0){
            a=a*number; //a*=number; - то же самое
            number--;
        }
        return a;
    }

    public static int factorialFor (int number) {
        int a = 1;
        for (int i=1; i<=number; i++){
            a*=i;
        }
        return a;
    }

    // 2. Написать программу, которая выводит сумму цифр числа. Например, 123 = 6
    public static int sumNumberWhile (int number){

        int value2 = number;
        int sum = 0;

        while(value2 != 0){
            sum += value2 % 10;
            value2 /= 10;
        }
        return sum;

    }


    // ДОДЕЛАТЬ!
   public static int sumNumberFor (int number){

        int sum = 0;
        for (int i = number; i != 0; i /= 10) {
            sum += number %10;
            }
        return sum;

    }

    // 3. В 1626 году индейцы продали Манхэттен за 24$. Написать программу, которая высчитывает сумму, получившуюся бы в текущем году,
    // если бы индейцы положили эти деньги в банк под 5% годовых.
  /*  public static void sumForManhattan (){
        //Getting the current date value of the system
        LocalDate current_date = LocalDate.now();

        //getting the current year from the current_date
        int current_Year = current_date.getYear();
        int soldYear = 1626;
        int sumResult = 0;

        while (current_Year!=soldYear){
            sumResult=
        }




    }*/



}
