public class Driver {
  public static void main(String[] args){
    Point PointA = new Point(3, 5);
    System.out.println("PointA: " + PointA.getX() + ", " + PointA.getY());
    Point PointB = new Point(5,8);
    System.out.println("PointB: " + PointB.getX() + ", " + PointB.getY());
    System.out.println(PointA.distance(PointB));
    Point PointC = new Point(13, 12);
    System.out.println("PointC: " + PointC.getX() + ", " + PointC.getY());
    Triangle TriangleA = new Triangle(PointA, PointB, PointC);
    System.out.println(TriangleA.Perimeter());
  }
}
