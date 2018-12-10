package ���μ�;

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
		super("���α׹־��Ȱ����");
		setLayout(new BorderLayout());

		jf1 = new JTextField(20);
		jf2 = new JTextField(20);
		jf3 = new JTextField(20);
		jr1 = new JRadioButton("��");
		jr2 = new JRadioButton("��");

		// ȸ�����, ����, ��ȸ
		Box cvbox1 = Box.createHorizontalBox();
		cvbox1.add(new JLabel("ȸ��ID:"));
		cvbox1.add(jf1);
		cvbox1.add(new JLabel("ȸ���̸�:"));
		cvbox1.add(jf2);
		cvbox1.add(new JLabel("��ȭ��ȣ:"));
		cvbox1.add(jf3);
		cvbox1.add(new JLabel("����:"));
		cvbox1.add(jr1);
		cvbox1.add(jr2);

		jbtn1 = new JButton("ȸ�����");
		jbtn2 = new JButton("ȸ������");
		jbtn3 = new JButton("��üȸ����ȸ");

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
		jp1.setBorder(new TitledBorder(new EtchedBorder(), "ȸ�����, ����, ��ȸ"));
		jp1.add(hBox, BorderLayout.CENTER);

		// ������
		jbtn4 = new JButton("�����ܺ���");

		Box h2Box = Box.createHorizontalBox();
		h2Box.add(Box.createHorizontalStrut(340));
		h2Box.add(jbtn4);
		h2Box.add(Box.createGlue());
		jp2 = new JPanel(new BorderLayout());
		jp2.setBorder(new TitledBorder(new EtchedBorder(), "������"));
		jp2.add(h2Box, BorderLayout.CENTER);

		// ���
		Box h3Box = Box.createHorizontalBox();
		h3Box.add(Box.createHorizontalStrut(20));
		h3Box.add(new JTextArea(30, 60));
		jp3 = new JPanel(new BorderLayout());
		jp3.setBorder(new TitledBorder(new EtchedBorder(), "���"));
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
			int con = JOptionPane.showConfirmDialog(this, "ȸ���� ����Ͻðڽ��ϱ�?");
			if (con == JOptionPane.YES_NO_OPTION)
				;
			{
				// System.exit(0);
			}
		}
		if (e.getSource() == jbtn2) {
			String[] option2 = { "��", "�ƴϿ�" };
			JOptionPane.showOptionDialog(this, "ȸ���� �����Ͻðڽ��ϱ�?", "ȸ������", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);

		}
		if (e.getSource() == jbtn4) {
			String dan = JOptionPane.showInputDialog(this, "����� ���ðڽ��ϱ�?");
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
