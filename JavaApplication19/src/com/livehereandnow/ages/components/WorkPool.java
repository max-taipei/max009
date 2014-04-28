/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.ages.components;

/**
 *
 * @author max
 */
public class WorkPool {
    int 黃點;

    public int get黃點() {
        return 黃點;
    }

    public void set黃點(int 黃點) {
        this.黃點 = 黃點;
    }
    public void add黃點(int k) {//int是整數.包括正整數.0.負整數
        this.黃點 = 黃點+k;
    }

    @Override
    public String toString() {
        return "WorkPool{" + "\u9ec3\u9ede=" + 黃點 + '}';
    }
    
}
