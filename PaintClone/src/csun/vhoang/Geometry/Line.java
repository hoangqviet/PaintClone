package csun.vhoang.Geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Line extends Shape implements Drawable {
	public Line(Point start, Point end) {
		super(start, end);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(
			(int) mStartPoint.getX(), (int) mStartPoint.getY(),
			(int) mEndPoint.getX(), (int) mEndPoint.getY());
	}
}
