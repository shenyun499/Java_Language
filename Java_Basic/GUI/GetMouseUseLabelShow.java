import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
/**
 * 作用：单击得到鼠标的坐标并且在标签中显示出来
 * @author 黄智学
 *
 */
public class GetMouseUseLabelShow extends JFrame implements MouseListener {
	private JPanel panel;
	private JLabel label;
	public GetMouseUseLabelShow(String name) {
		super(name);
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		//创建对象
		panel = new JPanel();
		label = new JLabel("请点击鼠标");
		label.setFont(new Font("", Font.BOLD, 12));
		//放置面板
		this.setContentPane(panel);
		//放置标签
		panel.add(label);
		//监听鼠标
		addMouseListener(this);
		//设置框架关闭性及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 单击鼠标，得到鼠标坐标，显示在标签上
		label.setText("x坐标："+e.getX()+" y坐标"+e.getY());
		
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
		label.setText("鼠标不在框架内，无法获得坐标！请把鼠标移到框架内，并点击获取鼠标的坐标。");
		
	}
	public static void main(String[] args) {
		new GetMouseUseLabelShow("单击获得坐标值");
	}
}
