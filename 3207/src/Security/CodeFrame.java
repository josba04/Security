package Security;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CodeFrame extends JFrame {
	JFrame frame;
	JButton button;
	JLabel label;
	JTextField text;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JTextField text2;
	JTextArea area;
	JTextArea area2;
	JTextArea area3;
	JTextArea area4;
	JTextArea area5;
	Font font;
	Font tfont;
	Font bfont;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button0;
	public CodeFrame(){// ó��
		frame = new JFrame();
		
		frame.setTitle("3207");
		frame.setSize(800, 700);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		font = new Font("�ü� ����", Font.BOLD, 25);
		tfont = new Font("����", Font.PLAIN,20);
		bfont = new Font("�ü� ����", Font.BOLD, 18);

		
		
//		button0 = new JButton("��ȣ��");
//		button0.setFont(bfont);
//		button0.setBounds(550, 500,	150, 60); //setBounds(������ġ, ������ġ, ���α���, ���α���);
//		frame.add(button0);
		
		label = new JLabel("��ȣŰ");
		label.setBounds(100, 100, 100, 50);
		label.setFont(font);
		
		
		text = new JTextField();
		text.setBounds(200, 100, 500, 50);
		text.setFont(tfont);
		
		
		label2 = new JLabel("��");
		label2.setBounds(100, 300, 100, 50);
		label2.setFont(font);
		
		
		text2 = new JTextField();
		text2.setBounds(200, 300, 500, 50);
		text2.setFont(tfont);
		
		button = new JButton("�Է¿Ϸ�");
		button.setFont(bfont);
		button.setBounds(100, 500, 150, 60); //setBounds(������ġ, ������ġ, ���α���, ���α���);
		frame.add(button);
	
		frame.add(label);
		frame.add(text);
		frame.add(label2);
		frame.add(text2);

		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	public void CodeFrame2() {
		frame = new JFrame();
		frame.setTitle("3207");
		frame.setSize(800, 700);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		label = new JLabel("��ȣŰ");
		label.setBounds(100, 100, 100, 50);
		label.setFont(font);
		
		area = new JTextArea();
		area.setBounds(200, 100, 500, 50);
		area.setFont(tfont);
		
		label2 = new JLabel("��");
		label2.setBounds(100, 300, 100, 50);
		label2.setFont(font);
		
		area2 = new JTextArea();
		area2.setBounds(200, 300, 500, 50);
		area2.setFont(tfont);
		
		button2 = new JButton("��ȣȭ	");
		button2.setFont(bfont);
		button2.setBounds(100, 500, 150, 60); //setBounds(������ġ, ������ġ, ���α���, ���α���);
		frame.add(button2);
		
		frame.add(area);
		frame.add(area2);
		frame.add(label);
		frame.add(label2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void CodeFrame3() {	// ��ȣ��
		frame = new JFrame();
		frame.setTitle("3207");
		frame.setSize(800, 700);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		area3 = new JTextArea();
		area3.setBounds(300, 200, 200, 200);
		area3.setFont(font);
		frame.add(area3);
		
		button3 = new JButton("��ȣȭ");
		button3.setFont(bfont);
		button3.setBounds(100, 500, 150, 60); //setBounds(������ġ, ������ġ, ���α���, ���α���);
		frame.add(button3);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void CodeFrame4() {	//��ȣ�� �����ֱ� & ��ȣȭ ��ư 
		frame = new JFrame();
		frame.setTitle("3207");
		frame.setSize(800, 700);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		label3 = new JLabel("��ȣ��");
		label3.setBounds(100, 100, 100, 50);
		label3.setFont(font);
		frame.add(label3);
		
		area4 = new JTextArea();
		area4.setBounds(200, 100, 500, 50);
		area4.setFont(tfont);
		frame.add(area4);
		
		
		button4 = new JButton("��ȣ��");
		button4.setFont(bfont);
		button4.setBounds(100, 500, 150, 60); //setBounds(������ġ, ������ġ, ���α���, ���α���);
		frame.add(button4);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void CodeFrame5() {
		frame = new JFrame();
		frame.setTitle("3207");
		frame.setSize(800, 700);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		label4 = new JLabel("��ȣ��");
		label4.setBounds(100, 100, 150, 60);
		label4.setFont(font);
		frame.add(label4);
		
		area5 = new JTextArea();
		area5.setBounds(200, 100, 500, 50);
		area5.setFont(tfont);
		frame.add(area5);
		
		
		button5 = new JButton("����");
		button5.setFont(bfont);
		button5.setBounds(100, 500, 150, 60); //setBounds(������ġ, ������ġ, ���α���, ���α���);
		frame.add(button5);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JTextField getTextField() {
		return text;
	}
	public JTextField getTextField2() {
		return text2;
	}
	public JButton getButton() {
		return button;
	}
	public JTextArea getArea(){
		return area;
	}
	public JTextArea getArea4(){
		return area;
	}
	public JTextArea getArea2(){
		return area2;
	}
}
