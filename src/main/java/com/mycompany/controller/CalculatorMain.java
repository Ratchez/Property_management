package com.mycompany.controller;

public class CalculatorMain {

    public static void main(String[] args){
        CalculatorController cc = new CalculatorController();
        Double result = cc.add(13.5, 8.5, 6.1);
        System.out.println(result);
    }
}
