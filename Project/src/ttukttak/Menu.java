package ttukttak;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Menu extends JFrame{
	public Menu() {
		setTitle("메뉴");
		setSize(1800, 1100);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JMenuBar menuBar = new JMenuBar();
		
		Font font = new Font("���� ���", Font.BOLD, 30);
		
		JMenu menu1 = new JMenu("�ѽ�");
		menu1.setFont(font);
		JMenu menu2 = new JMenu("�Ͻ�");
		menu2.setFont(font);
		JMenu menu3 = new JMenu("���");
		menu3.setFont(font);
		JMenu menu4 = new JMenu("�߽�");
		menu4.setFont(font);
		JMenu menu5 = new JMenu("�ƽþ�");
		menu5.setFont(font);
		JMenu save = new JMenu("���ϱ�");
		save.setFont(font);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		menuBar.add(menu5);
		menuBar.add(save);
		panel.add(menuBar, BorderLayout.CENTER);
		add(panel);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Menu();
	}

}
