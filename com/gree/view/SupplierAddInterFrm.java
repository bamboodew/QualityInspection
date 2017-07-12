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


import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.border.LineBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class SupplierAddInterFrm extends JInternalFrame {
	private JTextField supplierCodeTxt;
	private JTextField supplierNameTxt;
	private JTextField supplierManagerTxt;
	private JTextField supplierTelTxt;
	private JTextField supplierCityTxt;
	
	private ConnectToIqc cti = new ConnectToIqc();
	private SupplierDAO supplierDAO = new SupplierDAO();
	private JLabel label;
	private final JLabel label_4 = new JLabel("New label");
	private JTextField CodeExistingTxt;
	private JTextField NameExistingTxt;
	

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
		setFrameIcon(new ImageIcon(SupplierAddInterFrm.class.getResource("/images/add.png")));
		setClosable(true);
		setTitle("\u4F9B\u65B9\u65B0\u589E");
		setBounds(100, 100, 500, 250);

		label = new JLabel("\u4EE3\u7801\uFF1A");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		supplierCodeTxt = new JTextField();

//		supplierCodeTxt.addMouseMotionListener(new MouseMotionAdapter() {
//			/**
//			 * 鼠标点击供方代码输入框的响应：自动显示是否已存在！
//			 */
//			@Override
//			public void mouseMoved(MouseEvent e) {
//				supplierCodeTxtMousePressed(e);
//			}
//		});
		
		supplierCodeTxt.addMouseListener(new MouseAdapter() {
			/**
			 * 鼠标点击【供方代码】输入框的响应：自动显示是否已存在！
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				supplierCodeTxtMousePressed(e);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				supplierCodeTxtMousePressed(e);
			}
		});
		
		supplierCodeTxt.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		supplierCodeTxt.setColumns(10);

		JLabel label_1 = new JLabel("\u540D\u79F0\uFF1A");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		supplierNameTxt = new JTextField();
		
		supplierNameTxt.addMouseListener(new MouseAdapter() {
			/**
			 * 鼠标点击【供方名称】输入框的响应：自动显示是否已存在！
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				supplierNameTxtMousePressed(e);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				supplierNameTxtMousePressed(e);
			}
		});
		
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
		
		/**
		 * 是否已存在的判断结果显示
		 */
		CodeExistingTxt = new JTextField();
		CodeExistingTxt.setFont(new Font("微软雅黑", Font.BOLD | Font.ITALIC, 12));
		CodeExistingTxt.setBorder(null);
		CodeExistingTxt.setEditable(false);
		CodeExistingTxt.setColumns(10);
		
		NameExistingTxt = new JTextField();
		NameExistingTxt.setFont(new Font("微软雅黑", Font.BOLD | Font.ITALIC, 12));
		NameExistingTxt.setEditable(false);
		NameExistingTxt.setColumns(10);
		NameExistingTxt.setBorder(null);
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(474, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(supplierCodeTxt, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_5)
								.addComponent(label_2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(supplierManagerTxt, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
											.addGap(58))
										.addComponent(CodeExistingTxt, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
									.addGap(4)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(supplierTelTxt))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(label_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(supplierNameTxt))))
								.addComponent(supplierCityTxt, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(NameExistingTxt, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(136)
					.addComponent(button)
					.addGap(50)
					.addComponent(button_1)
					.addContainerGap(136, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(NameExistingTxt, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(supplierCodeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label)
										.addComponent(CodeExistingTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
								.addComponent(supplierCityTxt, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addGap(27))
		);

		getContentPane().setLayout(groupLayout);

//		fillBookType();// 下拉框初始化

	}

	/**
	 * 鼠标点击【供方名称】输入框的响应：自动显示【是否已存在】！
	 */
	public void supplierNameTxtMousePressed(MouseEvent e) {
		Connection con = null;
		try {
			con = cti.getCon();
			
		} catch (Exception e1) {
			e1.printStackTrace();
			}
		try {
			if(supplierDAO.isNameExsiting(con,supplierNameTxt.getText())==true){
				this.NameExistingTxt.setText("已存在");
				}else{
					this.NameExistingTxt.setText("");
					}
			} catch (Exception e1) {
				e1.printStackTrace();
				}
		}

	/**
	 * 鼠标点击【供方代码】输入框的响应：自动显示【是否已存在】！
	 * @param e
	 */
	public void supplierCodeTxtMousePressed(MouseEvent e) {
		Connection con = null;
		try {
			con = cti.getCon();
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			if (supplierDAO.isCodeExsiting(con,supplierCodeTxt.getText()) == true) {
				this.CodeExistingTxt.setText("已存在");
			} else {
				this.CodeExistingTxt.setText("");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
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
			if(supplierDAO.isCodeExsiting(con, supplierCodeTxt.getText())==true){
				JOptionPane.showMessageDialog(null, "供方已存在！");
			}else if (supplierDAO.isNameExsiting(con, supplierNameTxt.getText())==true) {
				JOptionPane.showMessageDialog(null, "供方已存在！");
			}else{
				int addNum = supplierDAO.add(con, supplier);
				if (addNum == 1) {
					JOptionPane.showMessageDialog(null, "供方添加成功！");
					resetValue();// 添加成功之后，将文本框清空。
				} else {
					JOptionPane.showMessageDialog(null, "供方添加失败！");
				}
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
