import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
/**
 * ���ã�ʵ�ֶԴ��ڵļ������ı���ɫ
 * @author ����ѧ
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
			//�������
			panel = new JPanel();
			//�������ӵ������
			this.setContentPane(panel);
			//��������
			addWindowListener(this);
			//���ùرտ�ܼ��ɼ���
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
		// ���ô��ڷ����򿪵���ɫ
		r = (int)(Math.random()*101+60);
		g = (int)(Math.random()*256);
		b = (int)(Math.random()*256);
		c = new Color(r,g,b);
		panel.setBackground(c);
	}
	
	public static void main(String[] args) {
		new ChangeWindowColor("������ɫ�ĸı�");
	}
}
