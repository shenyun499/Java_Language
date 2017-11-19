import javax.swing.*;
/**
 * 作用：点击切换按钮，标签在“你好”和“再见”之间切换
 * @author 黄智学
 *
 */
import java.awt.*;
import java.awt.event.*;
class Test1 extends JFrame implements ActionListener
{
	private JLabel label;
	private JPanel panel;
	private JButton jbutton;
	public Test1(String a)
	{
		super(a);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);	/*居中对齐*/
		
		jbutton=new JButton("切换");
		jbutton.addActionListener(this);
		
		panel=new JPanel();
		this.setContentPane(panel);
		label=new JLabel("你好");
		panel.add(jbutton);
		panel.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jbutton)
		{
			if(label.getText().equals("你好"))
				label.setText("再见");
			else
				label.setText("你好");
		}
	}
}
public class SwitchLabel {
	public static void main(String[] args){
		new Test1("练习1");
	}

}
