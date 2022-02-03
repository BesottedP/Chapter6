package com.company;

import java.util.Arrays;

public class Spiral {

    public static int []spiral(int [][] a){
        int rows = a.length;
        int length = a[0].length;
        int[] result = new int[rows*length];
        int count = 0;
        int FINCOUNT = rows+length-2;

        int maxrow = 0;
        int maxlen = 0;
        int maxrowIF = rows;
        int maxlenIF = length;
        for (int x = 100; x> 0; x--) {

            for (int i = 0; i < maxlenIF; i++) {
                if (FINCOUNT == 0) {
                    break;
                }
                result[count] = a[maxrow][maxlen];
                count++;
                maxlen++;
            }
            maxlenIF--;
            maxlen--;
            maxrow++;
            FINCOUNT--;

            for (int j = 0; j < maxrowIF - 1; j++) {
                if (FINCOUNT == 0) {
                    break;
                }
                result[count] = a[maxrow][maxlen];
                count++;
                maxrow++;
            }
            maxrowIF--;
            maxrow--;
            maxlen--;
            FINCOUNT--;

            for (int k = 0; k < maxlenIF; k++) {
                if (FINCOUNT == 0) {
                    break;
                }
                result[count] = a[maxrow][maxlen];
                count++;
                maxlen--;
            }
            maxlenIF--;
            maxlen++;
            maxrow--;
            FINCOUNT--;


            for (int r = 0; r < maxrowIF - 1; r++) {
                if (FINCOUNT == 0) {
                    break;
                }
                result[count] = a[maxrow][maxlen];
                count++;
                maxrow--;
            }
            maxrowIF--;
            maxrow++;
            maxlen++;
            FINCOUNT--;
        }


//        for(int i = 0; i < maxlenIF; i++){
//            result[count] = a[maxrow][maxlen];
//            count++;
//            maxlen++;
//        }
//        maxlenIF--;
//        maxlen--;
//        maxrow++;
//
//        for(int j = 0; j < maxrowIF - 1; j++){
//            result[count] = a[maxrow][maxlen];
//            count++;
//            maxrow++;
//        }
//        maxrowIF--;
//        maxrow--;
//        maxlen--;
//
//        System.out.println(maxlen);
//        System.out.println(maxrow);
//
//        for(int k = 0; k < maxlenIF; k++){
//            result[count] = a[maxrow][maxlen];
//            count++;
//            maxlen--;
//        }
//        maxlenIF--;
//        maxlen++;
//        maxrow--;



        return result;
    }

    public static void main(String[] args) {
        int [][]a={{1,  2,  3,  4, 5},
                {6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        System.out.println(Arrays.toString(spiral(a)));

        int [][] b = {{1, 2,  3,  4},
                {5, 6,  7,  8},
                {9, 10, 11, 12}};
        System.out.println(Arrays.toString(spiral(b)));

        int [][] c = {{15},{38}, {26}};
        System.out.println(Arrays.toString(spiral(c)));

        int [][] d = {{40, 25},
                {17, 99},
                {76, 53},
                {88, 2}};
        System.out.println(Arrays.toString(spiral(d)));

        int [][] e = {{7, 3, 5, 2}};
        System.out.println(Arrays.toString(spiral(e)));
    }
}

/*
[1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
[15, 38, 26]
[40, 25, 99, 53, 2, 88, 76, 17]
[7, 3, 5, 2]

 */