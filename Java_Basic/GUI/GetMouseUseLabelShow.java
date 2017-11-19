import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
/**
 * ���ã������õ��������겢���ڱ�ǩ����ʾ����
 * @author ����ѧ
 *
 */
public class GetMouseUseLabelShow extends JFrame implements MouseListener{
	private JPanel panel;
	private JLabel label;
	public GetMouseUseLabelShow(String name)
	{
		super(name);
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		//��������
		panel=new JPanel();
		label=new JLabel("�������");
		label.setFont(new Font("",Font.BOLD,12));
		//�������
		this.setContentPane(panel);
		//���ñ�ǩ
		panel.add(label);
		//�������
		addMouseListener(this);
		//���ÿ�ܹر��Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// ������꣬�õ�������꣬��ʾ�ڱ�ǩ��
		
		label.setText("x���꣺"+e.getX()+" y����"+e.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("��겻�ڿ���ڣ��޷�������꣡�������Ƶ�����ڣ��������ȡ�������ꡣ");
		
	}
	public static void main(String[] args)
	{
		new GetMouseUseLabelShow("�����������ֵ");
	}
}
