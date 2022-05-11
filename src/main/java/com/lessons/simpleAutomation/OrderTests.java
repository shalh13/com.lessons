package com.lessons.simpleAutomation;

//Класс содержащий тесты по заказам
public class OrderTests extends BaseTestWithOrder {

    public void testCreateOrder(){
        System.out.println("check that order was created");
    }

    public void testListOrders(){
        System.out.println("list orders");
        System.out.println("check that order is displayed");
    }

}
