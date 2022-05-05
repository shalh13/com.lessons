package com.lessons.simpleAutomation;

//Базовый класс наследуемый от BaseTestWithAuthorization для всех тестов, которые требуют создания заказа
public class BaseTestWithOrder extends BaseTestWithAuthorization{

    public BaseTestWithOrder(){
        System.out.println("create order");
    }

}
