/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Alessio
 */
public class BasicOperation {

    // addition, substraction, division, multiplication 
    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float substractTwoNumbers(float minuend, float substrahend) {
        float substraction = 0;
        substraction = minuend - substrahend;
        return substraction;
    }
    
    public static float multiplyTwoNumbers(float multiplicand, float multiplier) {
        float product = 0;
        product = multiplicand * multiplier;
        return product;
    }

    public static float divideTwoNumbers(float dividend, float divisor) {
        float quotient = 0;
        quotient = dividend / divisor;
        return quotient;
    }
    
}
