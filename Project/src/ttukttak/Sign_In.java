package ttukttak;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sign_In extends JFrame implements ActionListener{
   
   private JButton loginBtn;
   private JButton signUpBtn;
private ImageIcon imageicon;

   public Sign_In(){
      setSize(510, 370);
      setLayout(new BorderLayout());
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false); //창 크기 조절 불가능하게 만들기
      setTitle("로그인");
      
      JPanel jp1 = new JPanel(); //상단 패널 추가
      add(jp1, BorderLayout.NORTH); //상단 패널 붙이기

      jp1.setLayout(new BorderLayout()); //패널1의 레이아웃을 보더 레이아웃으로 설정
      
      ImageIcon icon = new ImageIcon("images/logo_white.jpg");
      JLabel label = new JLabel(icon);
      jp1.add(label, BorderLayout.NORTH);
      
      JLabel login = new JLabel("로그인");
      Font font = new Font("맑은 고딕", Font.BOLD,20);
      login.setFont(font);
      login.setBorder(BorderFactory.createEmptyBorder(0, 214, 0, 0)); // 여백 조절
      jp1.add(login, BorderLayout.SOUTH);
      jp1.setBackground(Color.WHITE);
      
      
      JPanel jp2 = new JPanel(); //하단 패널 추가
      add(jp2, BorderLayout.CENTER);
      jp2.setLayout(null);
      jp2.setBackground(Color.WHITE);
      
      JLabel id = new JLabel("  아이디");
      id.setBounds(130, 25, 100, 10);
      jp2.add(id);
      JTextField idTextField = new JTextField(15);
      idTextField.setBounds(185, 20, 160, 25);
      jp2.add(idTextField);
      
      JLabel pw = new JLabel("비밀번호");
      pw.setBounds(123, 60, 100, 15);
      JTextField pwTextField = new JTextField(15);
      jp2.add(pw);
      pwTextField.setBounds(185, 55, 160, 25);
      jp2.add(pwTextField);

      JLabel sup = new JLabel("아직 회원이 아니신가요?");
      sup.setBounds(140, 110, 150, 20);
      jp2.add(sup);
      signUpBtn = new JButton("회원 가입하기");
      signUpBtn.setBounds(270, 110, 120, 20);
      signUpBtn.setForeground(Color.orange);
      signUpBtn.setBorderPainted(false);
      signUpBtn.setContentAreaFilled(false);
      signUpBtn.addActionListener(this);
      jp2.add(signUpBtn);
      
      loginBtn = new JButton("로그인");
      loginBtn.setBorderPainted(false);
      loginBtn.addActionListener(this);
      loginBtn.setContentAreaFilled(false);
      loginBtn.setForeground(Color.orange);
      loginBtn.setBounds(340, 55, 71, 25);
      jp2.add(loginBtn);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Sign_In();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if(obj == signUpBtn) {
         new Sign_Up();
      } else if(obj == loginBtn) {
         new Home();
      }
   }

}
