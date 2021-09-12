package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner (System.in);
        System.out.println("Password: ");
        String pass = input1.nextLine();

        if(pass.equals("71368#"))
        {
            System.out.println("Access Granted");
        }
        else
        {
            System.out.println("Access Denied");
        }

    }
}
