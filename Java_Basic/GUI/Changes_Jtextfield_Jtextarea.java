import java.awt.event.*;
import javax.swing.*;
/**
 * 作用：当文本框内容改变时，文本区域显示改变的内容；当文本框按下回车键时时，文本区域清空内容；
 * @author 黄智学
 *
 */
public class Changes_Jtextfield_Jtextarea extends JFrame implements KeyListener {
	private JPanel panel;
	private JTextField text;
	private JTextArea tb;
	public Changes_Jtextfield_Jtextarea(String name) {
		super(name);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		//创建对象
		panel = new JPanel();
		text = new JTextField("1104428690", 15);
		tb = new JTextArea("欢迎清除内容", 4, 20);
		//添加
		this.setContentPane(panel);
		panel.add(text);
		panel.add(tb);
		//进行监听
		text.addKeyListener(this);
		//
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyText(e.getKeyCode()).equals("Enter")) {
			tb.setText("");
		} else if (e.getKeyText(e.getKeyCode()) != null) {
			tb.setText(text.getText());
		}	
	}
	public static void main(String[] args)
	{
		new Changes_Jtextfield_Jtextarea("完成");
	}
}
