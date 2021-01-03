public class Carpet {
    private String color;
    private String materialOfCarpet;
    private int width;
    private int length;

    public Carpet(String color, String materialOfCarpet, int width, int length) {
        this.color = color;
        this.materialOfCarpet = materialOfCarpet;
        this.width = width;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public String getMaterialOfCarpet() {
        return materialOfCarpet;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
