package com.company;

import java.util.Scanner;

class Formula{
    private static Formula formula = new Formula();
    private double x, y;
    private Formula(){

    }
    public static Formula getInstance(){
        return formula;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double Decision(){
        return (2 * x) + (3 / y);
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Formula formula = Formula.getInstance();
        System.out.print("Введите X: ");
        double x = in.nextDouble();
        System.out.print("Введите Y: ");
        double y = in.nextDouble();
        formula.setX(x);
        formula.setY(y);
        System.out.printf("Результат: %s\n", formula.Decision());

        Formula formula1 = Formula.getInstance();
        System.out.println(formula1.getX());
        System.out.println(formula1.getY());
    }
}