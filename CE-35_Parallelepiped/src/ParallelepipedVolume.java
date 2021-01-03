public class ParallelepipedVolume extends Basis{
    private double height;
    public ParallelepipedVolume(double length, double width, double height) {
        super(length, width);
        if(height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }
    public double getVolumeParallelepiped() {
        return getArea() * height;
    }
}
