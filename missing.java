package com.studyopedia;
import java.util.Scanner;
public class missing {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        int n=out.nextInt();
        int a[]=new int[n];
        System.out.println("enter the value");
        for(int i=0;i<n;i++) {
             a[i]=out.nextInt();
        }
        int s1=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        int result=s1-sum;
        System.out.println("ans is"+result);
    }}
