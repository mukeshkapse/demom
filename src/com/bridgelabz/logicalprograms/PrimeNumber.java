package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int number=inp.nextInt();
        if(number==2)
        {
            System.out.println("It is prime number");
        }
        int p=2;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                p++;
                break;
            }
        }
        if(p==0)
        {
            System.out.println("It is a prime Number");
        }
        else
        {
            System.out.println("It is not a prime Number");
        }
    }
}
