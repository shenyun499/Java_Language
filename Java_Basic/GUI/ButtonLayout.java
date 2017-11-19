import javax.swing.*;
import java.awt.*;
/**
 * 作用：对按钮实现布局-东南西北
 * @author 黄智学
 *
 */
public class ButtonLayout extends JFrame {
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	public ButtonLayout(String name) {
		super(name);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		//创建布局器
		BorderLayout layout = new BorderLayout();
		//创建5个按钮
		button1 = new JButton("北按钮");
		button2 = new JButton("东按钮");
		button3 = new JButton("南按钮");
		button4 = new JButton("西按钮");
		button5 = new JButton("中按钮");
		//创建面板
		panel = new JPanel();
		//将布局放入面板中
		panel.setLayout(layout);
		//将面板放入框架中
		this.setContentPane(panel);
		//将按钮放入到面板中，并且设置方向
		panel.add(button1, BorderLayout.NORTH);
		panel.add(button2, BorderLayout.EAST);
		panel.add(button3, BorderLayout.SOUTH);
		panel.add(button4, BorderLayout.WEST);
		panel.add(button5, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonLayout("按钮的摆放");
	}
}

