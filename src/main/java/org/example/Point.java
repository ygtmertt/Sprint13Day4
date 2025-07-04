package org.example;

public class Point {
  // Değişkenler private, sadece sınıf içinden erişilebilir
  private int x;
  private int y;

  // Constructor
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Getter ve Setter'lar
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  // distance() - (0,0) noktasına uzaklık
  public double distance() {
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }

  // distance(Point p) - başka bir Point'e uzaklık
  public double distance(Point p) {
    return Math.sqrt(
        (p.x - this.x) * (p.x - this.x) +
            (p.y - this.y) * (p.y - this.y)
    );
  }

  // distance(int a, int b) - verilen koordinata uzaklık
  public double distance(int a, int b) {
    return Math.sqrt(
        (a - this.x) * (a - this.x) +
            (b - this.y) * (b - this.y)
    );
  }
}
