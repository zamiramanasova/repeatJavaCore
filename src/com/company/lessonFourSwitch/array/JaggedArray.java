package com.company.lessonFourSwitch.array;

public class JaggedArray {
    public static void main(String[] args) {

        int[][] jagged = new int[][]
                {
                        new int[] {1,2},
                        new int[] {1,2,3,4,5},
                        new int[] {1,2,3},
                };
        //во внешнем цикле выполныется проход по всем вложеннным массивам
        for (int i = 0; i < jagged.length; ++i) {
            // во внутреннем цикле выполняется обращение к каждому элементу вложенного массива
            for (int j = 0; j < jagged[i].length; ++j) {
                System.out.print(" " + jagged[i][j]);
            }
            System.out.print("\n");
        }
    }
}
