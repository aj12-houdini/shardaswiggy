package org.example;

import java.io.BufferedReader;
import org.example.Dish;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.io.FileReader;
import org.example.Restro;
//Restaurant, Order, Delivery, Custom
class Parse{

    Dish[] dishes = new Dish[10];
    Restro [] restaurants = new Restro[10];
    void parse_dishes(){
        try {
            FileReader fr = new FileReader("data/Dish.csv");
            BufferedReader br = new BufferedReader(fr);
            String newline;
            String[] arr;
            int i = 0;
            while ((newline = br.readLine()) != null) {
                arr = newline.split(",");
                Dish d = new Dish(arr[0],arr[1],arr[2]);
                dishes[i] = d;
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void parse_restaurant(){
        try{
            FileReader f = new FileReader("data/Restro.csv");
            BufferedReader br = new BufferedReader(f);
            String newline;
            String[] arr;
            int i = 0;
            while ((newline = br.readLine()) != null) {
                arr = newline.split(",");
                Restro d = new Restro(arr[0],arr[1],arr[2]);
                restaurants[i] = d;
                i++;
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Sharda Swiggy");
        Parse p = new Parse();
        p.parse_dishes();
        for(Dish i: p.dishes){
            if(i != null)
                System.out.println(i.dish_name + " " +  i.id  + " "  + i.ratings);
        }
    }

}

