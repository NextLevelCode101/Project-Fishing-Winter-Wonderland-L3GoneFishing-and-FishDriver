import javax.swing.*;

public class FishDriver extends JPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("A good day for fishing!");
		frame.setSize(2000, 1045);
		frame.setLocation(-10, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new L3GoneFishing());
		frame.setVisible(true);
	}
}
