/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computerguessesnumber;

import java.util.Scanner;

/**
 *
 * @author mkfinnerty21
 */
public class IntegerGetter {
    
    Scanner input;
    public IntegerGetter(Scanner input) {
        this.input = input;
    }
    
    public int getInt(Scanner input) {
        while (true) {
            if (!input.hasNextInt()) {
                System.out.println("Please enter an integer value");
                input.next();
            } else {
            break;
            }
    }
        return input.nextInt();
    }
}
