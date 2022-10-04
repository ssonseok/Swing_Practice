package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingPractice extends JFrame {
	public SwingPractice() {
		JPanel pan1 = new JPanel();	
		JButton btn1 = new JButton("클릭");
		add(pan1);
		pan1.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "클릭완료");
			}
		});
		
		setVisible(true);
		setSize(640, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
