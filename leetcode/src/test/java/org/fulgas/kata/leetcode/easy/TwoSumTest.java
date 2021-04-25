package org.fulgas.kata.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    void bruteForce9() {

        assertArrayEquals(TwoSum.bruteForce(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
    }

    @Test
    void bruteForce6() {
        assertArrayEquals(TwoSum.bruteForce(new int[]{3, 2, 4}, 6), new int[]{1, 2});
    }

    @Test
    void bruteForce3() {
        assertArrayEquals(TwoSum.bruteForce(new int[]{3, 3}, 6), new int[]{0, 1});
    }

    @Test
    void complement9() {
        assertArrayEquals(TwoSum.complement(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
    }

    @Test
    void complement6() {
        assertArrayEquals(TwoSum.complement(new int[]{3, 2, 4}, 6), new int[]{1, 2});
    }

    @Test
    void complement3() {
        assertArrayEquals(TwoSum.complement(new int[]{3, 3}, 6), new int[]{0, 1});
    }

}