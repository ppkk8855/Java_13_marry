package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入性別(男、女)");
        String gender = scanner.next();
        while (gender.matches("男")==false&&gender.matches("女")==false){
            System.out.println("請輸入性別(男、女)");
            gender = scanner.next();
        }
        if(gender.matches("男")){
            System.out.println("請輸入年齡");
            int age = scanner.nextInt();
            if(age<18){
                System.out.println("你不能結婚");
            }
            else {
                System.out.println("你可以結婚");
            }
        }
        if(gender.matches("女")){
            System.out.println("請輸入年齡");
            int age = scanner.nextInt();
            if(age<16){
                System.out.println("妳不能結婚");
            }
            else {
                System.out.println("妳可以結婚");
            }

        }
    }
}
