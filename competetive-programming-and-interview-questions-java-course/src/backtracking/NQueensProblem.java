package backtracking;

public class NQueensProblem {
    private int[][] chessTable;
    private int numOfQueens;

    public NQueensProblem(int numOfQueens) {
        this.numOfQueens = numOfQueens;
        this.chessTable = new int[numOfQueens][numOfQueens];
    }

    public void solve() {
        if (setQueens(0)) {
            printQueens();
        } else {
            System.out.println("There is no solution");
        }
    }

    private boolean setQueens(int colIndex) {
        // it means that we have already found the location for n queens (problem solved)
        if (colIndex == numOfQueens) return true;

        // consider all the possible locations in the given column one by one
        for (int rowIndex = 0; rowIndex < numOfQueens; rowIndex++) {
            // is the location valid for the queen?
            if (isPlaceValid(rowIndex, colIndex)) {
                chessTable[rowIndex][colIndex] = 1;
                // solve the problem for the next column (next queen)
                if (setQueens(colIndex + 1)) return true;

                // backtrack
                chessTable[rowIndex][colIndex] = 0;
            }
        }

        // can not find a valid location (tried all rows without anu success
        return false;
    }

    private boolean isPlaceValid(int rowIndex, int colIndex) {
        return false;
    }

    private void printQueens() {
        for (int i = 0; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable.length; j++) {
                if (chessTable[i][j] == 1) System.out.print(" * ");
                else System.out.print(" - ");
            }

            System.out.println();
        }
    }
}
