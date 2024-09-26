package com.project;

import java.util.ArrayList;

class NumderOperation {

    public static void main(String[] args) {

        ArrayList<Number> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20.5);      // Можна передавати значення до списку у такі способи теж:
        nums.add(30);        //
        nums.add(40.7);      //  nums.add((float)10);
        nums.add(50);        //
        nums.add(60.3);      //  float num1 = 10;
        nums.add(70);        //  nums.add(num1);
        nums.add(80.1);
        nums.add(90);
        nums.add(100.9);

        System.out.print("Список чисел: ");
        for(Number i : nums)                     // Tyт можна використувувати
            System.out.print(i + " ");           // for(int i = 0; i < nums.size(); i++)

        PrintIntNum(nums);
        PrintFloatNum(nums);
        Plus10DividedBy2(nums);
    }


    public static void PrintIntNum(ArrayList<Number> nums) {

        ArrayList<Integer> result1 = new ArrayList<>();
        int res1;

        for(Number i : nums) {
            res1 = Math.round(i.floatValue());
            result1.add(res1);
        }

        System.out.print("\nСписок чисел у форматі цілих чисел: ");
        for(int n : result1)
            System.out.print(n + " ");

    }

    public static void PrintFloatNum(ArrayList<Number> nums) {

        ArrayList<String> result2 = new ArrayList<>();
        String res2;

        for(Number i : nums) {
            res2 = String.format("%.2f", i.doubleValue());
            result2.add(res2);
        }

        System.out.print("\nСписок чисел у форматі дробних чисел з 2-ма знаками після коми: ");
        for(String n : result2)
            System.out.print(n + " ");

    }


    public static void Plus10DividedBy2(ArrayList<Number> nums) {

        ArrayList<Number> result3 = new ArrayList<>();
        double res3;

        for (Number i : nums) {
            res3 = (i.doubleValue() + 10) / 2;
            result3.add(res3);
        }

        System.out.print("\nСписок чисел з урахуванням формули (x + 10)\\2: ");
        for(Number i : result3)
            System.out.print(i + " ");
    }
}

