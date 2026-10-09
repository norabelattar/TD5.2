package lsp.triangle;

class EquilateralTriangle implements Shape {
    private double side;
    
    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (side * 3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side) * (semiPerimeter - side) * (semiPerimeter - side));
    }

    @Override
    public double calculatePerimeter() {
        return side * 3;
    }
}