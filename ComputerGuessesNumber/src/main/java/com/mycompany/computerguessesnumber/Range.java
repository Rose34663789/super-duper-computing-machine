/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computerguessesnumber;

/**
 *
 * @author Meghan
 */
public class Range {
    
    private int min;
    private int max;
    
    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    public int getRange() {
        return max - min + 1;
    }
    
    public int getMiddle() {
        int middle;
        middle = (int) ((getRange() / 2.0) + min - .5);
        return middle;
    }
    
    public void setMin(int min) {
        this.min = min;
    }
    
    public void setMax(int max) {
        this.max = max;
    }
}
