package org.tip2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonnaciTest {

    @Test
    public void emptyInteger(){
        Assertions.assertEquals(0 , Fibonacci.fibonacci(0 , "l"));
    }

    @Test
    public void twoInteger(){
        Assertions.assertEquals(1 , Fibonacci.fibonacci(1 , "l"));
    }

    @Test
    public void FibonnaciForFive(){
        Assertions.assertEquals(5, Fibonacci.fibonacci(5 , "l"));
    }

    @Test
    public void FibonnaciForNine(){
        Assertions.assertEquals(34, Fibonacci.fibonacci(9 , "l"));
    }

    @Test
    public void FibonnaciForNegative(){
        Assertions.assertEquals(0, Fibonacci.fibonacci(-9 , "l"));
    }
}