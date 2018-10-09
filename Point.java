public class Point {
  public double x,y;
  public Point(double newX, double newY)
  {
  x = newX;
  y = newY;
  }
  public double getX(){
  return this.x;
  }
  public double getY(){
  return this.y;
  }
  public double distance(Point other)
  {
    double xDist = Math.pow((other.x - this.x), 2);
    double yDist = Math.pow((other.y - this.y), 2);
  return Math.pow((xDist + yDist), 0.5);
  }
  public class Triangle{
    public Point P1,P2,P3;
    public Triangle(Point NP1, Point NP2, Point NP3)
    {
    P1 = NP1;
    P2 = NP2;
    P3 = NP3;
    }
    public double Perimeter()
    {
    return P1.distance(P2) + P1.distance(P3) + P2.distance(P3);
    }
  }
}
