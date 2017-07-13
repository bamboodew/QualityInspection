package com.gree.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.DefaultCaret;

import com.gree.utility.ConnectToIqc;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.ScrollPaneConstants;


@SuppressWarnings("serial")
public class KeyInforAddInterFrm extends JInternalFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private ConnectToIqc cti= new ConnectToIqc();
	private JTable table_1;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyInforAddInterFrm frame = new KeyInforAddInterFrm();
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
	@SuppressWarnings("rawtypes")
	public KeyInforAddInterFrm() {
		setVisible(true);
		setClosable(true);
		setEnabled(false);
		setMaximizable(true);
		setFrameIcon(new ImageIcon(KeyInforAddInterFrm.class.getResource("/images/\u5165\u5E93.png")));
		setIconifiable(true);
		setTitle("\u5173\u952E\u4FE1\u606F");
		setBounds(100, 100, 1181, 652);

		JButton button = new JButton("\u5F55\u5165");
		button.setBounds(0, 0, 0, 0);
		button.addActionListener(new ActionListener() {
			/**
			 * 【添加】按钮动作事件
			 */
			public void actionPerformed(ActionEvent e) {
//				bookAddActionPerformed(e);
			}
		});
		button.setIcon(new ImageIcon(KeyInforAddInterFrm.class.getResource("/images/add.png")));

		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setBounds(0, 0, 0, 0);
		button_1.addActionListener(new ActionListener() {
			/**
			 * 重置动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(KeyInforAddInterFrm.class.getResource("/images/reset.png")));
		getContentPane().setLayout(null);
		getContentPane().add(button);
		getContentPane().add(button_1);

		JLabel label_11 = new JLabel("\u7269\u6599\u7F16\u7801\uFF1A");
		label_11.setBounds(41, 46, 75, 18);
		getContentPane().add(label_11);

		textField_9 = new JTextField();
		textField_9.setBounds(120, 43, 190, 24);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);

		JLabel label_12 = new JLabel("\u7269\u6599\u540D\u79F0\uFF1A");
		label_12.setBounds(336, 49, 75, 18);
		getContentPane().add(label_12);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(415, 46, 173, 24);
		getContentPane().add(textField_10);

		JLabel label_13 = new JLabel("\u4F9B\u65B9\u4EE3\u7801\uFF1A");
		label_13.setBounds(614, 49, 75, 18);
		getContentPane().add(label_13);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(703, 46, 138, 24);
		getContentPane().add(textField_11);

		JLabel label_14 = new JLabel("\u4F9B\u65B9\u540D\u79F0\uFF1A");
		label_14.setBounds(863, 46, 75, 18);
		getContentPane().add(label_14);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(952, 46, 173, 24);
		getContentPane().add(textField_12);

		JButton button_3 = new JButton("\u67E5\u8BE2");
		button_3.setBounds(41, 95, 113, 27);
		getContentPane().add(button_3);

		JButton btnNewButton = new JButton("\u5BFC\u51FAExcel");
		btnNewButton.setBounds(197, 94, 113, 27);
		getContentPane().add(btnNewButton);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(41, 151, 1084, 193);
		getContentPane().add(scrollPane_1);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u4F9B\u65B9\u4EE3\u7801", "\u4F9B\u65B9\u540D\u79F0", "\u7269\u6599\u7F16\u7801", "\u7269\u6599\u540D\u79F0", "\u5173\u952E\u4FE1\u606F\u7C7B\u522B", "\u6587\u4EF6\u7F16\u53F7", "\u6279\u6B21/\u751F\u4EA7\u65E5\u671F", "\u5173\u952E\u4FE1\u606F"
			}
		));
		scrollPane_1.setViewportView(table);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u4FE1\u606F\u5F55\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBounds(41, 384, 1084, 165);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("\u7269\u6599\u7F16\u7801\uFF1A");
		label.setBounds(14, 30, 75, 18);
		panel.add(label);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(93, 27, 109, 24);
		panel.add(textField);

		JLabel label_1 = new JLabel("\u7269\u6599\u540D\u79F0\uFF1A");
		label_1.setBounds(236, 33, 75, 18);
		panel.add(label_1);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(315, 30, 159, 24);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(93, 61, 109, 24);
		panel.add(textField_2);

		JLabel label_2 = new JLabel("\u4F9B\u65B9\u4EE3\u7801\uFF1A");
		label_2.setBounds(14, 64, 75, 18);
		panel.add(label_2);

		JLabel label_3 = new JLabel("\u4F9B\u65B9\u540D\u79F0\uFF1A");
		label_3.setBounds(236, 67, 75, 18);
		panel.add(label_3);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(315, 64, 159, 24);
		panel.add(textField_3);

		JRadioButton radioButton = new JRadioButton("\u505C\u7528");
		radioButton.setBounds(10, 94, 59, 24);
		panel.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("\u9000\u8D27");
		radioButton_1.setBounds(78, 94, 59, 24);
		panel.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("\u5176\u4ED6");
		radioButton_2.setBounds(143, 94, 59, 24);
		panel.add(radioButton_2);

		JLabel label_4 = new JLabel("\u6587\u4EF6\u7F16\u53F7\uFF1A");
		label_4.setBounds(14, 130, 75, 18);
		panel.add(label_4);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(93, 127, 109, 24);
		panel.add(textField_4);

		JLabel label_5 = new JLabel("\u6279\u6B21/\u751F\u4EA7\u65E5\u671F");
		label_5.setBounds(236, 130, 98, 18);
		panel.add(label_5);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(351, 127, 123, 24);
		panel.add(textField_5);

		JLabel label_6 = new JLabel("\u5173\u952E\u4FE1\u606F\uFF1A");
		label_6.setBounds(505, 30, 75, 18);
		panel.add(label_6);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(582, 30, 488, 118);
		panel.add(textField_6);

		JButton button_2 = new JButton("\u5F55\u5165");
		button_2.setBounds(435, 562, 113, 27);
		getContentPane().add(button_2);

		JButton button_4 = new JButton("\u91CD\u7F6E");
		button_4.setBounds(583, 562, 113, 27);
		getContentPane().add(button_4);


	}

	/**
	 * 【重置】事件处理
	 * @param e
	 */
	private void resetValueActionPerformed(ActionEvent e) {
//		this.resetValue();

	}

	/**
	 * 【图书添加】事件处理
	 * @param e
	 */
//	private void bookAddActionPerformed(ActionEvent evt) {
//		String bookName = this.bookNameTxt.getText();
//		String author = this.authorTxt.getText();
//		String price = this.priceTxt.getText();
//		String bookDesc = this.bookDescTxt.getText();
//
//		if(StringUtility.isEmpty(bookName)){
//			JOptionPane.showMessageDialog(null, "图书名称不能为空！");//跳出窗口提示
//			return;
//		}
//		if(StringUtility.isEmpty(author)){
//			JOptionPane.showMessageDialog(null, "图书作者不能为空！");//跳出窗口提示
//			return;
//		}
//		if(StringUtility.isEmpty(price)){
//			JOptionPane.showMessageDialog(null, "图书价格不能为空！");//跳出窗口提示
//			return;
//		}
//
//		//性别选择，赋值。
//		String sex = "";
//		if(manJrb.isSelected()){
//			sex="男";
//		}else if(femaleJrb.isSelected()){
//			sex="女";
//		}
//
//		BookType bookType = (BookType) bookTypeJcb.getSelectedItem();//选中下拉框的其中一项
//		int bookTypeId = bookType.getId();
//
//		Material book = new Material(bookName, author, sex, Float.parseFloat(price), bookTypeId, bookDesc);
//
//		Connection con=null;
//		try {
//			con = cti.getCon();
//			int addNum = bookDAO.add(con, book);
//			if(addNum==1){
//				JOptionPane.showMessageDialog(null, "图书添加成功！");
//				resetValue();//添加成功之后，将文本框清空。
//			}else{
//				JOptionPane.showMessageDialog(null, "图书添加失败！");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			JOptionPane.showMessageDialog(null, "图书添加失败！");
//		}finally{
//			try {
//				cti.closeCon(con);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	/**
//	 * 重置表单：清空文本框
//	 */
//	private void resetValue() {
//		this.bookNameTxt.setText("");
//		this.authorTxt.setText("");
//		this.priceTxt.setText("");
//		this.manJrb.setSelected(true);
//		this.bookDescTxt.setText("");
//		if(this.bookTypeJcb.getItemCount()>0){
//			this.bookTypeJcb.setSelectedIndex(0);
//		}
//	}
//
//	/**
//	 * 初始化图书类别下拉框
//	 */
//	@SuppressWarnings("unchecked")
//	private void fillBookType() {
//		Connection con = null;
//		BookType bookType = null;
//		try {
//			con = cti.getCon();
//			ResultSet rs = bookTypeDAO.list(con, new BookType());
//			while (rs.next()) {
//				bookType = new BookType();
//				bookType.setId(rs.getInt("id"));
//				bookType.setBookTypeName(rs.getString("bookTypeName"));
//				this.bookTypeJcb.addItem(bookType);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
