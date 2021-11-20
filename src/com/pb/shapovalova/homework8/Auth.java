package com.pb.shapovalova.homework8;

public class Auth {

    private String login;
    private String password;

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

    public void SignUp (String loginUp, String passwordUp, String confirmPassword){
        try {
        if (loginUp != null && loginUp.matches("[A-Za-z0-9{5,20} ]+")){
            this.login = loginUp;
        }
            if (passwordUp != null && passwordUp.matches("[A-Za-z0-9{5,}_ ]+")
                    && confirmPassword.equals(passwordUp)) {
                this.password = passwordUp;
            }
        } catch (WrongLoginException exLogin1) {
            System.out.println("Недопустимый логин");
        } catch (WrongPasswordException exPassword) {
            System.out.println("Недопустимый пароль");
        }
    }

    public boolean SignIn (String loginIn, String passwordIn){
        try {
            if (login.equals(loginIn) && password.equals(passwordIn)) {
                return true;
            }
        } catch (WrongLoginException exLogin2) {
            System.out.println("Неверный логин или пароль");
        }
        return false;
    }
}
