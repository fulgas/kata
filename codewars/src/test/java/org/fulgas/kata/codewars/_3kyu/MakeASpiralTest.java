package org.fulgas.kata.codewars._3kyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MakeASpiralTest {

    @Test
    public void test5() {
        assertArrayEquals(
            new int[][] {
                { 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1 }
            },
            MakeASpiral.spiralize(5));
    }

    @Test
    public void test8() {
        assertArrayEquals(
            new int[][] {
                { 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1 },
            },
            MakeASpiral.spiralize(8));
    }
}