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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import com.gree.dataAccessObject.SupplierDAO;
import com.gree.model.Supplier;
import com.gree.utility.ConnectToIqc;
import com.gree.utility.StringUtility;

import java.awt.Component;

import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;

@SuppressWarnings("serial")
public class Supplier_MaterAddInterFrm extends JInternalFrame {
	
	private ConnectToIqc cti = new ConnectToIqc();
	private SupplierDAO supplierDAO = new SupplierDAO();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supplier_MaterAddInterFrm frame = new Supplier_MaterAddInterFrm();
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
	public Supplier_MaterAddInterFrm() {
		setIconifiable(true);
		setFrameIcon(new ImageIcon(Supplier_MaterAddInterFrm.class.getResource("/images/\u6DFB\u52A0.png")));
		setClosable(true);
		setTitle("\u7269\u6599\u65B0\u589E");
		setBounds(100, 100, 500, 444);

		JButton button = new JButton("\u6DFB\u52A0");
		button.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		button.addActionListener(new ActionListener() {
			/**
			 * 【添加】按钮动作事件
			 */
			public void actionPerformed(ActionEvent e) {
//				supplierAddActionPerformed(e);
			}
		});
		button.setIcon(new ImageIcon(Supplier_MaterAddInterFrm.class
				.getResource("/images/add.png")));

		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		button_1.addActionListener(new ActionListener() {
			/**
			 * 重置动作事件
			 */
			public void actionPerformed(ActionEvent e) {
//				resetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(Supplier_MaterAddInterFrm.class
				.getResource("/images/reset.png")));
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(136)
					.addComponent(button)
					.addGap(50)
					.addComponent(button_1)
					.addContainerGap(136, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(360, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addGap(27))
		);

		getContentPane().setLayout(groupLayout);

//		fillBookType();// 下拉框初始化

	}

	/**
	 * 【重置】事件处理
	 * 
	 * @param e
	 */
//	private void resetValueActionPerformed(ActionEvent e) {
//		this.resetValue();
//	}

	/**
	 * 【供方添加】事件处理
	 * 
	 * @param e
	 */

	/**
	 * 重置表单：清空文本框
	 */
//	private void resetValue() {
//		this.supplierCodeTxt.setText("");
//		this.supplierNameTxt.setText("");
//		this.supplierManagerTxt.setText("");
//		this.supplierTelTxt.setText("");
//		this.supplierCityTxt.setText("");
//	}

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
