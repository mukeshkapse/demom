package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number=inp.nextInt();
        int sum=0;
        for(int i=1;i<number/2;i++) {
            if(number%i==0) {
                sum=sum+i;
            }
        }
        if(sum==number) {
            System.out.println("It is a Perect No.");
        }
        else {
            System.out.println("It is Not a Perfect No.");
        }

    }
}
