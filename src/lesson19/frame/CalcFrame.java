package lesson19.frame;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalcFrame extends JFrame{

	public CalcFrame(String title) throws HeadlessException {
		super(title);
		JPanel panel = new JPanel();
		//setContentPane(panel);
		add(panel);
		add("North", panel);
		JPanel center = new JPanel();
		center.setBackground(Color.GREEN);
		add(center);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		setSize(400, 300);
		setVisible(true);
		
	}
	
	class MainPanel extends JPanel {
		private JPanel center;
		
		public MainPanel(final JPanel center) {
			super();
			this.center = center;
		
			setBackground(Color.CYAN);
			JButton btnGreen = new JButton("green");
			btnGreen.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					center.setBackground(Color.GREEN);
					
				}
				
			});
			add(btnGreen);
			JButton btnRed = new JButton("red");
			btnRed.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					center.setBackground(Color.RED);
					
				}
				
			});
			add(btnRed);
			JButton btnYellow = new JButton("yellow");
			
			btnYellow.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					center.setBackground(Color.YELLOW);
					
				}
				
			});
			add(btnYellow);
			
			
		}

	
				
	}

}
