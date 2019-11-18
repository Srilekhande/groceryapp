package com.company;
import java.io.*;
import java.util.*;

public class Main
{
    static Map<String,Integer> Veggies = new HashMap<String,Integer>();
   // static Map<Integer,Map<String, Integer>> Veggies1 = new HashMap<String,Integer>();
    static Map<String,Integer> Fruits = new HashMap<String,Integer>();

    public void addVeggies()
    {
        Veggies.put("Potato", 12);
        Veggies.put("Onion", 11);
        Veggies.put("Tomato", 10);
        Veggies.put("Brinjal", 13);
        Veggies.put("Cucumber", 15);
        Veggies.put("Carrot", 16);
    }

    public void addFruits()
    {
        Fruits.put("Banana", 16);
        Fruits.put("Apple", 17);
        Fruits.put("Guava", 13);
        Fruits.put("Grapes", 12);
    }

    public void display()
    {
        Veggies.forEach((k,v) -> System.out.printf("%-25s %15s %n","Vegetables = " + k ,"Quantity = " + v));

        Fruits.forEach((k,v) -> System.out.printf( "%-25s %15s %n", "Fruits = " + k, "Quantity = " + v));
    }


    public void buyVeggies(String a, int b)
    {
       int c= Veggies.get(a);
        if(b <= c)
        {
            c=c-b;
            System.out.println( a + " has been added to your shopping list");
            Veggies.replace(a,c);
        }
        else{System.out.println("Item not available.");}

    }

    public void buyFruits(String a, int b)
    {
        int c = Fruits.get(a);
        if(b <= c)
        {
            c=c-b;
            System.out.println( a + " has been added to your shopping list");
            Fruits.replace(a,c);
        }


    }

    public void dealerVeggies(String a,int b)
    {
        Veggies.put(a,b);
    }

    public void dealerFruits(String a,int b)
    {
        Fruits.put(a,b);
    }
    public static void main(String[] args)
    {
        Main test = new Main();
        test.addFruits();
        test.addVeggies();
        test.display();
        Scanner  scan = new Scanner(System.in);

        int i=1;
        while(i==1)
        {
            System.out.println("What do you want to buy?");
            System.out.println("1.Vegetables   2.Fruits");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("What vegetables do you want?");
                    String input = scan.next();
                    System.out.println("How many kgs do you want?");
                    int qua = scan.nextInt();
                    test.buyVeggies(input, qua);
                    break;


                case 2:
                    System.out.println("What fruits do you want?");
                    String input1 = scan.next();
                    System.out.println("How many kgs do you want?");
                    int qua1 = scan.nextInt();
                    test.buyFruits(input1, qua1);
                    break;
            }
            System.out.println("Do you want to continue shopping? 1. Yes 2. No");
            i = scan.nextInt();
        }
        test.display();

        int p=1;
        while(p==1)
        {
            System.out.println("What do vegetables do you want update?");
            String in = scan.next();
            System.out.println("How much is the updated quantity?");
            int q = scan.nextInt();
            test.dealerVeggies(in, q);

            System.out.println("What do fruits do you want update?");
            String in1 = scan.next();
            System.out.println("How much is the updated quantity?");
            int q1 = scan.nextInt();
            test.dealerFruits(in1, q1);

            System.out.println("Do you want to keep updating? 1. Yes 2. No");
           p= scan.nextInt();

        }

        test.display();





    }
}
