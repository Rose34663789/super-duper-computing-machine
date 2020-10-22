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
 */
public class Guesser {
    
    private int questions;
    private Range range;
    
    public Guesser(Range range) {
        this.range = range;
        questions = (int) (Math.log(range.getRange()) / Math.log(2)) + (((Math.log(range.getRange()) / Math.log(2)) % 1 == 0)? 0 : 1);
    }
    
    public void setUp() {
        System.out.println("There will be up to " + questions + " questions asked");
    }
    
    public int ask(Scanner sc) {
        for (int i = 1; i <= questions; i++) {
        System.out.println("Question " + i + ": Is your number greater than " + range.getMiddle() + "?");
        
        while (true) {
            char input = sc.next().charAt(0);
            
            if (input == 'y' || input == 'Y') {
                range.setMin(range.getMiddle() + 1);
                break;
            } else if (input == 'n' || input == 'N') {
                range.setMax(range.getMiddle());
                break;
            } else {
                System.out.println("Your answer must be y or n, the question was: Is your number greater than " + range.getMiddle() + "?");
        
        }
        }
        
        if (range.getRange() == 1) {
            break;
        }
        
        }
        return range.getMiddle();
    }
}
