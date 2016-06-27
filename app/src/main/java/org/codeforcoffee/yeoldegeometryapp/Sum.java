package org.codeforcoffee.yeoldegeometryapp;

/**
 * Created by codeforcoffee on 6/27/16.
 */
public class Sum {

    private double firstNum;
    private double secondNum;
    private double total;

    public Sum(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.total = this.firstNum + this.secondNum;
    }

    public double getTotal() {
        this.total = this.firstNum + this.secondNum;
        return this.total;
    }


    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
}
