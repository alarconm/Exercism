class Matrix {

    private int[][] matrix;

//    TODO refactor and throw away old solution that isn't working

    Matrix(String matrixAsString) {
        this.matrix = matrixBuilder(matrixAsString);
    }

    private int[][] matrixBuilder(String matrixAsString) {

        String[] rowString = matrixAsString.split("\n");
        String[] columnLength = rowString[0].split(" ");
        int[][] matrixBuilder = new int[rowString.length][columnLength.length];

        for(int i = 0; i < rowString.length; i++) {

            String[] column = rowString[i].split(" ");
            for (int j = 0; j < columnLength.length; j++) {
                matrixBuilder[i][j] = Character.getNumericValue(column[j].charAt(0));
            }
        }
        return matrixBuilder;
    }

    int[] getRow(int rowNumber) {
        int[] row;
        row = matrix[rowNumber];
        return row;
    }

    int[] getColumn(int columnNumber) {
        int[] columns = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            columns[i] = matrix[i][columnNumber];
        }

        return columns;
    }

    int getRowsCount() {
        return matrix.length;
    }

    int getColumnsCount() {
        return matrix[0].length;
    }
}