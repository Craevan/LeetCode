package com.leetcode.task1822;

import java.util.concurrent.*;

public class SolutionWithThreads {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        int[] array = {-1, -2, -3, -4, 3, 2, 1};
        ProductOfArrayElements product = new ProductOfArrayElements(array);
        Future<Integer> result = executor.submit(product);
        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            System.err.println(e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}

class ProductOfArrayElements implements Callable<Integer> {
    private final int[] array;

    public ProductOfArrayElements(int[] array) {
        this.array = array;
    }

    @Override
    public Integer call() {
        int countOfNegativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return 0;
            }
            if (array[i] < 0) {
                ++countOfNegativeNumbers;
            }
        }
        return countOfNegativeNumbers % 2 == 0 ? 1 : -1;
    }
}
