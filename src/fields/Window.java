package fields;

import javax.swing.JFrame;

public class Window {
	public static JFrame frame = new JFrame("Fields");
	
	public static void createWindow() {
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
}
