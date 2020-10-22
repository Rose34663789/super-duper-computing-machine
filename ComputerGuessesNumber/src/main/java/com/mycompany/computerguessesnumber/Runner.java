/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computerguessesnumber;
import java.util.Scanner;
/**
 *
 * @author Meghan
 * 10/20/2020
 * Write a program that takes in a minimum and maximum value and can guess the user's secret number
 * 
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IntegerGetter integerGetter = new IntegerGetter(input);
        
        System.out.println("This program will guess your secret number. To use it, please enter a number less than your number and a number greater than your number.\nThis will create the range the computer will guess from. The computer will then ask you a sequence of yes or no questions,\nthese can be answered by typing y or n for yes and no respectively. Once this sequence is complete, the computer will display your number.");
        
        System.out.println("Please note that your secret number and your minimum and maximum values must be integers. \n");
        //Should I assume users will be good and enter numbers?
        int min, max;
        while (true) {
        System.out.println("Please enter your minimum value");
        min = integerGetter.getInt(input);
        System.out.println("Please enter your maximum value");
        max = integerGetter.getInt(input);
        if (min > max) {
            System.out.println("The minimum value must be less than the maximum value");
        } else {
            break;
        }
        }
        
        Range range = new Range(min,max);
        Guesser guesser = new Guesser(range);
        
        guesser.setUp();
        int answer = guesser.ask(input);
        System.out.println("Your secret number was " + answer);
    }
    
}
