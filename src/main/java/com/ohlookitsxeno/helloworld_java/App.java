package com.ohlookitsxeno.helloworld_java;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number");

        int num = sc.nextInt();

        System.out.println((num % 2 == 0) ? "even" : "odd");
    }
}
