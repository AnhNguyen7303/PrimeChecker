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

}
