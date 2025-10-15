package org.example;

import java.util.*;

public class var7 {


    public static double[] processArray(double[] A) {
        if (A.length == 0) return new double[0];

        List<Double> result = new ArrayList<>();
        result.add(A[0]);

        for (int i = 1; i < A.length; i++) {
            if (A[i] > result.get(result.size() - 1)) {
                result.add(A[i]);
            }
        }


        double[] resArr = new double[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArr[i] = result.get(i);
        }
        return resArr;
    }

    public static void main(String[] args) {
        double[] A = {5.5, 2.5, 4.6, 7.2, 5.8, 9.4};
        double[] B = {1.2, 3.4, 2.8, 4.0, 5.1};
        double[] C = {9.9, 9.1, 10.2, 10.5, 11.0};

        double[] Ares = processArray(A);
        double[] Bres = processArray(B);
        double[] Cres = processArray(C);

        System.out.println("Массив A -> " + Arrays.toString(Ares) + ", размер: " + Ares.length);
        System.out.println("Массив B -> " + Arrays.toString(Bres) + ", размер: " + Bres.length);
        System.out.println("Массив C -> " + Arrays.toString(Cres) + ", размер: " + Cres.length);
    }
}