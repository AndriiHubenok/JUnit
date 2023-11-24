package org.example;

public class SumCalculator {

    public int sum(int n) {
        int sum = 0;
        if(n == 0) {
            throw new IllegalArgumentException("The argument isn't legal");
        }
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        return sum;
    }
}
