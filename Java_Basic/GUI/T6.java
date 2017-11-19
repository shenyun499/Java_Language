import javax.swing.*;
import java.awt.event.*;
/**
 * 作用：第一个标签显示被双击的选项内容，第二个标签显示列表中被选中的内容
 * @author 黄智学
 *
 */
public class T6 extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	//菜单栏目
	private JMenuBar menuBar;
	//菜单项目
	private JMenu viewMenu,viewMenu2;
	//复选框菜单项目
	private JCheckBoxMenuItem fxk1, fxk2;
	private JMenuItem newItem, enterItem, exitItem;
	public T6(String name) {
		super(name);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		//创建对象并放置
		panel = new JPanel();
		this.setContentPane(panel);
		label1 = new JLabel("未被选中");
		label2 = new JLabel("未被选中");
		panel.add(label1);
		panel.add(label2);
		//菜单类创建对象
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		viewMenu = new JMenu("菜单");
		viewMenu2 = new JMenu("打开");
		fxk1 = new JCheckBoxMenuItem("进入");
		fxk2 = new JCheckBoxMenuItem("退出");
		newItem = new JMenuItem("新建");
		enterItem = new JMenuItem("进入");
		exitItem = new JMenuItem("退出");
		//对复选框和2级按钮进行监听
		fxk1.addActionListener(this);
		fxk2.addActionListener(this);
		newItem.addActionListener(this);
		enterItem.addActionListener(this);
		exitItem.addActionListener(this);
		//将2级菜单项目加入2级菜单中
		viewMenu2.add(newItem);
		viewMenu2.add(enterItem);
		viewMenu2.add(exitItem);
		//将1级菜单项目加入1级菜单中
		viewMenu.add(viewMenu2);
		viewMenu.addSeparator();
		viewMenu.add(fxk1);
		viewMenu.add(fxk2);
		//将1级菜单类加入到菜单栏目中
		menuBar.add(viewMenu);
		//设置可见性及退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
@Override
	public void actionPerformed(ActionEvent e) {
		//对复选框进行操作
		if(fxk1.isSelected()&&fxk2.isSelected()) {
			label1.setText(fxk1.getText()+fxk2.getText());
		}else if (fxk1.isSelected()) {
			label1.setText(fxk1.getText());
		} else if (fxk2.isSelected()) {
			label1.setText(fxk2.getText());
		} else {
			label1.setText("未被选中");
		}
			
		//对2级按钮进行操作
		if(e.getSource()==newItem) {
			label2.setText(viewMenu2.getText()+newItem.getText());
		} else if (e.getSource()==enterItem) {
			label2.setText(viewMenu2.getText()+enterItem.getText());
		} else if (e.getSource()==exitItem) {
			label2.setText(viewMenu2.getText()+exitItem.getText());
		}	
	}
	public static void main(String[] args) {
		new T6("菜单");
	}
}
