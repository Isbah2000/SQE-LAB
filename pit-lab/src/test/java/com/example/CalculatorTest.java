package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test void testAdd(){ var c=new Calculator(); assertEquals(5,c.add(2,3)); assertEquals(0,c.add(-1,1));}
    @Test void testDivide(){ var c=new Calculator(); assertEquals(2,c.divide(6,3));}
    @Test void testIsPositive_weak(){ var c=new Calculator(); assertTrue(c.isPositive(5)); }
}