import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import csun.vhoang.Geometry.Circle;



public class ToolBoxArea extends JPanel {
	private JButton mLineButton;
	private JButton mCirleButton;
	private ShapeEnum mShapeChoice;
	
	public enum ShapeEnum {
		S_LINE,
		S_CIRCLE,
		S_RECTANGLE,
	};
	
	public ToolBoxArea() {
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(100, 100));
		buildToolBoxArea();
	}
	
	public ShapeEnum getShapeChoice() {
		return mShapeChoice;
	}
	
	public void buildToolBoxArea(){
		//add all the subpanel use gridbag
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		
		mLineButton = new JButton(" Line");
		mLineButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				mShapeChoice = ShapeEnum.S_LINE;
			}
		});
		
		mCirleButton = new JButton("Circle");
		//shapes panel
		JPanel shapePanel = new JPanel();
		shapePanel.setLayout(new GridLayout(1, 2));
		shapePanel.add(mLineButton);
		shapePanel.add(mCirleButton);
		add(shapePanel);
		
		
		JPanel colorPanel = new JPanel();
		colorPanel.setLayout(new GridLayout(3, 10));
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 10; ++j) {
				colorPanel.add(new Button("color"));
			}
		}
		add(colorPanel);
		
		
	}//end buildToolBoxArea
	
}
