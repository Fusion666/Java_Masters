public class Main {
    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        Point third = new Point(5,6);
        Point point = new Point();
        System.out.println(first.distance());
        System.out.println(first.distance(2,2));
        System.out.println(point.distance());
        System.out.println(first.distance(second));
        System.out.println(third.distance(first));
    }
}
