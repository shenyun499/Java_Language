import java.awt.event.*;
import javax.swing.*;
/**
 * ���ã����ı������ݸı�ʱ���ı�������ʾ�ı�����ݣ����ı����»س���ʱʱ���ı�����������ݣ�
 * @author ����ѧ
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
		//��������
		panel = new JPanel();
		text = new JTextField("1104428690", 15);
		tb = new JTextArea("��ӭ�������", 4, 20);
		//���
		this.setContentPane(panel);
		panel.add(text);
		panel.add(tb);
		//���м���
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
		new Changes_Jtextfield_Jtextarea("���");
	}
}
