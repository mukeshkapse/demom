package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Enter a Number ");
            int number=inp.nextInt();
            int rem;
            int reversenumber=0;
            while(number!=0) {
                rem=number%10;
                reversenumber=(reversenumber*10)+rem;
                number=number/10;
            }
            System.out.println("the reverse number is =>" +reversenumber);
        }
    }

}
