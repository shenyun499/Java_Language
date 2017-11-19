import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
/**
 * 作用：实现对窗口的监听，改变颜色
 * @author 黄智学
 *
 */
public class ChangeWindowColor extends JFrame implements WindowListener {
		private JPanel panel;
		int r=0,g=0,b=0;
		Color c;
		public ChangeWindowColor(String name) {
			super(name);
			this.setSize(300, 200);
			this.setLocationRelativeTo(null);
			//创建面板
			panel = new JPanel();
			//将面板添加到框架中
			this.setContentPane(panel);
			//监听窗口
			addWindowListener(this);
			//设置关闭框架及可见性
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// 设置窗口反复打开的颜色
		r = (int)(Math.random()*101+60);
		g = (int)(Math.random()*256);
		b = (int)(Math.random()*256);
		c = new Color(r,g,b);
		panel.setBackground(c);
	}
	
	public static void main(String[] args) {
		new ChangeWindowColor("窗口颜色的改变");
	}
}
