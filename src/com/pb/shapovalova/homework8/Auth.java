package com.pb.shapovalova.homework8;

public class Auth {

    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void SignUp (String loginUp, String passwordUp, String confirmPassword) throws
            WrongLoginException, WrongPasswordException {
        if (loginUp == null || !loginUp.matches("[A-Za-z0-9]{5,20}")){
            throw new WrongLoginException ("-----Недопустимый логин-----");
        }
        if (passwordUp == null || !passwordUp.matches("[A-Za-z0-9_]{5,}")){
                throw new WrongPasswordException ("-----Недопустимый пароль-----");
        }
        if (!confirmPassword.equals(passwordUp)) {
            throw new WrongPasswordException("-----Пароль не подтвержден-----");
        }else {
            System.out.println("-----Регистрация успешно пройдена!-----");
            this.login = loginUp;
            this.password = passwordUp;
        }
    }
    public void SignIn (String loginIn, String passwordIn) throws WrongLoginException {
        if (!loginIn.equals(login) || !passwordIn.equals(password)){
            throw new WrongLoginException("-----Неверный логин или пароль-----");
        }else {
            System.out.println("-----Вы успешно вошли в аккаунт-----");
        }
    }
}
