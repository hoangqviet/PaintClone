import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PaintClone extends JFrame {
	private DrawingArea drawingArea;
	
	public PaintClone() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setContentPane(new MainPanel());
		setVisible(true);
	}
	
	/*Button cutButton, copyButton, pasteButton;

	public PaintClone() {
		makeMainPanels();

		// ActionListener printListener = new ActionListener() {
		// public void actionPerformed(ActionEvent ae) {
		// System.out.println(ae.getActionCommand());
		// }
		// };
		//
		// Panel toolbar = new Panel();
		//
		// toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
		//
		// cutButton = new Button("Cut");
		// cutButton.addActionListener(printListener);
		// toolbar.add(cutButton);
		//
		// copyButton = new Button("Copy");
		// copyButton.addActionListener(printListener);
		// toolbar.add(copyButton);
		//
		// pasteButton = new Button("Paste");
		// pasteButton.addActionListener(printListener);
		// toolbar.add(pasteButton);
		//
		// // The "preferred" BorderLayout add call
		// add(toolbar, BorderLayout.NORTH);

		

	}// end PaintClone constructor

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		g.setColor(null);
		g.drawOval(0, 0, width, height);
	}
	
	public void makeMainPanels(){
		
		setSize(512, 512);
		JFrame mainFrame = new JFrame();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//make the 2 main panels, top one for menu, bottom for canvas
		Panel mainMenuPanel = new Panel() {
			//set layout
		};
		mainMenuPanel.setPreferredSize(new Dimension(512, 10));
		Panel mainCanvasPanel = new Panel() {
			//set layout
		};
		
//		GridBagLayout design
		
		
//		GridBagLayout gridbag = new GridBagLayout();
//        GridBagConstraints gridbagConstraint = new GridBagConstraints();
//
//        setLayout(gridbag);
//
//        gridbagConstraint.fill = GridBagConstraints.BOTH;
//        gridbagConstraint.weightx = 1.0;

        
//      end GridBagLayout design  
        
        
        
        
		JMenuBar mainMenuBar = new JMenuBar();

		// fileMenu
		JMenu fileMenu = new JMenu("File");
		JMenuItem fileMenuNew = new JMenuItem("New");
		fileMenu.add(fileMenuNew);
		JMenuItem fileMenuOpen = new JMenuItem("Open");
		fileMenu.add(fileMenuOpen);
		JMenuItem fileMenuSave = new JMenuItem("Save");
		fileMenu.add(fileMenuSave);
		JMenuItem fileMenuPrint = new JMenuItem("Print");
		fileMenu.add(fileMenuPrint);
		JMenuItem fileMenuExit = new JMenuItem("Exit");
		fileMenu.add(fileMenuExit);
		mainMenuBar.add(fileMenu);
		
		mainMenuPanel.add(mainMenuBar);
		// mainPanel.setVisible(true);

		// mainFrame.add(mainPanel);
		
		add(mainMenuPanel);

		ActionListener exitListener = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		};
		fileMenuExit.addActionListener(exitListener);

		ActionListener openListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Create a file chooser
				final JFileChooser fc = new JFileChooser();
				// In response to a button click:
				int returnVal = fc.showOpenDialog(getComponent(0));

			}
		};
		fileMenuOpen.addActionListener(openListener);

		ActionListener circleListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		};
	}//end makeMainPanels
*/
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				PaintClone paintClone = new PaintClone();
			}
		});
		
	}// end main
}// end PaintClone
