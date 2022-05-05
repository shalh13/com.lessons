package com.lessons.simpleAutomation;

import java.util.*;

public class Main {

    private static final User EXISTED_USER = new User("existed","");
    private static final User NOT_EXISTED_USER = new User ("wrong","");

    public static void main(String[] args) {

       /*
        User user = new User(); //Стандартный конструктор класса - не принимает переменные и ничего не делает, кроме выделения памяти.
        String[] users = {EXISTED_USER, NOT_EXISTED_USER};
        for(User user : users){
            System.out.println("Login as " + user.getLogin());
            System.out.println(instance.loginAs(user));
        }
        */
        new AuthorizationTests().testLogin(); // При создании экземпляра класса AuthorizationTests сперва вызывается конструктор его родительского класса BaseTestWithAuthorization

        OrderTests orderTests = new OrderTests();
        orderTests.testCreateOrder();
        orderTests.testListOrders();

 /*     Интерфейсы
        List<String> - ArrayList - динамически расширяемый список
                       LinkedList -
                       Stack -
        Map<String, Integer> - ключ-значение
                       SortedMap
                       TreeMap
                       HashMap
        */

        List<String> strings = new ArrayList<>();  // элементы хранятся в порядке добавления
        strings.add("два");
        strings.add("один");
        strings.add("три");

        // 2й вариант, более лаконичный -  List<String> strings = Arrays.asList("два", "один", "три");

        Map<String, Integer> digesMap = new HashMap<>();
        digesMap.put("один", 1);
        digesMap.put("два", 2);
        digesMap.put("три", 3);

        strings.forEach(str -> System.out.println(digesMap.get(str)));
    }

}