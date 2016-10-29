package com.gree.view;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import java.awt.Font;

@SuppressWarnings("serial")
public class MainFrm extends JFrame {
	private JMenu menu;
	private JTable table;

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
		getContentPane().setBackground(SystemColor.inactiveCaption);
		
		table = new JTable();
		table.setBackground(SystemColor.inactiveCaption);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(table, GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(table, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrm.class.getResource("/images/\u70E7\u676F.png")));
		setBackground(Color.WHITE);
		setTitle("IQC\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();   //��JFrame�¡��Զ����Ų����˵���JMenuBar
		setJMenuBar(menuBar);
		
		JMenu menu_1 = new JMenu("  \u4F9B\u8D27");
		menu_1.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		menu_1.setPreferredSize(new Dimension(110, 22));
		menu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u4F9B\u5E94\u5546.png")));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_8 = new JMenuItem("\u4F9B\u65B9\u65B0\u589E");
		menuItem_8.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		menuItem_8.addActionListener(new ActionListener() {

			/**
			 * ������������
			 */
			public void actionPerformed(ActionEvent e) {
				SupplierAddInterFrm supplierAddInterFrm = new SupplierAddInterFrm();
				supplierAddInterFrm.setVisible(true);
				
				setJIFLocationToCenter(supplierAddInterFrm);
				table.add(supplierAddInterFrm);
			}
		});
		
		menuItem_8.setIcon(new ImageIcon(MainFrm.class
				.getResource("/images/add.png")));
		menu_1.add(menuItem_8);

		JMenuItem menuItem_9 = new JMenuItem("\u4F9B\u65B9\u7BA1\u7406");
		menuItem_9.setFont(new Font("΢���ź�", Font.PLAIN, 14));

		menuItem_9.addActionListener(new ActionListener() {
			
			/**
			 * ���޸Ĺ�����
			 */
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JMenuItem menuItem_10 = new JMenuItem("\u7269\u6599\u65B0\u589E");
		menuItem_10.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		menuItem_10.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u6DFB\u52A0.png")));
		menu_1.add(menuItem_10);
		menuItem_9.setIcon(new ImageIcon(MainFrm.class.getResource("/images/modify.png")));
		menu_1.add(menuItem_9);

		JMenu mnNewMenu = new JMenu("  \u6536\u8D27");
		mnNewMenu.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		mnNewMenu.setPreferredSize(new Dimension(110, 22));
		mnNewMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5165\u5E93.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("\u6536\u8D27\u5165\u5E93");
		menuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuItem.addActionListener(new ActionListener() {
			
			/**
			 * ���ջ���⡿��������������MaterialAddInterFrm����
			 */
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5165\u5E93.png")));
		mnNewMenu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u5F85\u68C0\u67E5\u8BE2");
		menuItem_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuItem_1.addActionListener(new ActionListener() {
			
			/**
			 * �������ѯ��
			 */
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/search.png")));
		mnNewMenu.add(menuItem_1);

		JMenu mnNewMenu_1 = new JMenu("  \u68C0\u9A8C");
		mnNewMenu_1.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		mnNewMenu_1.setPreferredSize(new Dimension(110, 22));
		mnNewMenu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u68C0\u9A8C.png")));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmjava = new JMenuItem("\u8BB0\u5F55\u6570\u636E");
		mntmjava.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		
//		mntmjava.addActionListener(new ActionListener() {
			
			/**
			 * ����¼���ݡ�
			 */
//			public void actionPerformed(ActionEvent arg0) {
//				Java1234InterFrm java1234InterFrm = new Java1234InterFrm();// �½��齨����
//				java1234InterFrm.setVisible(true);//Makes the component(�齨) visible(�ɼ�)

//				setJIFLocationToCenter(java1234InterFrm);  //����
				
//				ԭ����
//				int w = (Toolkit.getDefaultToolkit().getScreenSize().width - java1234InterFrm.getWidth())/2;
//				int h = (Toolkit.getDefaultToolkit().getScreenSize().height - java1234InterFrm.getHeight())/2;
//				java1234InterFrm.setLocation(w, h);

//				table.add(java1234InterFrm);//����齨
//			}
//		});
		mntmjava.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u8BB0\u5F55\u6570\u636E.png")));
		mnNewMenu_1.add(mntmjava);
		
		JMenuItem menuItem_6 = new JMenuItem("\u4FEE\u6539\u6570\u636E");
		menuItem_6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuItem_6.addActionListener(new ActionListener() {
			
			/**
			 * ���޸����ݡ�
			 */
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuItem_6.setIcon(new ImageIcon("G:\\Java\\workspace\\QualityInspectoin\\src\\images\\\u4FEE\u6539.png"));
		mnNewMenu_1.add(menuItem_6);
		
		JMenuItem menuItem_5 = new JMenuItem("\u7EF4\u62A4\u7ED3\u8BBA");
		menuItem_5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuItem_5.addActionListener(new ActionListener() {
			
			/**
			 * ��ά�����ۡ�
			 */
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuItem_5.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7EF4\u62A4\u7ED3\u8BBA.png")));
		mnNewMenu_1.add(menuItem_5);
		
		JMenuItem menuItem_7 = new JMenuItem("\u68C0\u9A8C\u8BB0\u5F55");
		menuItem_7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuItem_7.addActionListener(new ActionListener() {
			
			/**
			 * �������¼��
			 */
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuItem_7.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u68C0\u9A8C\u8BB0\u5F55.png")));
		mnNewMenu_1.add(menuItem_7);
		
		menu = new JMenu("  \u5E93\u5B58");
		menu.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		menu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5E93\u5B58.png")));
		menu.setPreferredSize(new Dimension(110, 40));
		menuBar.add(menu);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5E93\u5B58\u67E5\u8BE2");
		menuItem_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuItem_2.addActionListener(new ActionListener() {
			
			/**
			 * ������ѯ��
			 */
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuItem_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/search.png")));
		menu.add(menuItem_2);
		
		JMenuItem menuItem_4 = new JMenuItem("\u53D1\u8D27\u4F7F\u7528");
		menuItem_4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuItem_4.addActionListener(new ActionListener() {
			
			/**
			 * ������ʹ�á�
			 */
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuItem_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/out.png")));
		menu.add(menuItem_4);
		
		JMenu menu_3 = new JMenu("  \u9000\u51FA");
		menu_3.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		menu_3.setPreferredSize(new Dimension(110, 22));
		menu_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9000\u51FA.png")));
		menuBar.add(menu_3);
		
		JMenuItem menuItem_3 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		menuItem_3.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		menuItem_3.addActionListener(new ActionListener() {
			
			/**
			 * ���˳���
			 */
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "�Ƿ��˳�ϵͳ");
				if (result==0) {
					dispose();
				}
				//System.out.println(result);
			}  //��F6��������һ������F8��ִ�е���һ���ϵ㣬û�ϵ��ִ����ϡ�
		});
		menuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9000\u51FA.png")));
		menu_3.add(menuItem_3);
		
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
