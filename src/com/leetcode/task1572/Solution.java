package com.leetcode.task1572;

import java.util.concurrent.*;

public class Solution {
    Sum sum1;
    Sum sum2;

    public int diagonalSum(int[][] mat) {
        sum1 = new Sum(mat, true);
        sum2 = new Sum(mat, false);
        int diag1;
        int diag2;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = executorService.submit(sum1);
        Future<Integer> future2 = executorService.submit(sum2);
        try {
            diag1 = future1.get();
            diag2 = future2.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
        int result = diag1 + diag2;
        int middle = mat.length / 2;
        return mat.length % 2 != 0 ? result - mat[middle][middle] : result;
    }
}

class Sum implements Callable<Integer> {

    private final int[][] array;
    private final boolean mainDiag;

    public Sum(int[][] array, boolean mainDiag) {
        this.array = array;
        this.mainDiag = mainDiag;
    }

    Integer sum(int[][] matrix, boolean mainDiag) {
        int result = 0;
        if (mainDiag) {
            for (int i = 0; i < matrix.length; i++) {
                result += matrix[i][i];
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                result += matrix[i][matrix.length - 1 - i];
            }
        }
        return result;
    }

    @Override
    public Integer call() {
        return sum(array, mainDiag);
    }
}
