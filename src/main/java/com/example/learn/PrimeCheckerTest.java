package com.example.learn;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeCheckerTest {
    @Test
    public void testIsPrime_WithPrimeNumber_ShouldReturnTrue() {
        assertTrue(PrimeChecker.isPrime(2));
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(5));
        assertTrue(PrimeChecker.isPrime(7));
        assertTrue(PrimeChecker.isPrime(11));
        assertTrue(PrimeChecker.isPrime(13));
        assertTrue(PrimeChecker.isPrime(17));
        assertTrue(PrimeChecker.isPrime(19));
        assertTrue(PrimeChecker.isPrime(23));
        assertTrue(PrimeChecker.isPrime(29));
        // Thêm các trường hợp khác cho số nguyên tố lớn
    }

    @Test
    public void testIsPrime_WithNonPrimeNumber_ShouldReturnFalse() {
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(6));
        assertFalse(PrimeChecker.isPrime(8));
        assertFalse(PrimeChecker.isPrime(9));
        assertFalse(PrimeChecker.isPrime(10));
        assertFalse(PrimeChecker.isPrime(12));
        assertFalse(PrimeChecker.isPrime(14));
        assertFalse(PrimeChecker.isPrime(15));
        assertFalse(PrimeChecker.isPrime(16));
        assertFalse(PrimeChecker.isPrime(18));
        assertFalse(PrimeChecker.isPrime(20));
        assertFalse(PrimeChecker.isPrime(21));
        assertFalse(PrimeChecker.isPrime(22));
        assertFalse(PrimeChecker.isPrime(26));
        // Thêm các trường hợp khác cho số không phải là số nguyên tố
    }

    @Test
    public void testIsPrime_WithZero_ShouldReturnFalse() {
        assertFalse(PrimeChecker.isPrime(0));
    }


}
