import java.util.ArrayList;
import java.util.HashMap;

class Matrix {

    private int[][] matrix;

//    TODO refactor and throw away old solution that isn't working

    Matrix(String matrixAsString) {
        this.matrix = matrixBuilder(matrixAsString);
    }

    private int[][] matrixBuilder(String matrixAsString) {

        String[] rowString = matrixAsString.split("\n");
         int[][] row = new int[rowString.length][rowString[0].length()];
        ArrayList<Integer> columnArray = new ArrayList<>();

        for(int i = 0; i < rowString.length; i++) {

            for(int j = 0; j < rowString.length; j++) {

                row[i]. = (Character.getNumericValue(rowString[i].charAt(j)))


            }



        }

    }

    int[] fakeArray = {-1};

    int[] getRow(int rowNumber) {
        return fakeArray;
    }

    int[] getColumn(int columnNumber) {
        return fakeArray;
    }

    int getRowsCount() {
        return rows.size();
    }

    int getColumnsCount() {
        return columns.size();
    }
}


//        StringBuilder tempRow = new StringBuilder();
//        StringBuilder tempColumn = new StringBuilder();
//
//        for (int i = 0; i < matrixAsString.length(); i++) {
//
//            tempRow.append(matrixAsString.charAt(i));
//
//            if (matrixAsString.charAt(i) == '\n') {
//                rows.add(tempRow.toString());
////                tempRow = new StringBuilder();
//            }
//        }
//
//        for (int i = 0; i < rows.size(); i++) {
//
//            for (int k = 0; k < rows.get(i).length(); k++) {
//                tempColumn.append(rows.get(k).charAt(i));
//            }
//            columns.add(tempColumn.toString());
////            tempColumn = new StringBuilder();
//        }