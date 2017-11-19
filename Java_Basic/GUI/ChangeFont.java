import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.util.*;
/**
 * ���ã����ֱ�ѡ�е�ѡ��ťΪ����ͨ��ʱ�������塱����б�塱ʱ����ͨ��ť������ֱ�Ϊ����ͨ���������塰����б�塰
 * @author ����ѧ
 *
 */
public class ChangeFont extends JFrame implements ActionListener {
	private JPanel panel;
	private JRadioButton t1;
	private JRadioButton t2;
	private JRadioButton t3;
	private JButton t4;
	private ButtonGroup group;
	public ChangeFont(String name) {
		super(name);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		
		//��������
		panel = new JPanel();
		this.setContentPane(panel);
		t1 = new JRadioButton("��ͨ");
		t2 = new JRadioButton("����");
		t3 = new JRadioButton("б��");
		t4 = new JButton("��������");
		group = new ButtonGroup();
		//�����������ӵ������ȥ
		group.add(t1);
		group.add(t2);
		group.add(t3);
		panel.add(t4);
		panel.add(t1);
		panel.add(t2);
		panel.add(t3);
		//���м������Ա�ȷ����ť��ѡ����
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(t1.isSelected()) {
			t4.setFont(new Font("1", Font.PLAIN, 12));
		}
		if(t2.isSelected()) {
			t4.setFont(new Font("", Font.BOLD, 12));
		}	
		if(t3.isSelected()) {
			t4.setFont(new Font("", Font.ITALIC, 12));
		}	
	}
	public static void main(String[] args) {
		new ChangeFont("h");
	}
}
