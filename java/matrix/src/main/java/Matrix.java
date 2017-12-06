import java.util.ArrayList;
import java.util.HashMap;

class Matrix {

    //create arraylist to hold everything
    //loop through string adding each character to a temp arraylist
    //if it hits a newline add the temp arraylist to the master list
    //clear the temp
    //print final master arraylist to check
    ArrayList<String> rows = new ArrayList<>();
    ArrayList<String> columns = new ArrayList<>();
    HashMap<Integer, int[]> rowsMap = new HashMap<>();

//    TODO switch to hashmaps for each row/column? Or integer arrays created with each index using a counter

    Matrix(String matrixAsString) {



//        int counter = 0;
//        for (int i = 0; i < matrixAsString.length(); i++) {
//
//            rowsMap.put(counter, )
//        }


//        ***Attempt with arraylists and stringbuilders***
        StringBuilder tempRow = new StringBuilder();
        StringBuilder tempColumn = new StringBuilder();

        for (int i = 0; i < matrixAsString.length(); i++) {

            tempRow.append(matrixAsString.charAt(i));

            if (matrixAsString.charAt(i) == '\n') {
                rows.add(tempRow.toString());
//                tempRow = new StringBuilder();
            }
        }

        for (int i = 0; i < rows.size(); i++) {

            for (int k = 0; k < rows.get(i).length(); k++) {
                tempColumn.append(rows.get(k).charAt(i));
            }
            columns.add(tempColumn.toString());
//            tempColumn = new StringBuilder();
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
