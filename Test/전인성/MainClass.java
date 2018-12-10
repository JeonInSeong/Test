package 전인성;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class MainClass extends JFrame implements ActionListener {
	ProgTest1 pt1 = new ProgTest1();
	ProgTest2 pt2 = new ProgTest2();

	JPanel jp1, jp2, jp3;
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	JTextField jf1, jf2, jf3;
	JRadioButton jr1, jr2;
	JTextArea ja1;

	public MainClass() {
		super("프로그밍언어활용평가");
		setLayout(new BorderLayout());

		jf1 = new JTextField(20);
		jf2 = new JTextField(20);
		jf3 = new JTextField(20);
		jr1 = new JRadioButton("남");
		jr2 = new JRadioButton("여");

		// 회원등록, 삭제, 조회
		Box cvbox1 = Box.createHorizontalBox();
		cvbox1.add(new JLabel("회원ID:"));
		cvbox1.add(jf1);
		cvbox1.add(new JLabel("회원이름:"));
		cvbox1.add(jf2);
		cvbox1.add(new JLabel("전화번호:"));
		cvbox1.add(jf3);
		cvbox1.add(new JLabel("성별:"));
		cvbox1.add(jr1);
		cvbox1.add(jr2);

		jbtn1 = new JButton("회원등록");
		jbtn2 = new JButton("회원삭제");
		jbtn3 = new JButton("전체회원조회");

		Box cvbox2 = Box.createHorizontalBox();
		cvbox2.add(Box.createHorizontalStrut(10));
		cvbox2.add(jbtn1);
		cvbox2.add(Box.createHorizontalStrut(10));
		cvbox2.add(jbtn2);
		cvbox2.add(Box.createHorizontalStrut(10));
		cvbox2.add(jbtn3);

		Box hBox = Box.createVerticalBox();
		hBox.add(Box.createHorizontalStrut(20));
		hBox.add(cvbox1);
		hBox.add(Box.createHorizontalStrut(20));
		hBox.add(cvbox2);
		hBox.add(Box.createGlue());
		jp1 = new JPanel(new BorderLayout());
		jp1.setBorder(new TitledBorder(new EtchedBorder(), "회원등록, 삭제, 조회"));
		jp1.add(hBox, BorderLayout.CENTER);

		// 구구단
		jbtn4 = new JButton("구구단보기");

		Box h2Box = Box.createHorizontalBox();
		h2Box.add(Box.createHorizontalStrut(340));
		h2Box.add(jbtn4);
		h2Box.add(Box.createGlue());
		jp2 = new JPanel(new BorderLayout());
		jp2.setBorder(new TitledBorder(new EtchedBorder(), "구구단"));
		jp2.add(h2Box, BorderLayout.CENTER);

		// 결과
		Box h3Box = Box.createHorizontalBox();
		h3Box.add(Box.createHorizontalStrut(20));
		h3Box.add(new JTextArea(30, 60));
		jp3 = new JPanel(new BorderLayout());
		jp3.setBorder(new TitledBorder(new EtchedBorder(), "결과"));
		jp3.add(h3Box, BorderLayout.CENTER);

		Box cBox = Box.createVerticalBox();
		cBox.add(jp1);
		cBox.add(jp2);
		cBox.add(jp3);
		add(cBox, BorderLayout.CENTER);

		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jbtn3.addActionListener(this);
		jbtn4.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbtn1) {
			int con = JOptionPane.showConfirmDialog(this, "회원을 등록하시겠습니까?");
			if (con == JOptionPane.YES_NO_OPTION)
				;
			{
				// System.exit(0);
			}
		}
		if (e.getSource() == jbtn2) {
			String[] option2 = { "예", "아니오" };
			JOptionPane.showOptionDialog(this, "회원을 삭제하시겠습니까?", "회원삭제", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);

		}
		if (e.getSource() == jbtn4) {
			String dan = JOptionPane.showInputDialog(this, "몇단을 보시겠습니까?");
			System.out.println(dan);
		}
	}

	public static void main(String[] args) {

		MainClass abc = new MainClass();
		abc.setSize(800, 400);
		abc.setVisible(true);
		abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
