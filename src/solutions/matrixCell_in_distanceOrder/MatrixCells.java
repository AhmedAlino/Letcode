package solutions.matrixCell_in_distanceOrder;

import java.util.Arrays;

public class MatrixCells {
    public static int[][] allMatrixCellsDistOrder(int rows, int cels, int rCenter, int cCenter) {
        int[][] resultArray = new int[rows * cels][2];

        //fill in the resultArray array
        int rowAt = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cels; j++) {
                resultArray[rowAt][0] = i;
                resultArray[rowAt][1] = j;
                rowAt++;
            }
        }

        //sort the array
        Arrays.sort(resultArray, (a1, a2) -> {
                    System.out.println("a1: " + Arrays.toString(a1));
                    System.out.println("a2: " + Arrays.toString(a2));
            return Math.abs(a1[0] - rCenter) + Math.abs(a1[1] - cCenter) - (Math.abs(a2[0] - rCenter) + Math.abs(a2[1] - cCenter));
        });

        //Arrays.sort(resultArray,new ComparatorClass(resultArray, resultArray));
        return resultArray;
    }

    public static void readArray(int[][] array) {
        final byte COLUMN1 = 0;
        final byte COLUMN2 = 1;
        int rowAt = 0;
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[rowAt].length; j++) {
                System.out.printf("%s, %s",array[rowAt][COLUMN1], array[rowAt][COLUMN2]);
                System.out.println();
                rowAt++;
                if (array.length == rowAt) return; // This line is to avoid outing the scope of the arrays
            }
        }
    }

}

