import java.awt.Point;

/**
 * This program Triangle create to test the class TriangleTest.java
 * 
 * @author Nhat Truong Le
 * @version 
 */

public class Triangle {
	private Point p1, p2, p3;
	private double angle1, angle2, angle3;
	private double side1, side2, side3;

	public PointOfTriangle(Point p1, Point p2, Point p3)
    {
      this.p1 = new Point(p1);
      this.p2 = new Point(p2);
      this.p3 = new Point(p3);
    }

	public void setPoint1(Point p1) {
		this.p1 = p1;
	}

	public void setPoint2(Point p2) {
		this.p2 = p2;
	}

	public void setPoint3(Point p3) {
		this.p3 = p3;
	}

	public Point getPoint1() {
		return new Point(p1);
	}

	public Point getPoint2() {
		return new Point(p2);
	}

	public Point getPoint3() {
		return new Point(p3);
	}

	public double getSide1_Length() {
		side1 = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
		return side1;
	}

	public double getSide2_Length() {
		side2 = Math.sqrt(Math.pow((p3.getX() - p2.getX()), 2) + Math.pow((p3.getY() - p2.getY()), 2));
		return side2;
	}

	public double getSide3_Length() {
		side3 = Math.sqrt(Math.pow((p1.getX() - p3.getX()), 2) + Math.pow((p1.getY() - p3.getY()), 2));
		return side3;
	}

	private void CalculateAngle() {
		double side1 = getSide1_Length();
		double side2 = getSide2_Length();
		double side3 = getSide3_Length();
		double largestSide = 0.0;
		double mediumSide = 0.0;
		double smallestSide = 0.0;
		if (side1 >= side2 && side2 >= side3) {
			largestSide = side1;
			mediumSide = side2;
			smallestSide = side3;
		} else if (side1 >= side3 && side3 >= side2) {
			largestSide = side1;
			mediumSide = side3;
			smallestSide = side2;
		} else if (side2 >= side1 && side1 >= side3) {
			largestSide = side2;
			mediumSide = side1;
			smallestSide = side3;
		} else if (side2 >= side3 && side3 >= side1) {
			largestSide = side2;
			mediumSide = side3;
			smallestSide = side1;
		} else if (side3 >= side1 && side1 >= side2) {
			largestSide = side3;
			mediumSide = side1;
			smallestSide = side2;
		} else {
			largestSide = side3;
			mediumSide = side2;
			smallestSide = side1;
		}
		angle1 = Math.toDegrees(Math.acos((Math.pow(smallestSide, 2) + Math.pow(mediumSide, 2) - Math.pow(largestSide, 2)) / (2 * smallestSide * mediumSide)));
		angle2 = Math.toDegrees(Math.asin((mediumSide * Math.sin(Math.toRadians(angle1))) / largestSide));
		angle3 = 180 - (angle1 + angle2);
	}

	// need other method Math.toRadians(), Math.toDegrees(), Math.sin(),
	// Math.asin(), Math.acos()
}