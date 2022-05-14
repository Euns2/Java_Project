package ttukttak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sign_Up extends JFrame implements ActionListener{
	private JButton Signupbtn;
	private JButton btn;

	public Sign_Up() {
		setSize(510, 600);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); //창 크기 조절 불가능하게 만들기
		setTitle("회원가입");
		
		JPanel jp1 = new JPanel(); //상단 패널 추가
	    add(jp1, BorderLayout.NORTH);
	    jp1.setBackground(Color.WHITE);
	
		ImageIcon icon = new ImageIcon("images/logo_white.jpg");
		JLabel label1 = new JLabel(icon);
		jp1.add(label1, BorderLayout.NORTH);
		
		JPanel jp2 = new JPanel(); //하단 패널 추가
	    add(jp2, BorderLayout.CENTER);
	    jp2.setBackground(Color.WHITE);
	    jp2.setLayout(null);
	      
		JLabel name = new JLabel("이름");
		Font font1 = new Font("맑은 고딕", Font.BOLD,15);
		name.setFont(font1);
		name.setBounds(140, 50, 100, 15);
		jp2.add(name);
		JTextField nameTextField = new JTextField(20);
		nameTextField.setBounds(185, 45, 200, 25);
		jp2.add(nameTextField);
		
		JLabel id = new JLabel("아이디");
		Font font2 = new Font("맑은 고딕", Font.BOLD,15);
		id.setFont(font2);
		id.setBounds(125, 90, 100, 15);
		jp2.add(id);
		JTextField idTextField = new JTextField(20);
		idTextField.setBounds(185, 85, 200, 25);
		jp2.add(idTextField);
		
		JLabel pw = new JLabel("비밀번호");
		Font font3 = new Font("맑은 고딕", Font.BOLD,15);
		pw.setFont(font3);
		pw.setBounds(110, 130, 100, 15);
		jp2.add(pw);
		JTextField pwTextField = new JTextField(20);
		pwTextField.setBounds(185, 125, 200, 25);
		jp2.add(pwTextField);
		
		JLabel pwww = new JLabel("비밀번호 확인");
		Font font4 = new Font("맑은 고딕", Font.BOLD,15);
		pwww.setFont(font4);
		pwww.setBounds(75, 170, 100, 15);
		jp2.add(pwww);
		JTextField pwwwTextField = new JTextField(20);
		pwwwTextField.setBounds(185, 165, 200, 25);
		jp2.add(pwwwTextField);
		
		Signupbtn = new JButton("회원가입");
		Font font5 = new Font("맑은 고딕", Font.BOLD,15);
		Signupbtn.setFont(font5);
		Signupbtn.setBounds(200, 240, 100, 15);
		Signupbtn.setForeground(Color.orange);
		Signupbtn.setBorderPainted(false);
		Signupbtn.setContentAreaFilled(false);
		Signupbtn.addActionListener(this);
		jp2.add(Signupbtn);
		
		JLabel label = new JLabel("이미 회원이신가요?");
		Font font6 = new Font("맑은 고딕", Font.BOLD,15);
		label.setFont(font6);
		label.setBounds(130, 300, 150, 20);
		jp2.add(label);
		btn = new JButton("로그인 하기");
		Font font7 = new Font("맑은 고딕", Font.BOLD,15);
		btn.setFont(font7);
		btn.setBounds(270, 300, 120, 20);
	    btn.setForeground(Color.orange);
	    btn.setBorderPainted(false);
	    btn.setContentAreaFilled(false);
	    btn.addActionListener(this);
	    jp2.add(btn);
	    setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == Signupbtn || obj == btn) {
			new Sign_In();
		}
	}

}
