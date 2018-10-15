package findmine;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class findmine extends JFrame implements ActionListener {
	JLayeredPane jp;
	findmine fd;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
			b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28,
			b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41,
			b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54,
			b55, b56, b57, b58, b59, b60, b61, b62, b63, b64, b65, b66, b67,
			b68, b69, b70, b71, b72, b73, b74, b75, b76, b77, b78, b79, b80,
			b81, b82, b83, b84, b85, b86, b87, b88, b89, b90, b91, b92, b93,
			b94, b95, b96, b97, b98, b99, b100;
	test_Frame2 tf2;
	Image img, img1, img2;
	ImageIcon icon;
	int x = 10, y = 10;
	JPanel p1;
	boolean poto = true;

	public findmine() {
		setLayout(null);
		img = Toolkit.getDefaultToolkit().getImage("윈도우.jpg");
		img1 = Toolkit.getDefaultToolkit().getImage("바탕화면.jpg");
		img2 = Toolkit.getDefaultToolkit().getImage("잠금화면.jpg");
		icon = new ImageIcon("지뢰.jpg");

		jp = new JLayeredPane();
		// 이미지 객체와 paintComponet를 이용하여 배경에 적용하기

		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");
		b10 = new JButton("");
		b11 = new JButton("");
		b12 = new JButton("");
		b13 = new JButton("");
		b14 = new JButton("");
		b15 = new JButton("");
		b16 = new JButton("");
		b17 = new JButton("");
		b18 = new JButton("");
		b19 = new JButton("");
		b20 = new JButton("");
		b21 = new JButton("");
		b22 = new JButton("");
		b23 = new JButton("");
		b24 = new JButton("");
		b25 = new JButton("");
		b26 = new JButton("");
		b27 = new JButton("");
		b28 = new JButton("");
		b29 = new JButton("");
		b30 = new JButton("");
		b31 = new JButton("");
		b32 = new JButton("");
		b33 = new JButton("");
		b34 = new JButton("");
		b35 = new JButton("");
		b36 = new JButton("");
		b37 = new JButton("");
		b38 = new JButton("");
		b39 = new JButton("");
		b40 = new JButton("");
		b41 = new JButton("");
		b42 = new JButton("");
		b43 = new JButton("");
		b44 = new JButton("");
		b45 = new JButton("");
		b46 = new JButton("");
		b47 = new JButton("");
		b48 = new JButton("");
		b49 = new JButton("");
		b50 = new JButton("");
		b51 = new JButton("");
		b52 = new JButton("");
		b53 = new JButton("");
		b54 = new JButton("");
		b55 = new JButton("");
		b56 = new JButton("");
		b57 = new JButton("");
		b58 = new JButton("");
		b59 = new JButton("");
		b60 = new JButton("");
		b61 = new JButton("");
		b62 = new JButton("");
		b63 = new JButton("");
		b64 = new JButton("");
		b65 = new JButton("");
		b66 = new JButton("");
		b67 = new JButton("");
		b68 = new JButton("");
		b69 = new JButton("");
		b70 = new JButton("");
		b71 = new JButton("");
		b72 = new JButton("");
		b73 = new JButton("");
		b74 = new JButton("");
		b75 = new JButton("");
		b76 = new JButton("");
		b77 = new JButton("");
		b78 = new JButton("");
		b79 = new JButton("");
		b80 = new JButton("");
		b81 = new JButton("");
		b82 = new JButton("");
		b83 = new JButton("");
		b84 = new JButton("");
		b85 = new JButton("");
		b86 = new JButton("");
		b87 = new JButton("");
		b88 = new JButton("");
		b89 = new JButton("");
		b90 = new JButton("");
		b91 = new JButton("");
		b92 = new JButton("");
		b93 = new JButton("");
		b94 = new JButton("");
		b95 = new JButton("");
		b96 = new JButton("");
		b97 = new JButton("");
		b98 = new JButton("");
		b99 = new JButton("");
		b100 = new JButton("");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		b29.addActionListener(this);
		b30.addActionListener(this);
		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);
		b34.addActionListener(this);
		b35.addActionListener(this);
		b36.addActionListener(this);
		b37.addActionListener(this);
		b38.addActionListener(this);
		b39.addActionListener(this);
		b40.addActionListener(this);
		b41.addActionListener(this);
		b42.addActionListener(this);
		b43.addActionListener(this);
		b44.addActionListener(this);
		b45.addActionListener(this);
		b46.addActionListener(this);
		b47.addActionListener(this);
		b48.addActionListener(this);
		b49.addActionListener(this);
		b50.addActionListener(this);
		b51.addActionListener(this);
		b52.addActionListener(this);
		b53.addActionListener(this);
		b54.addActionListener(this);
		b55.addActionListener(this);
		b56.addActionListener(this);
		b57.addActionListener(this);
		b58.addActionListener(this);
		b59.addActionListener(this);
		b60.addActionListener(this);
		b61.addActionListener(this);
		b62.addActionListener(this);
		b63.addActionListener(this);
		b64.addActionListener(this);
		b65.addActionListener(this);
		b66.addActionListener(this);
		b67.addActionListener(this);
		b68.addActionListener(this);
		b69.addActionListener(this);
		b70.addActionListener(this);
		b71.addActionListener(this);
		b72.addActionListener(this);
		b73.addActionListener(this);
		b74.addActionListener(this);
		b75.addActionListener(this);
		b76.addActionListener(this);
		b77.addActionListener(this);
		b78.addActionListener(this);
		b79.addActionListener(this);
		b80.addActionListener(this);
		b81.addActionListener(this);
		b82.addActionListener(this);
		b83.addActionListener(this);
		b84.addActionListener(this);
		b85.addActionListener(this);
		b86.addActionListener(this);
		b87.addActionListener(this);
		b88.addActionListener(this);
		b89.addActionListener(this);
		b90.addActionListener(this);
		b91.addActionListener(this);
		b92.addActionListener(this);
		b93.addActionListener(this);
		b94.addActionListener(this);
		b95.addActionListener(this);
		b96.addActionListener(this);
		b97.addActionListener(this);
		b98.addActionListener(this);
		b99.addActionListener(this);
		b100.addActionListener(this);

		b1.setIcon(icon);
		b2.setIcon(icon);
		b3.setIcon(icon);
		b4.setIcon(icon);
		b5.setIcon(icon);
		b6.setIcon(icon);
		b7.setIcon(icon);
		b8.setIcon(icon);
		b9.setIcon(icon);
		b10.setIcon(icon);
		b11.setIcon(icon);
		b12.setIcon(icon);
		b13.setIcon(icon);
		b14.setIcon(icon);
		b15.setIcon(icon);
		b16.setIcon(icon);
		b17.setIcon(icon);
		b18.setIcon(icon);
		b19.setIcon(icon);
		b20.setIcon(icon);
		b21.setIcon(icon);
		b22.setIcon(icon);
		b23.setIcon(icon);
		b24.setIcon(icon);
		b25.setIcon(icon);
		b26.setIcon(icon);
		b27.setIcon(icon);
		b28.setIcon(icon);
		b29.setIcon(icon);
		b30.setIcon(icon);
		b31.setIcon(icon);
		b32.setIcon(icon);
		b33.setIcon(icon);
		b34.setIcon(icon);
		b35.setIcon(icon);
		b36.setIcon(icon);
		b37.setIcon(icon);
		b38.setIcon(icon);
		b39.setIcon(icon);
		b40.setIcon(icon);
		b41.setIcon(icon);
		b42.setIcon(icon);
		b43.setIcon(icon);
		b44.setIcon(icon);
		b45.setIcon(icon);
		b46.setIcon(icon);
		b47.setIcon(icon);
		b48.setIcon(icon);
		b49.setIcon(icon);
		b50.setIcon(icon);
		b51.setIcon(icon);
		b52.setIcon(icon);
		b53.setIcon(icon);
		b54.setIcon(icon);
		b55.setIcon(icon);
		b56.setIcon(icon);
		b57.setIcon(icon);
		b58.setIcon(icon);
		b59.setIcon(icon);
		b60.setIcon(icon);
		b61.setIcon(icon);
		b62.setIcon(icon);
		b63.setIcon(icon);
		b64.setIcon(icon);
		b65.setIcon(icon);
		b66.setIcon(icon);
		b67.setIcon(icon);
		b68.setIcon(icon);
		b69.setIcon(icon);
		b70.setIcon(icon);
		b71.setIcon(icon);
		b72.setIcon(icon);
		b73.setIcon(icon);
		b74.setIcon(icon);
		b75.setIcon(icon);
		b76.setIcon(icon);
		b77.setIcon(icon);
		b78.setIcon(icon);
		b79.setIcon(icon);
		b80.setIcon(icon);
		b81.setIcon(icon);
		b82.setIcon(icon);
		b83.setIcon(icon);
		b84.setIcon(icon);
		b85.setIcon(icon);
		b86.setIcon(icon);
		b87.setIcon(icon);
		b88.setIcon(icon);
		b89.setIcon(icon);
		b90.setIcon(icon);
		b91.setIcon(icon);
		b92.setIcon(icon);
		b93.setIcon(icon);
		b94.setIcon(icon);
		b95.setIcon(icon);
		b96.setIcon(icon);
		b97.setIcon(icon);
		b98.setIcon(icon);
		b99.setIcon(icon);
		b100.setIcon(icon);
		// 버튼에 이미지 넣기

		jp.setBounds(0, 0, 2000, 2000);

		b1.setBounds(580, 450, 20, 20);
		b2.setBounds(600, 450, 20, 20);
		b3.setBounds(620, 450, 20, 20);
		b4.setBounds(640, 450, 20, 20);
		b5.setBounds(660, 450, 20, 20);
		b6.setBounds(680, 450, 20, 20);
		b7.setBounds(700, 450, 20, 20);
		b8.setBounds(720, 450, 20, 20);
		b9.setBounds(740, 450, 20, 20);
		b10.setBounds(760, 450, 20, 20);

		b11.setBounds(580, 470, 20, 20);
		b12.setBounds(600, 470, 20, 20);
		b13.setBounds(620, 470, 20, 20);
		b14.setBounds(640, 470, 20, 20);
		b15.setBounds(660, 470, 20, 20);
		b16.setBounds(680, 470, 20, 20);
		b17.setBounds(700, 470, 20, 20);
		b18.setBounds(720, 470, 20, 20);
		b19.setBounds(740, 470, 20, 20);
		b20.setBounds(760, 470, 20, 20);

		b21.setBounds(580, 490, 20, 20);
		b22.setBounds(600, 490, 20, 20);
		b23.setBounds(620, 490, 20, 20);
		b24.setBounds(640, 490, 20, 20);
		b25.setBounds(660, 490, 20, 20);
		b26.setBounds(680, 490, 20, 20);
		b27.setBounds(700, 490, 20, 20);
		b28.setBounds(720, 490, 20, 20);
		b29.setBounds(740, 490, 20, 20);
		b30.setBounds(760, 490, 20, 20);

		b31.setBounds(580, 510, 20, 20);
		b32.setBounds(600, 510, 20, 20);
		b33.setBounds(620, 510, 20, 20);
		b34.setBounds(640, 510, 20, 20);
		b35.setBounds(660, 510, 20, 20);
		b36.setBounds(680, 510, 20, 20);
		b37.setBounds(700, 510, 20, 20);
		b38.setBounds(720, 510, 20, 20);
		b39.setBounds(740, 510, 20, 20);
		b40.setBounds(760, 510, 20, 20);

		b41.setBounds(580, 530, 20, 20);
		b42.setBounds(600, 530, 20, 20);
		b43.setBounds(620, 530, 20, 20);
		b44.setBounds(640, 530, 20, 20);
		b45.setBounds(660, 530, 20, 20);
		b46.setBounds(680, 530, 20, 20);
		b47.setBounds(700, 530, 20, 20);
		b48.setBounds(720, 530, 20, 20);
		b49.setBounds(740, 530, 20, 20);
		b50.setBounds(760, 530, 20, 20);

		b51.setBounds(580, 550, 20, 20);
		b52.setBounds(600, 550, 20, 20);
		b53.setBounds(620, 550, 20, 20);
		b54.setBounds(640, 550, 20, 20);
		b55.setBounds(660, 550, 20, 20);
		b56.setBounds(680, 550, 20, 20);
		b57.setBounds(700, 550, 20, 20);
		b58.setBounds(720, 550, 20, 20);
		b59.setBounds(740, 550, 20, 20);
		b60.setBounds(760, 550, 20, 20);

		b61.setBounds(580, 570, 20, 20);
		b62.setBounds(600, 570, 20, 20);
		b63.setBounds(620, 570, 20, 20);
		b64.setBounds(640, 570, 20, 20);
		b65.setBounds(660, 570, 20, 20);
		b66.setBounds(680, 570, 20, 20);
		b67.setBounds(700, 570, 20, 20);
		b68.setBounds(720, 570, 20, 20);
		b69.setBounds(740, 570, 20, 20);
		b70.setBounds(760, 570, 20, 20);

		b71.setBounds(580, 590, 20, 20);
		b72.setBounds(600, 590, 20, 20);
		b73.setBounds(620, 590, 20, 20);
		b74.setBounds(640, 590, 20, 20);
		b75.setBounds(660, 590, 20, 20);
		b76.setBounds(680, 590, 20, 20);
		b77.setBounds(700, 590, 20, 20);
		b78.setBounds(720, 590, 20, 20);
		b79.setBounds(740, 590, 20, 20);
		b80.setBounds(760, 590, 20, 20);

		b81.setBounds(580, 610, 20, 20);
		b82.setBounds(600, 610, 20, 20);
		b83.setBounds(620, 610, 20, 20);
		b84.setBounds(640, 610, 20, 20);
		b85.setBounds(660, 610, 20, 20);
		b86.setBounds(680, 610, 20, 20);
		b87.setBounds(700, 610, 20, 20);
		b88.setBounds(720, 610, 20, 20);
		b89.setBounds(740, 610, 20, 20);
		b90.setBounds(760, 610, 20, 20);

		b91.setBounds(580, 630, 20, 20);
		b92.setBounds(600, 630, 20, 20);
		b93.setBounds(620, 630, 20, 20);
		b94.setBounds(640, 630, 20, 20);
		b95.setBounds(660, 630, 20, 20);
		b96.setBounds(680, 630, 20, 20);
		b97.setBounds(700, 630, 20, 20);
		b98.setBounds(720, 630, 20, 20);
		b99.setBounds(740, 630, 20, 20);
		b100.setBounds(760, 630, 20, 20);

		jp.add(b1, new Integer(1));
		jp.add(b2, new Integer(2));
		jp.add(b3, new Integer(3));
		jp.add(b4, new Integer(4));
		jp.add(b5, new Integer(5));
		jp.add(b6, new Integer(6));
		jp.add(b7, new Integer(7));
		jp.add(b8, new Integer(8));
		jp.add(b9, new Integer(9));
		jp.add(b10, new Integer(10));
		jp.add(b11, new Integer(11));
		jp.add(b12, new Integer(12));
		jp.add(b13, new Integer(13));
		jp.add(b14, new Integer(14));
		jp.add(b15, new Integer(15));
		jp.add(b16, new Integer(16));
		jp.add(b17, new Integer(17));
		jp.add(b18, new Integer(18));
		jp.add(b19, new Integer(19));
		jp.add(b20, new Integer(20));
		jp.add(b21, new Integer(21));
		jp.add(b22, new Integer(22));
		jp.add(b23, new Integer(23));
		jp.add(b24, new Integer(24));
		jp.add(b25, new Integer(25));
		jp.add(b26, new Integer(26));
		jp.add(b27, new Integer(27));
		jp.add(b28, new Integer(28));
		jp.add(b29, new Integer(29));
		jp.add(b30, new Integer(30));
		jp.add(b31, new Integer(31));
		jp.add(b32, new Integer(32));
		jp.add(b33, new Integer(33));
		jp.add(b34, new Integer(34));
		jp.add(b35, new Integer(35));
		jp.add(b36, new Integer(36));
		jp.add(b37, new Integer(37));
		jp.add(b38, new Integer(38));
		jp.add(b39, new Integer(39));
		jp.add(b40, new Integer(40));
		jp.add(b41, new Integer(41));
		jp.add(b42, new Integer(42));
		jp.add(b43, new Integer(43));
		jp.add(b44, new Integer(44));
		jp.add(b45, new Integer(45));
		jp.add(b46, new Integer(46));
		jp.add(b47, new Integer(47));
		jp.add(b48, new Integer(48));
		jp.add(b49, new Integer(49));
		jp.add(b50, new Integer(50));
		jp.add(b51, new Integer(51));
		jp.add(b52, new Integer(52));
		jp.add(b53, new Integer(53));
		jp.add(b54, new Integer(54));
		jp.add(b55, new Integer(55));
		jp.add(b56, new Integer(56));
		jp.add(b57, new Integer(57));
		jp.add(b58, new Integer(58));
		jp.add(b59, new Integer(59));
		jp.add(b60, new Integer(60));
		jp.add(b61, new Integer(61));
		jp.add(b62, new Integer(62));
		jp.add(b63, new Integer(63));
		jp.add(b64, new Integer(64));
		jp.add(b65, new Integer(65));
		jp.add(b66, new Integer(66));
		jp.add(b67, new Integer(67));
		jp.add(b68, new Integer(68));
		jp.add(b69, new Integer(69));
		jp.add(b70, new Integer(70));
		jp.add(b71, new Integer(71));
		jp.add(b72, new Integer(72));
		jp.add(b73, new Integer(73));
		jp.add(b74, new Integer(74));
		jp.add(b75, new Integer(75));
		jp.add(b76, new Integer(76));
		jp.add(b77, new Integer(77));
		jp.add(b78, new Integer(78));
		jp.add(b79, new Integer(79));
		jp.add(b80, new Integer(80));
		jp.add(b81, new Integer(81));
		jp.add(b82, new Integer(82));
		jp.add(b83, new Integer(83));
		jp.add(b84, new Integer(84));
		jp.add(b85, new Integer(85));
		jp.add(b86, new Integer(86));
		jp.add(b87, new Integer(87));
		jp.add(b88, new Integer(88));
		jp.add(b89, new Integer(89));
		jp.add(b90, new Integer(90));
		jp.add(b91, new Integer(91));
		jp.add(b92, new Integer(92));
		jp.add(b93, new Integer(93));
		jp.add(b94, new Integer(94));
		jp.add(b95, new Integer(95));
		jp.add(b96, new Integer(96));
		jp.add(b97, new Integer(97));
		jp.add(b98, new Integer(98));
		jp.add(b99, new Integer(99));
		jp.add(b100, new Integer(100));
	
		setSize(1400, 800);
		setVisible(true);
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, 1400, 800, this);
		if (poto = true) {
			add(jp);
		}

	}

	public void paint() {
		Graphics gp = this.getGraphics();
		gp.drawImage(img1, 0, 0, 1400, 800, this);

	}
	
	public void repaint() {
		Graphics gp = this.getGraphics();
		gp.drawImage(img2, 0, 0, 1400, 800, this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == b1) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);

		}
		if (arg0.getSource() == b3) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b4) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b5) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b6) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b7) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b8) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b9) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b10) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b11) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b12) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b13) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b14) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b15) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b16) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b17) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b18) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b19) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b20) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b21) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b22) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b23) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b24) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b25) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b26) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b27) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b28) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b29) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b30) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b31) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b32) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b33) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b34) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b35) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b36) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b37) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b38) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b39) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b40) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b41) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b42) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b43) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b44) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b45) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b46) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b47) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b48) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b49) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b50) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b51) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b52) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b53) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b54) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b55) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b56) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b57) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b58) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b59) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b60) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b61) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b62) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b63) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b64) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b65) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b66) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b67) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b68) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b69) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b70) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b71) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b72) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b73) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b74) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b75) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b76) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b77) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b78) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b79) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b80) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b81) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b82) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b83) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b84) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b85) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b86) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b87) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b88) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b89) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b90) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		if (arg0.getSource() == b91) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b92) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b93) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b94) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b95) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b96) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b97) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b98) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b99) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}
		if (arg0.getSource() == b100) {

			tf2 = new test_Frame2("지뢰를 다시 찾으시오.");
			repaint();
			remove(jp);
		}

		else if (arg0.getSource() == b2) {

			paint();
			remove(jp);

		}

	}

	public static void main(String[] args) {
		new findmine();
	}

}

class test_Frame2 extends JDialog {

	JLabel jlb = new JLabel("");

	public test_Frame2(String str) {

		getContentPane().add(jlb);
		jlb.setText(str.toString());

		this.setSize(180, 100);
		this.setModal(true);
		this.setVisible(true);

	}

}