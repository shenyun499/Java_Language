import javax.swing.*;
import java.awt.event.*;
/**
 * ���ã���һ����ǩ��ʾ��˫����ѡ�����ݣ��ڶ�����ǩ��ʾ�б��б�ѡ�е�����
 * @author ����ѧ
 *
 */
public class T6 extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	//�˵���Ŀ
	private JMenuBar menuBar;
	//�˵���Ŀ
	private JMenu viewMenu,viewMenu2;
	//��ѡ��˵���Ŀ
	private JCheckBoxMenuItem fxk1, fxk2;
	private JMenuItem newItem, enterItem, exitItem;
	public T6(String name) {
		super(name);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		//�������󲢷���
		panel = new JPanel();
		this.setContentPane(panel);
		label1 = new JLabel("δ��ѡ��");
		label2 = new JLabel("δ��ѡ��");
		panel.add(label1);
		panel.add(label2);
		//�˵��ഴ������
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		viewMenu = new JMenu("�˵�");
		viewMenu2 = new JMenu("��");
		fxk1 = new JCheckBoxMenuItem("����");
		fxk2 = new JCheckBoxMenuItem("�˳�");
		newItem = new JMenuItem("�½�");
		enterItem = new JMenuItem("����");
		exitItem = new JMenuItem("�˳�");
		//�Ը�ѡ���2����ť���м���
		fxk1.addActionListener(this);
		fxk2.addActionListener(this);
		newItem.addActionListener(this);
		enterItem.addActionListener(this);
		exitItem.addActionListener(this);
		//��2���˵���Ŀ����2���˵���
		viewMenu2.add(newItem);
		viewMenu2.add(enterItem);
		viewMenu2.add(exitItem);
		//��1���˵���Ŀ����1���˵���
		viewMenu.add(viewMenu2);
		viewMenu.addSeparator();
		viewMenu.add(fxk1);
		viewMenu.add(fxk2);
		//��1���˵�����뵽�˵���Ŀ��
		menuBar.add(viewMenu);
		//���ÿɼ��Լ��˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
@Override
	public void actionPerformed(ActionEvent e) {
		//�Ը�ѡ����в���
		if(fxk1.isSelected()&&fxk2.isSelected()) {
			label1.setText(fxk1.getText()+fxk2.getText());
		}else if (fxk1.isSelected()) {
			label1.setText(fxk1.getText());
		} else if (fxk2.isSelected()) {
			label1.setText(fxk2.getText());
		} else {
			label1.setText("δ��ѡ��");
		}
			
		//��2����ť���в���
		if(e.getSource()==newItem) {
			label2.setText(viewMenu2.getText()+newItem.getText());
		} else if (e.getSource()==enterItem) {
			label2.setText(viewMenu2.getText()+enterItem.getText());
		} else if (e.getSource()==exitItem) {
			label2.setText(viewMenu2.getText()+exitItem.getText());
		}	
	}
	public static void main(String[] args) {
		new T6("�˵�");
	}
}
