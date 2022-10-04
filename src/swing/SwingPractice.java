package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingPractice extends JFrame {
	public SwingPractice() {
		JPanel pan1 = new JPanel();	//pan1�̶�� �г� ����
		JButton btn1 = new JButton("Click here!");	//btn1�̶�� ��ư ����
		
		add(pan1);	//pan1�̶�� �г� ����
		pan1.add(btn1);	//btn1�� �߰�
		
		btn1.addActionListener(new ActionListener() {	//btn1�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have been clicked!");	//ȭ�� ����� �޽������
			}
		});
		
		setVisible(true);	//â�� ���� ���̵��� ��
		setSize(640, 480);	//������� 640*480
		setResizable(false);	//������ ������ �Ұ���
		setLocationRelativeTo(null);	//â�� ����� �ߵ��� ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//â�� ���� ���α׷��� ����
	}
}
