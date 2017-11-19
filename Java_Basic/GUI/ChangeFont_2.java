import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
/**
 * 作用：当下拉列表选择10，按钮字体号为10，14~14、18~18
 * @author 黄智学
 *
 */
public class ChangeFont_2 extends JFrame implements ActionListener {
	private JPanel panel;
	private JComboBox box;
	private JButton button;
	public ChangeFont_2(String name) {
		super(name);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		//创建按钮和数组
		button = new JButton("字号改变");
		String[] str=new String[3];
		str[0]="10";
		str[1]="14";
		str[2]="18";
		box = new JComboBox(str);
		box.addActionListener(this);
		panel = new JPanel();
		this.setContentPane(panel);
		panel.add(button);
		panel.add(box);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
@Override
	public void actionPerformed(ActionEvent e) {
	//改变字体为10号
		if(box.getSelectedIndex() == 0) {
			button.setFont(new Font("",Font.PLAIN,10));
		}
	//改变字体为14号		
		if(box.getSelectedIndex() == 1) {
			button.setFont(new Font("", Font.BOLD, 14));
		}
	//改变字体为18号	
		if(box.getSelectedIndex() == 2) {
			button.setFont(new Font("", Font.PLAIN, 18));
		}	
	}
	public static void main(String[] args) {
		new ChangeFont_2("下拉列表与字体设置1");
	}
}
