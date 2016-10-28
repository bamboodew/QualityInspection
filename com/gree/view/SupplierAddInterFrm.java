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

import com.java1234.dataAccessObject.BookDAO;
import com.java1234.dataAccessObject.BookTypeDAO;
import com.java1234.model.Book;
import com.java1234.model.BookType;
import com.java1234.utility.ConnectToBook;
import com.java1234.utility.StringUtility;

@SuppressWarnings("serial")
public class SupplierAddInterFrm extends JInternalFrame {
	private JTextField bookNameTxt;
	private JTextField authorTxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField priceTxt;
	@SuppressWarnings("rawtypes")
	private JComboBox bookTypeJcb;
	private JRadioButton manJrb;
	private JRadioButton femaleJrb;

	private ConnectToBook ctb= new ConnectToBook();
	private BookTypeDAO bookTypeDAO = new BookTypeDAO();
	private BookDAO bookDAO = new BookDAO();

	private JTextArea bookDescTxt;
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
	@SuppressWarnings("rawtypes")
	public SupplierAddInterFrm() {
		setClosable(true);
		setIconifiable(true);
		setTitle("\u56FE\u4E66\u6DFB\u52A0");
		setBounds(100, 100, 568, 429);
		
		JLabel label = new JLabel("\u56FE\u4E66\u540D\u79F0\uFF1A");
		
		bookNameTxt = new JTextField();
		bookNameTxt.setColumns(10);
		
		JLabel label_1 = new JLabel("\u56FE\u4E66\u4F5C\u8005\uFF1A");
		
		authorTxt = new JTextField();
		authorTxt.setColumns(10);
		
		JLabel label_2 = new JLabel("\u4F5C\u8005\u6027\u522B\uFF1A");
		
		manJrb = new JRadioButton("\u7537");
		buttonGroup.add(manJrb);
		manJrb.setSelected(true);
		
		femaleJrb = new JRadioButton("\u5973");
		buttonGroup.add(femaleJrb);
		
		JLabel label_3 = new JLabel("\u56FE\u4E66\u4EF7\u683C\uFF1A");
		
		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		
		JLabel label_4 = new JLabel("\u56FE\u4E66\u7C7B\u522B\uFF1A");
		
		JLabel label_5 = new JLabel("\u56FE\u4E66\u63CF\u8FF0\uFF1A");
		
		/**
		 * 创建JScrollPane来放文本框JTextArea，确保文本框可以有滚动条。
		 */
		JScrollPane scrollPane = new JScrollPane();
		
		bookTypeJcb = new JComboBox();
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.addActionListener(new ActionListener() {
			/**
			 * 【添加】按钮动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				bookAddActionPerformed(e);
			}
		});
		button.setIcon(new ImageIcon(SupplierAddInterFrm.class.getResource("/images/add.png")));
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			/**
			 * 重置动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(SupplierAddInterFrm.class.getResource("/images/reset.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(67)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bookTypeJcb, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bookNameTxt, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(manJrb)
									.addGap(18)
									.addComponent(femaleJrb)))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(authorTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(priceTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane)))
					.addContainerGap(67, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(182)
					.addComponent(button)
					.addGap(34)
					.addComponent(button_1)
					.addContainerGap(182, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(bookNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(authorTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(manJrb)
						.addComponent(femaleJrb)
						.addComponent(label_3)
						.addComponent(priceTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(bookTypeJcb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_5)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		
		bookDescTxt = new JTextArea();
		
		bookDescTxt.setLineWrap(true);//文本框的内容自动换行
		
		//如果光标位置超出目前可视范围，会自动滚动以保正光标可以显示出来。
		DefaultCaret caret = (DefaultCaret) bookDescTxt.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		scrollPane.setViewportView(bookDescTxt);
		getContentPane().setLayout(groupLayout);
		
		fillBookType();//下拉框初始化

	}
	
	/**
	 * 【重置】事件处理
	 * @param e
	 */
	private void resetValueActionPerformed(ActionEvent e) {
		this.resetValue();
		
	}

	/**
	 * 【图书添加】事件处理
	 * @param e
	 */
	private void bookAddActionPerformed(ActionEvent evt) {
		String bookName = this.bookNameTxt.getText();
		String author = this.authorTxt.getText();
		String price = this.priceTxt.getText();
		String bookDesc = this.bookDescTxt.getText();
		
		if(StringUtility.isEmpty(bookName)){
			JOptionPane.showMessageDialog(null, "图书名称不能为空！");//跳出窗口提示
			return;
		}
		if(StringUtility.isEmpty(author)){
			JOptionPane.showMessageDialog(null, "图书作者不能为空！");//跳出窗口提示
			return;
		}
		if(StringUtility.isEmpty(price)){
			JOptionPane.showMessageDialog(null, "图书价格不能为空！");//跳出窗口提示
			return;
		}
		
		//性别选择，赋值。
		String sex = "";
		if(manJrb.isSelected()){
			sex="男";
		}else if(femaleJrb.isSelected()){
			sex="女";
		}
		
		BookType bookType = (BookType) bookTypeJcb.getSelectedItem();//选中下拉框的其中一项
		int bookTypeId = bookType.getId();
		
		Book book = new Book(bookName, author, sex, Float.parseFloat(price), bookTypeId, bookDesc);
		
		Connection con=null;
		try {
			con = ctb.getCon();
			int addNum = bookDAO.add(con, book);
			if(addNum==1){
				JOptionPane.showMessageDialog(null, "图书添加成功！");
				resetValue();//添加成功之后，将文本框清空。
			}else{
				JOptionPane.showMessageDialog(null, "图书添加失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "图书添加失败！");
		}finally{
			try {
				ctb.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 重置表单：清空文本框
	 */
	private void resetValue() {
		this.bookNameTxt.setText("");
		this.authorTxt.setText("");
		this.priceTxt.setText("");
		this.manJrb.setSelected(true);
		this.bookDescTxt.setText("");
		if(this.bookTypeJcb.getItemCount()>0){
			this.bookTypeJcb.setSelectedIndex(0);
		}
	}

	/**
	 * 初始化图书类别下拉框
	 */
	@SuppressWarnings("unchecked")
	private void fillBookType() {
		Connection con = null;
		BookType bookType = null;
		try {
			con = ctb.getCon();
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
	}
}
