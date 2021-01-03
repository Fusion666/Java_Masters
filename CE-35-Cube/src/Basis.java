public class Basis {
    private double side;
    public Basis(double side) {
        if(side < 0) {
            this.side = 0;
        }
        else {
            this.side = side;
        }
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side*side;
    }
}
