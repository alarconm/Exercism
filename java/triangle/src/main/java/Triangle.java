class Triangle {

    private double[] triangle;
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {

        if (side1 == 0 || side2 == 0 || side3 == 0) {
            throw new TriangleException();
        }

        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new TriangleException();
        }

        double[] triangleInit = {side1, side2, side3};
        this.triangle = triangleInit;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        if (this.side1 == this.side2 && this.side1 == side3 && this.side2 == this.side3) {
            return true;
        }
        return false;
    }

    boolean isIsosceles() {
        if (this.side1 == side2 || this.side1 == side3 || this.side2 == side3) {
            return true;
        }
        return false;
    }

    boolean isScalene() {
        if (this.side1 != this.side2 && this.side1 != this.side3 && this.side2 != side3) {
            return true;
        }
        return false;
    }

    public double[] getTriangle() {
        return triangle;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
