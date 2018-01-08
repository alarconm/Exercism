import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {

    Set<MatrixCoordinate> saddlePoints = new HashSet<>();

    Matrix(List<List<Integer>> values) {

        boolean check = true;

        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values.size(); j++) {
                for (int k = 0; k < values.size(); k++) {
                    if (values.get(i).get(j) < values.get(i).get(k) || values.get(i).get(j) > values.get(k).get(j)) {
                        check = false;
                    }
                }
                if (check) {
                    saddlePoints.add(new MatrixCoordinate(i, j));
                }
                check = true;
            }
        }
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return this.saddlePoints;
    }
}
