import javax.swing.*;
/**
 * ���ã�����л���ť����ǩ�ڡ���á��͡��ټ���֮���л�
 * @author ����ѧ
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
		this.setLocationRelativeTo(null);	/*���ж���*/
		
		jbutton=new JButton("�л�");
		jbutton.addActionListener(this);
		
		panel=new JPanel();
		this.setContentPane(panel);
		label=new JLabel("���");
		panel.add(jbutton);
		panel.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jbutton)
		{
			if(label.getText().equals("���"))
				label.setText("�ټ�");
			else
				label.setText("���");
		}
	}
}
public class SwitchLabel {
	public static void main(String[] args){
		new Test1("��ϰ1");
	}

}
