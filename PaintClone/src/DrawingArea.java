import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import csun.vhoang.Geometry.Drawable;
import csun.vhoang.Geometry.Line;
import csun.vhoang.Geometry.Shape;

public class DrawingArea extends JPanel {
	private ArrayList<Drawable> shapes;
	private Shape currentShape;
	private Point mStartPoint;
	private Point mEndPoint;
	private ToolBoxArea mToolBox;

	/**
	 * Constructor
	 * @param toolBox
	 */
	public DrawingArea(ToolBoxArea toolBox) {
		setBackground(Color.blue);
		setPreferredSize(new Dimension(400, 400));
		
		mToolBox = toolBox;
		shapes = new ArrayList<Drawable>();
		mStartPoint = new Point();
		mEndPoint = new Point();
		
		registerMouseListener();
	}

	/**
	 * Hook up mouse event
	 */
	private void registerMouseListener() {
		MouseListener listener = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				mEndPoint = e.getPoint();
				ToolBoxArea.ShapeEnum userChoice = mToolBox.getShapeChoice();
				if (userChoice == ToolBoxArea.ShapeEnum.S_LINE) {
					shapes.add(new Line(mStartPoint, mEndPoint));
				}
				repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				mStartPoint = e.getPoint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		};

		addMouseListener(listener);
	}

	void addShape(Drawable s) {
		shapes.add(s);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Drawable shape : shapes) {
			shape.draw(g);
		}
	}

}
