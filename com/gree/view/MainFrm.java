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
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Frame;

@SuppressWarnings("serial")
public class MainFrm extends JFrame {
	private JMenu menu;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Java\\workspace\\QualityInspectoin\\src\\images\\pic00_\u770B\u56FE\u738B.jpg"));
		setTitle("WMS-QC");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setBackground(Color.WHITE);		setBounds(100, 100, 1227, 1050);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu_1 = new JMenu("  \u7CFB\u7EDF\u8BBE\u7F6E");
		menu_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menu_1.setPreferredSize(new Dimension(100, 22));
		menu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/pic01.png")));
		menuBar.add(menu_1);

		JMenuBar menuBar_1 = new JMenuBar();
		menu_1.add(menuBar_1);

		JMenu mnNewMenu = new JMenu("  \u6536\u8D27\u67E5\u8BE2");
		mnNewMenu.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		mnNewMenu.setPreferredSize(new Dimension(100, 22));
		mnNewMenu.setIcon(null);
		menuBar.add(mnNewMenu);

//		mntmjava.addActionListener(new ActionListener() {

			/**
			 * 【记录数据】
			 */

				JMenu mnNewMenu_1 = new JMenu("  \u62BD\u68C0/\u5168\u68C0/\u590D\u68C0");
				mnNewMenu_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
				mnNewMenu_1.setPreferredSize(new Dimension(150, 22));
				mnNewMenu_1.setIcon(null);
				menuBar.add(mnNewMenu_1);

						JMenuItem mntmjava = new JMenuItem("\u6765\u8D27\u62BD\u68C0");
						mntmjava.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
						//			public void actionPerformed(ActionEvent arg0) {
						//				Java1234InterFrm java1234InterFrm = new Java1234InterFrm();// 新建组建对象
						//				java1234InterFrm.setVisible(true);//Makes the component(组建) visible(可见)

						//				setJIFLocationToCenter(java1234InterFrm);  //居中

						//				原代码
						//				int w = (Toolkit.getDefaultToolkit().getScreenSize().width - java1234InterFrm.getWidth())/2;
						//				int h = (Toolkit.getDefaultToolkit().getScreenSize().height - java1234InterFrm.getHeight())/2;
						//				java1234InterFrm.setLocation(w, h);

						//				table.add(java1234InterFrm);//添加组建
						//			}
						//		});
								mntmjava.setIcon(null);
								mnNewMenu_1.add(mntmjava);

										JMenuItem menuItem_6 = new JMenuItem("\u4FEE\u6539\u6570\u636E");
										menuItem_6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
										menuItem_6.addActionListener(new ActionListener() {

											/**
											 * 【修改数据】
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
													 * 【维护结论】
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
															 * 【检验记录】
															 */
															public void actionPerformed(ActionEvent e) {
															}
														});
														menuItem_7.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u68C0\u9A8C\u8BB0\u5F55.png")));
														mnNewMenu_1.add(menuItem_7);

		menu = new JMenu("  \u9884\u6536\u8D27");
		menu.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menu.setIcon(null);
		menu.setPreferredSize(new Dimension(100, 40));
		menuBar.add(menu);

		JMenuItem menuItem_2 = new JMenuItem("\u5E93\u5B58\u67E5\u8BE2");
		menuItem_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuItem_2.addActionListener(new ActionListener() {

			/**
			 * 【库存查询】
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
			 * 【发货使用】
			 */
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuItem_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/out.png")));
		menu.add(menuItem_4);

		JMenu menu_4 = new JMenu("  \u68C0\u9A8C\u6570\u636E");
		menu_4.setPreferredSize(new Dimension(100, 40));
		menu_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menuBar.add(menu_4);

		JMenuItem menuItem_8 = new JMenuItem("\u5E93\u5B58\u67E5\u8BE2");
		menuItem_8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menu_4.add(menuItem_8);

		JMenuItem menuItem_9 = new JMenuItem("\u53D1\u8D27\u4F7F\u7528");
		menuItem_9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menu_4.add(menuItem_9);

		JMenu menu_5 = new JMenu("  \u5F02\u5E38\u5904\u7406");
		menu_5.setPreferredSize(new Dimension(100, 40));
		menu_5.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menuBar.add(menu_5);

		JMenuItem menuItem_10 = new JMenuItem("\u5E93\u5B58\u67E5\u8BE2");
		menuItem_10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menu_5.add(menuItem_10);

		JMenuItem menuItem_11 = new JMenuItem("\u53D1\u8D27\u4F7F\u7528");
		menuItem_11.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menu_5.add(menuItem_11);

		JMenu menu_3 = new JMenu("  \u5E2E\u52A9");
		menu_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menu_3.setPreferredSize(new Dimension(100, 22));
		menu_3.setIcon(null);
		menuBar.add(menu_3);

		JMenuItem menuItem_3 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		menuItem_3.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menuItem_3.addActionListener(new ActionListener() {

			/**
			 * 【退出】
			 */
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统");
				if (result==0) {
					dispose();
				}
				//System.out.println(result);
			}  //【F6】继续下一步，【F8】执行到下一个断点，没断点就执行完毕。
		});
		menuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9000\u51FA.png")));
		menu_3.add(menuItem_3);
		getContentPane().setLayout(null);

		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBackground(Color.WHITE);
		menuBar_2.setBounds(0, 0, 1922, 50);
		getContentPane().add(menuBar_2);

				JMenu mnNewMenu_5 = new JMenu("");
				mnNewMenu_5.setIcon(new ImageIcon("E:\\Java\\workspace\\QualityInspectoin\\src\\images\\pic01.png"));
				menuBar_2.add(mnNewMenu_5);

		JMenu mnNewMenu_2 = new JMenu("");
		mnNewMenu_2.setBackground(new Color(0, 204, 153));
		mnNewMenu_2.setIcon(new ImageIcon("E:\\Java\\workspace\\QualityInspectoin\\src\\images\\pic02.png"));
		menuBar_2.add(mnNewMenu_2);

		JMenu mnNewMenu_3 = new JMenu("");
		mnNewMenu_3.setIcon(new ImageIcon("E:\\Java\\workspace\\QualityInspectoin\\src\\images\\pic03.png"));
		menuBar_2.add(mnNewMenu_3);

		JMenu mnNewMenu_4 = new JMenu("");
		mnNewMenu_4.setIcon(new ImageIcon("E:\\Java\\workspace\\QualityInspectoin\\src\\images\\pic04.png"));
		menuBar_2.add(mnNewMenu_4);

		JMenu mnNewMenu_6 = new JMenu("");
		mnNewMenu_6.setIcon(new ImageIcon("E:\\Java\\workspace\\QualityInspectoin\\src\\images\\pic05.png"));
		menuBar_2.add(mnNewMenu_6);


	}

	// 封装方法：窗口居中，位置的x坐标：(屏幕宽度 - 窗口宽度)/2
	public void setJIFLocationToCenter(JInternalFrame JIF) {
		int w = (Toolkit.getDefaultToolkit().getScreenSize().width - JIF
				.getWidth()) / 2;
		int h = (Toolkit.getDefaultToolkit().getScreenSize().height - JIF
				.getHeight()) / 3; // 竖向黄金分割
		JIF.setLocation(w, h);

	}
}