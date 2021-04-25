package org.fulgas.kata.codewars._3kyu;

public class MakeASpiral {
    public static int[][] spiralize(int size) {
        if (size == 0) {
            return new int[0][0];
        } else if (size == 1) {
            return new int[][]{{1}};
        } else if (size == 2) {
            return new int[][]{{1, 1}, {0, 1}};
        }
        final int[][] spiral = new int[size][size];
        //start position
        int i = 0;
        int j = 0;
        //direction
        int di = 0;
        int dj = 1;
        int rotated = 0;
        //rotate only once at the time
        while (rotated < 2) {
            spiral[i][j] = 1;
            if (canMove(spiral, i, j, di, dj)) {
                i += di;
                j += dj;
                rotated = 0;
            } else {
                //rotate clockwise
                int tmp = di;
                di = dj;
                dj = -tmp;
                rotated += 1;
            }
        }
        int tmp = di;
        di = -dj;
        dj = tmp;
        if (spiral[i + di][j + dj] == 1) {
            spiral[i][j] = 0;
        }

        return spiral;
    }


    private static boolean canMove(int[][] spiral, int i, int j, int di, int dj) {
        int n = spiral.length;
        i += di;
        j += dj;
        //out of boundaries
        if (i < 0 || i >= n || j < 0 || j >= n) {
            return false;
        }
        //already occupied
        if (spiral[i][j] == 1) {
            return false;
        }
        i += di;
        j += dj;
        //second move fails outside the boundary we can move
        if (i < 0 || i >= n || j < 0 || j >= n) {
            return true;
        }
        return spiral[i][j] != 1;
    }
}