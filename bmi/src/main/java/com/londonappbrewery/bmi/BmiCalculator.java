package com.londonappbrewery.bmi;

public class BmiCalculator {
    public static void main(String[] args) {
    double bmiindex = bmiCal(75,3);
    System.out.println("Your Body Mass index is: " + bmiindex  );

    }

    public static double bmiCal(float mass, double height)
    {
        double BMI;
        BMI = mass/height;


    if (BMI > 25){
            System.out.print("You are overweight. ");
    }
    else if(BMI >= 18.5 && BMI <= 25)
        {
            System.out.println("You are normalweight. ");
        }
        else
        {
            System.out.println("You are underweight. ");
        }

        return BMI;
    }
}
