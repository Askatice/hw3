package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
	int temp;
    int age;
        System.out.println("Введите температуру на улице: ");
        temp = word.nextInt();
        System.out.println("Введите ваш возраст: ");
        age = word.nextInt();
        if (temp >= -20 && temp <= 30){
            if ( age >= 20 && age <= 45){
                text();
            }
        }else {
            textt();
        }

        if (temp >= 0 && temp <= 28){
            if ( age <= 20){
                text();
            }
        } else {
            textt();
        }

        if ( temp >= -10 && temp <= 25){
            if (age >= 45){
                text();
            }
        } else {
            textt();
        }


    }


    public static String text(){
        System.out.println("Можно идти гулять!");
        return "text" ;
    }


    public static String textt(){
        System.out.println("Оставайтесть дома!");
        return "textt" ;
    }

}



