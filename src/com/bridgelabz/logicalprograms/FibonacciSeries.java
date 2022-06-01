package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
{
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter the Value");
    int number=inp.nextInt();
    int a=0,b=1,c,i;
    for (i=1;i<=number; i++)
    {
        System.out.println(a);
        c=a+b;
        a=b;
        b=c;
    }
}
}
