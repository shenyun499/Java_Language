import javax.swing.*;
import java.awt.*;
/**
 * ���ã��԰�ťʵ�ֲ���-��������
 * @author ����ѧ
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
		//����������
		BorderLayout layout = new BorderLayout();
		//����5����ť
		button1 = new JButton("����ť");
		button2 = new JButton("����ť");
		button3 = new JButton("�ϰ�ť");
		button4 = new JButton("����ť");
		button5 = new JButton("�а�ť");
		//�������
		panel = new JPanel();
		//�����ַ��������
		panel.setLayout(layout);
		//������������
		this.setContentPane(panel);
		//����ť���뵽����У��������÷���
		panel.add(button1, BorderLayout.NORTH);
		panel.add(button2, BorderLayout.EAST);
		panel.add(button3, BorderLayout.SOUTH);
		panel.add(button4, BorderLayout.WEST);
		panel.add(button5, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonLayout("��ť�İڷ�");
	}
}

