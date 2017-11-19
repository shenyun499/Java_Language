import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
/**
 * 作用：当复选按钮选中时，普通按钮的背景色为青色，未选中时为灰色；
 * @author 黄智学
 *
 */
public class ChangeColor extends JFrame implements ActionListener {
	private JPanel panel;
	private JCheckBox box1;
	private JButton button;
	public ChangeColor(String name) {
		super(name);
		//设置框架属性
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		//添加面板，单选按钮，复选按钮
		panel = new JPanel();
		box1 = new JCheckBox("复选按钮");
		box1.addActionListener(this);
		button = new JButton("单选按钮");
		button.setBackground(Color.gray);
		//向面板中添加按钮
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
		new ChangeColor("单选按钮与普通按钮！");
	}
}
