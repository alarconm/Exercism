import java.util.ArrayList;

class Matrix {

    //create arraylist to hold everything
    //loop through string adding each character to a temp arraylist
    //if it hits a newline add the temp arraylist to the master list
    //clear the temp
    //print final master arraylist to check
    private ArrayList<String> rows = new ArrayList<>();
    private ArrayList<String> columns = new ArrayList<>();

    Matrix(String matrixAsString) {

        StringBuilder tempRow = new StringBuilder();
        StringBuilder tempColumn = new StringBuilder();

        for (int i = 0; i < matrixAsString.length(); i++) {

            tempRow.append(matrixAsString.charAt(i));

            if (matrixAsString.charAt(i) == '\n') {
                this.rows.add(tempRow.toString());
                tempRow = new StringBuilder();
            }
        }

        for (int i = 0; i < rows.size(); i++) {

            for (int k = 0; k < rows.get(i).length(); k++) {
                tempColumn.append(rows.get(k).charAt(i));
            }
            columns.add(tempColumn.toString());
            tempColumn = new StringBuilder();
        }

        System.out.println();
    }

    int[] fakeArray = {-1};

    int[] getRow(int rowNumber) {
        return fakeArray;
    }

    int[] getColumn(int columnNumber) {
        return fakeArray;
    }

    int getRowsCount() {
        return this.rows.size();
    }

    int getColumnsCount() {
        return this.columns.size();
    }
}
