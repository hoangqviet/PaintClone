import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class MainPanel extends JPanel {
	private DrawingArea drawAreaPanel;
	private ToolBoxArea toolboxAreaPanel;
	
	public MainPanel() {
		toolboxAreaPanel = new ToolBoxArea();
		drawAreaPanel = new DrawingArea(toolboxAreaPanel);
		
		setBackground(Color.green);
		buildGui();
	}
	
	private void buildGui() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(toolboxAreaPanel);
		add(drawAreaPanel);
	}
}//end MainPanel
