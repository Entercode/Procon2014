package yoshinaga;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class mouse_Frame extends JFrame {
	
	int x,y;
	JLabel x_label,y_label;
	
	public mouse_Frame(String title,int x_size,int y_size){
		 setSize(x_size,y_size);
		 setTitle(title);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 Font font = new Font("MS �S�b�V�N",Font.PLAIN,20);
		 
		 x_label = new JLabel();
		 x_label.setFont(font);
		 x_label.setText("X���W:0");
		 
		 y_label = new JLabel();
		 y_label.setFont(font);
		 y_label.setText("Y���W:0");
		 
		 JPanel cp = new JPanel();
		 
		 cp.add(x_label);
		 cp.add(y_label);
		 
		 setContentPane(cp);
		 
		 cp.setLayout(null);
		 
		 x_label.setBounds(5,5,300,24);
		 y_label.setBounds(5,55,300,24);
		 
		 mouse_class mouse = new mouse_class();
		 addMouseMotionListener(mouse);
	}
	
public class mouse_class implements MouseListener,MouseMotionListener,MouseWheelListener{
	//�}�E�X���N���b�N���ꂽ�Ƃ�
	public void mouseClicked(MouseEvent event){
		x = event.getX();
		y = event.getY();
		
		x_label.setText("X���W:" + x);
		y_label.setText("Y���W:" + y);
	}
	
	//�}�E�X����ʓ��ɓ������Ƃ�
	public void mouseEntered(MouseEvent e){
		
	}
	
	//�}�E�X����ʊO�ɏo���Ƃ�
	public void mouseExited(MouseEvent e){
		
	}
	
	//�}�E�X�̃{�^���������ꂽ�Ƃ�
	public void mousePressed(MouseEvent event){
		
	}
	
	//�}�E�X�̃{�^���������ꂽ�Ƃ�
	public void mouseReleased(MouseEvent event){
		
	}
	
	//�}�E�X���h���b�O���ꂽ�Ƃ�
	public void mouseDragged(MouseEvent event){
		
	}
	
	//�}�E�X���������ꂽ�Ƃ�
	public void mouseMoved(MouseEvent event){
		
	}
	
	//�}�E�X�̃z�C�[������]�����Ƃ�
	public void mouseWheelMoved(MouseWheelEvent event){
		
	}
}

}