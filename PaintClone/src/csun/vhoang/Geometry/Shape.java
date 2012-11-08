package csun.vhoang.Geometry;

import java.awt.Point;

public abstract class Shape {
	protected Point mStartPoint;
	protected Point mEndPoint;
	
	public Shape(Point start, Point end) {
		mStartPoint = start;
		mEndPoint = end;
	}
}
