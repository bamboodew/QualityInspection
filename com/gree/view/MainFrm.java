package com.gree.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class MainFrm extends JFrame {

	private JDesktopPane table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrm.class.getResource("/images/\u70E7\u676F.png")));
		getContentPane().setBackground(Color.BLACK);
		setBackground(Color.BLACK);
		setTitle("IQC\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("\u6536\u8D27");
		mnNewMenu.setPreferredSize(new Dimension(100, 22));
		mnNewMenu.setIcon(new ImageIcon("G:\\Java\\workspace\\QuolityInspectoin\\src\\images\\\u6536\u8D27.png"));
		menuBar.add(mnNewMenu);

		JMenu menu = new JMenu("\u56FE\u4E66\u7C7B\u522B\u7BA1\u7406");
		menu.setIcon(new ImageIcon(MainFrm.class
				.getResource("/images/bookTypeManager.png")));
		mnNewMenu.add(menu);

		JMenuItem menuItem = new JMenuItem(
				"\u56FE\u4E66\u7C7B\u522B\u6DFB\u52A0");
		menuItem.addActionListener(new ActionListener() {
			/**
			 * ��Ӧ��ͼ�������ӡ����¼�
			 */
			public void actionPerformed(ActionEvent e) {
				BookTypeAddInterFrm bookTypeAddInterFrm=new BookTypeAddInterFrm();
				bookTypeAddInterFrm.setVisible(true);
				
				setJIFLocationToCenter(bookTypeAddInterFrm);//���ھ���
				
				table.add(bookTypeAddInterFrm);
				
			}
		});
		menuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/add.png")));
		menu.add(menuItem);

		JMenuItem menuItem_1 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u7EF4\u62A4");
		menuItem_1.addActionListener(new ActionListener() {
			/**
			 * ��ͼ�����ά����
			 */
			public void actionPerformed(ActionEvent e) {
				BookTypeManageInterFrm bookTypeManageInterFrm=new BookTypeManageInterFrm();
				bookTypeManageInterFrm.setVisible(true);
				
				setJIFLocationToCenter(bookTypeManageInterFrm);//���ھ���
				
				table.add(bookTypeManageInterFrm);
			}
		});
		menuItem_1.setIcon(new ImageIcon(MainFrm.class
				.getResource("/images/edit.png")));
		menu.add(menuItem_1);

		JMenu menu_1 = new JMenu("\u56FE\u4E66\u7BA1\u7406");
		menu_1.setIcon(new ImageIcon(MainFrm.class
				.getResource("/images/bookManager.png")));
		mnNewMenu.add(menu_1);

		JMenuItem menuItem_2 = new JMenuItem("\u56FE\u4E66\u6DFB\u52A0");
		menuItem_2.addActionListener(new ActionListener() {
			/**
			 * ��Ӧ��ͼ����ӡ��¼�
			 */
			public void actionPerformed(ActionEvent e) {
				BookAddInterFrm bookAddInterFrm=new BookAddInterFrm();
				bookAddInterFrm.setVisible(true);
				
				setJIFLocationToCenter(bookAddInterFrm);//���ھ���
				
				table.add(bookAddInterFrm);
			}
		});
		menuItem_2.setIcon(new ImageIcon(MainFrm.class
				.getResource("/images/add.png")));
		menu_1.add(menuItem_2);

		JMenuItem menuItem_3 = new JMenuItem("\u56FE\u4E66\u7EF4\u62A4");
		menuItem_3.addActionListener(new ActionListener() {
			/**
			 * ��ͼ��ά��������
			 */
			public void actionPerformed(ActionEvent e) {
				BookManageInterFrm bookManageInterFrm=new BookManageInterFrm();
				bookManageInterFrm.setVisible(true);
				
				setJIFLocationToCenter(bookManageInterFrm);//���ھ���
				
				table.add(bookManageInterFrm);
			}
		});
		menuItem_3.setIcon(new ImageIcon(MainFrm.class
				.getResource("/images/edit.png")));
		menu_1.add(menuItem_3);

		JMenuItem menuItem_4 = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		
		menuItem_4.addActionListener(new ActionListener() {
			
			//��ȫ�˳�ϵͳ
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "�Ƿ��Ƴ�ϵͳ");
				if (result==0) {
					dispose();
				}
				//System.out.println(result);
			}  //��F6��������һ������F8��ִ�е���һ���ϵ㣬û�ϵ��ִ����ϡ�
		});
		
		menuItem_4.setIcon(new ImageIcon(MainFrm.class
				.getResource("/images/exit.png")));
		mnNewMenu.add(menuItem_4);

		JMenu mnNewMenu_1 = new JMenu("\u5E93\u5B58\u67E5\u8BE2");
		mnNewMenu_1.setPreferredSize(new Dimension(100, 22));
		mnNewMenu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5E93\u5B58.png")));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmjava = new JMenuItem("\u5173\u4E8EJava1234");
		
		mntmjava.addActionListener(new ActionListener() {
			
			/**
			 * ���ӵ��������java1234������������
			 */
			public void actionPerformed(ActionEvent arg0) {
				Java1234InterFrm java1234InterFrm = new Java1234InterFrm();// �½��齨����
				java1234InterFrm.setVisible(true);//Makes the component(�齨) visible(�ɼ�)

				setJIFLocationToCenter(java1234InterFrm);  //����
				
//				ԭ����
//				int w = (Toolkit.getDefaultToolkit().getScreenSize().width - java1234InterFrm.getWidth())/2;
//				int h = (Toolkit.getDefaultToolkit().getScreenSize().height - java1234InterFrm.getHeight())/2;
//				java1234InterFrm.setLocation(w, h);

				table.add(java1234InterFrm);//����齨
			}
		});
		mntmjava.setIcon(new ImageIcon(MainFrm.class
				.getResource("/images/about.png")));
		mnNewMenu_1.add(mntmjava);
		
		JMenu mnNewMenu_2 = new JMenu("\u8BB0\u5F55\u6570\u636E");
		mnNewMenu_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u8BB0\u5F55\u6570\u636E.png")));
		mnNewMenu_2.setPreferredSize(new Dimension(100, 22));
		menuBar.add(mnNewMenu_2);
		
		JMenu menu_2 = new JMenu("\u7ED3\u8BBA\u7EF4\u62A4");
		menu_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7EF4\u62A4\u7ED3\u8BBA.png")));
		menu_2.setPreferredSize(new Dimension(100, 22));
		menuBar.add(menu_2);
		
		JMenu menu_3 = new JMenu("\u9000\u51FA");
		menu_3.setPreferredSize(new Dimension(100, 22));
		menu_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9000\u51FA.png")));
		menuBar.add(menu_3);

		BufferedImage img;
		table = new JDesktopPane();
		table.setBackground(SystemColor.inactiveCaption);
		
		getContentPane().add(table, BorderLayout.CENTER);
		
		// table.setLayout(new BorderLayout(0, 0)); table��������󻯡��˴�ȡ����

		// ����JFrame���
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
	}

	// ��װ���������ھ��У�λ�õ�x���꣺(��Ļ��� - ���ڿ��)/2
	public void setJIFLocationToCenter(JInternalFrame JIF) {
		int w = (Toolkit.getDefaultToolkit().getScreenSize().width - JIF
				.getWidth()) / 2;
		int h = (Toolkit.getDefaultToolkit().getScreenSize().height - JIF
				.getHeight()) / 3; // ����ƽ�ָ�
		JIF.setLocation(w, h);

	}
}
