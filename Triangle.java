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
