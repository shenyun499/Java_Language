import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.util.*;
/**
 * 作用：当分别选中单选按钮为“普通”时、“黑体”、“斜体”时，普通按钮的字体分别为“普通”、”黑体“、”斜体“
 * @author 黄智学
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
		
		//创建对象
		panel = new JPanel();
		this.setContentPane(panel);
		t1 = new JRadioButton("普通");
		t2 = new JRadioButton("黑体");
		t3 = new JRadioButton("斜体");
		t4 = new JButton("各种字体");
		group = new ButtonGroup();
		//将各类对象添加到面板中去
		group.add(t1);
		group.add(t2);
		group.add(t3);
		panel.add(t4);
		panel.add(t1);
		panel.add(t2);
		panel.add(t3);
		//进行监听，以便确定按钮被选中了
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
