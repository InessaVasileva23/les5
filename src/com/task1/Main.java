package com.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //ДЗ 4_1 Сдвиг элементов массива
        toLeft();// вызываем метод
    }
    //метод toLeft сдвиг элементов двумерного массива
    public static void toLeft() {
        int[][] myArray = {{0, 1, 3, 4, 5, 6, 7, 8, 9, 10}, {0, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        System.out.println("количество строк двумерного массива: "+myArray.length);
        System.out.println("количество элементов в строке: "+myArray[0].length);
        System.out.println(Arrays.deepToString(myArray));

        for ( int i = 1; i <= myArray.length; i++){
            {for ( int y = 1; y < myArray[0].length; y++) {
                myArray[i-1][y-1]=myArray[i-1][y];
            }
                myArray[i-1][myArray[0].length-1]=0;
            }
        }
        System.out.println(Arrays.deepToString(myArray));
    }
}