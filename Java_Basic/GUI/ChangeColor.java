import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
/**
 * ���ã�����ѡ��ťѡ��ʱ����ͨ��ť�ı���ɫΪ��ɫ��δѡ��ʱΪ��ɫ��
 * @author ����ѧ
 *
 */
public class ChangeColor extends JFrame implements ActionListener {
	private JPanel panel;
	private JCheckBox box1;
	private JButton button;
	public ChangeColor(String name) {
		super(name);
		//���ÿ������
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		//�����壬��ѡ��ť����ѡ��ť
		panel = new JPanel();
		box1 = new JCheckBox("��ѡ��ť");
		box1.addActionListener(this);
		button = new JButton("��ѡ��ť");
		button.setBackground(Color.gray);
		//���������Ӱ�ť
		this.setContentPane(panel);
		panel.add(box1);
		panel.add(button);
		//
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == box1&&button.getBackground() == Color.gray) {
			button.setBackground(Color.GREEN);
		} else {
			button.setBackground(Color.gray);
		}	
	}
	public static void main(String[] args) {
		new ChangeColor("��ѡ��ť����ͨ��ť��");
	}
}
