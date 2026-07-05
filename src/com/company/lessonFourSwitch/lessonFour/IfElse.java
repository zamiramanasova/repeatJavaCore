package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
       int a =1, b =2;

       if (a > b) {
           System.out.println("a < b");
       }

       if (a < b) {
           System.out.println(a < b);
       }else {
           System.out.println("a не меньше b");
       }

       String login = "Admin";
       String password = "password";

       Scanner sc = new Scanner(System.in);

       String usersLogin = sc.next();

       if (login.equals(usersLogin)) {
           System.out.println("Введите пароль: ");
           String userPassword = sc.next();
           // вложенная конструкция
           if (password.equals(userPassword)) {
               System.out.println("Здравствуйте "+ usersLogin + "вы вошли в систему.");
           } else {
               System.out.println("Password not correct");
           }
       }else {
           System.out.println("User not found!");
       }
    }
}
