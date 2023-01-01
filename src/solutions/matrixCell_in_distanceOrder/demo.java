package solutions.matrixCell_in_distanceOrder;

public class demo {
    public static void main(String[] args) {
        int row = 2, cols = 3;
        int rCenter = 1, cCenter = 2;

        var res = MatrixCells.allMatrixCellsDistOrder(row, cols, rCenter, cCenter);
        MatrixCells.readArray(res);
    }
}
