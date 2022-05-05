package com.lessons.simpleAutomation;

public class User {
    private String login;
    private String password;

    //Создание своего конструктора класса - чтобы сразу инициализировать логин и пароль
    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    //перегрузка метода
    public User(String login){
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //переопределение метода equals для класса User. По стандарту все классы наследуют метод equals от класса Object,
    // а в нем equals это "=="
    @Override
    public boolean equals(Object object){
        if(object == this) return true; // проверяем не на один и тот же адрес ссылаются сравниваемые переменные
        if(!(object instanceof User)) return false; // проверяем является ли объект инстансом класса User

        return ((User)object).getLogin().equals(this.getLogin());
    }

}
