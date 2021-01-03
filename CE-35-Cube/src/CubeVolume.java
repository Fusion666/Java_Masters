public class CubeVolume extends Basis{
    private double height;
    public CubeVolume (double side ,double height) {
        super(side);
        if(height< 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }
    public double getVolume () {
        return getArea()* height;
    }
}
