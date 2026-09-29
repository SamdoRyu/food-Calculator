package com.team3.food;

public class MultiplyCalculator {

    public int multiply(int kcal, int count) {
        return kcal * count;
    }

    public void printTable(int kcal, int maxCount) {
        for( int i=1; i<= maxCount; i++) {
            System.out.println(i+"인분 : " + multiply(kcal,i)+"kcal");
        }
    }

}
