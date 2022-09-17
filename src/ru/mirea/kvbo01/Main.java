package ru.mirea.kvbo01;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
       int n= rand.nextInt(21)+5; //from 5 to 25 generate
        double[] ar=new double [n]; //массив на n эл-тов
        System.out.println("Массив длинной " +n+" ");
        for (int i = 0; i < n; i++)
        {
         ar[i]=Math.random()-0.5;
            System.out.print(ar[i]+" ");
        }
        System.out.println("\nОтсортированный массив ↓↓↓ ");
        Arrays.sort(ar);
        for (int i = 0; i < n; i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

    }
}
