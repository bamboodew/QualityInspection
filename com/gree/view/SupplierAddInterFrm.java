package com.gree.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import com.gree.dataAccessObject.SupplierDAO;
import com.gree.model.Supplier;
import com.gree.utility.ConnectToIqc;
import com.gree.utility.StringUtility;

import java.awt.Component;

@SuppressWarnings("serial")
public class SupplierAddInterFrm extends JInternalFrame {
	private JTextField supplierCodeTxt;
	private JTextField supplierNameTxt;
	private JTextField supplierManagerTxt;
	private JTextField supplierTelTxt;
	private JTextField supplierCityTxt;
	
	private ConnectToIqc cti = new ConnectToIqc();
	private SupplierDAO supplierDAO = new SupplierDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupplierAddInterFrm frame = new SupplierAddInterFrm();
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
	public SupplierAddInterFrm() {
		setIconifiable(true);
		setFrameIcon(new ImageIcon(
				SupplierAddInterFrm.class
						.getResource("/images/\u4F9B\u5E94\u5546.png")));
		setClosable(true);
		setTitle("\u4F9B\u65B9\u7EF4\u62A4");
		setBounds(100, 100, 500, 250);

		JLabel label = new JLabel("\u4EE3\u7801\uFF1A");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		supplierCodeTxt = new JTextField();
		supplierCodeTxt.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		supplierCodeTxt.setColumns(10);

		JLabel label_1 = new JLabel("\u540D\u79F0\uFF1A");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		supplierNameTxt = new JTextField();
		supplierNameTxt.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		supplierNameTxt.setColumns(10);

		JButton button = new JButton("\u6DFB\u52A0");
		button.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		button.addActionListener(new ActionListener() {
			/**
			 * 【添加】按钮动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				supplierAddActionPerformed(e);
			}
		});
		button.setIcon(new ImageIcon(SupplierAddInterFrm.class
				.getResource("/images/add.png")));

		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		button_1.addActionListener(new ActionListener() {
			/**
			 * 重置动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(SupplierAddInterFrm.class
				.getResource("/images/reset.png")));

		JLabel label_2 = new JLabel("\u4E1A\u52A1\u7ECF\u7406\uFF1A");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		supplierManagerTxt = new JTextField();
		supplierManagerTxt.setAlignmentX(Component.RIGHT_ALIGNMENT);
		supplierManagerTxt.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		supplierManagerTxt.setColumns(10);

		JLabel label_3 = new JLabel("\u7535\u8BDD\uFF1A");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		supplierTelTxt = new JTextField();
		supplierTelTxt.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		supplierTelTxt.setColumns(10);

		JLabel label_5 = new JLabel("\u5730\u5740\uFF1A");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		supplierCityTxt = new JTextField();
		supplierCityTxt.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		supplierCityTxt.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(28)
								.addComponent(label)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(supplierCodeTxt, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(label_5)
									.addComponent(label_2))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(supplierManagerTxt, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(supplierTelTxt))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(label_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(supplierNameTxt, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
									.addComponent(supplierCityTxt, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button)
							.addGap(50)
							.addComponent(button_1)
							.addGap(80)))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(supplierCodeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_2)
								.addComponent(supplierManagerTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1)
								.addComponent(supplierNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3)
								.addComponent(supplierTelTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_5)
						.addComponent(supplierCityTxt, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(32, Short.MAX_VALUE))
		);

		getContentPane().setLayout(groupLayout);

//		fillBookType();// 下拉框初始化

	}

	/**
	 * 【重置】事件处理
	 * 
	 * @param e
	 */
	private void resetValueActionPerformed(ActionEvent e) {
		this.resetValue();
	}

	/**
	 * 【供方添加】事件处理
	 * 
	 * @param e
	 */
	private void supplierAddActionPerformed(ActionEvent evt) {
		String supplierCode = this.supplierCodeTxt.getText();
		String supplierName = this.supplierNameTxt.getText();
		String supplierManager = this.supplierManagerTxt.getText();
		String supplierTel = this.supplierTelTxt.getText();
		String supplierCity = this.supplierCityTxt.getText();

		if (StringUtility.isEmpty(supplierCode)) {
			JOptionPane.showMessageDialog(null, "供方代码不能为空！");// 跳出窗口提示
			return;
		}
		if (StringUtility.isEmpty(supplierName)) {
			JOptionPane.showMessageDialog(null, "供方名称不能为空！");// 跳出窗口提示
			return;
		}

		Supplier supplier = new Supplier(supplierCode, supplierName, supplierManager, supplierTel, supplierCity);
		Connection con = null;
		try {
			con = cti.getCon();
			int addNum = supplierDAO.add(con, supplier);
			if (addNum == 1) {
				JOptionPane.showMessageDialog(null, "供方添加成功！");
				resetValue();// 添加成功之后，将文本框清空。
			} else {
				JOptionPane.showMessageDialog(null, "供方添加失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "供方添加失败！");
		} finally {
			try {
				cti.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 重置表单：清空文本框
	 */
	private void resetValue() {
		this.supplierCodeTxt.setText("");
		this.supplierNameTxt.setText("");
		this.supplierManagerTxt.setText("");
		this.supplierTelTxt.setText("");
		this.supplierCityTxt.setText("");
	}

	/**
	 * 初始化图书类别下拉框
	 */
//	@SuppressWarnings("unchecked")
/*	private void fillBookType() {
		Connection con = null;
		BookType bookType = null;
		try {
			con = cti.getCon();
			ResultSet rs = bookTypeDAO.list(con, new BookType());
			while (rs.next()) {
				bookType = new BookType();
				bookType.setId(rs.getInt("id"));
				bookType.setBookTypeName(rs.getString("bookTypeName"));
				this.bookTypeJcb.addItem(bookType);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
}
