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


@SuppressWarnings("serial")
public class MaterialAddInterFrm extends JInternalFrame {
	private JTextField bookNameTxt;
	private JTextField authorTxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private ConnectToIqc cti= new ConnectToIqc();
	private BookTypeDAO bookTypeDAO = new BookTypeDAO();
	private MaterialDAO bookDAO = new MaterialDAO();
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaterialAddInterFrm frame = new MaterialAddInterFrm();
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
	public MaterialAddInterFrm() {
		setFrameIcon(new ImageIcon(MaterialAddInterFrm.class.getResource("/images/\u5165\u5E93.png")));
		setClosable(true);
		setIconifiable(true);
		setTitle("\u6536\u8D27\u5165\u5E93");
		setBounds(100, 100, 800, 600);
		
		JLabel label = new JLabel("\u7269\u6599\u4EE3\u7801\uFF1A");
		
		bookNameTxt = new JTextField();
		bookNameTxt.setColumns(10);
		
		JLabel label_1 = new JLabel("\u7269\u6599\u540D\u79F0\uFF1A");
		
		authorTxt = new JTextField();
		authorTxt.setColumns(10);
		
		JLabel label_3 = new JLabel("\u4F9B\u5E94\u5546\u540D\u79F0\uFF1A");
		
		JButton button = new JButton("\u6536\u8D27");
		button.addActionListener(new ActionListener() {
			/**
			 * 【添加】按钮动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				bookAddActionPerformed(e);
			}
		});
		button.setIcon(new ImageIcon(MaterialAddInterFrm.class.getResource("/images/add.png")));
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			/**
			 * 重置动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(MaterialAddInterFrm.class.getResource("/images/reset.png")));
		
		JButton button_2 = new JButton("\u67E5\u8BE2");
		
		JLabel label_2 = new JLabel("\u4F9B\u5E94\u5546\u4EE3\u7801\uFF1A");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u6536\u8D27\u64CD\u4F5C", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		panel.setToolTipText("\u6536\u8D27");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(109)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addComponent(label_3))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(bookNameTxt, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
									.addGap(37)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(label_1)
										.addComponent(label_2))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField)
										.addComponent(authorTxt, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
								.addComponent(button_2)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 566, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(278)
							.addComponent(button)
							.addGap(74)
							.addComponent(button_1)))
					.addContainerGap(108, Short.MAX_VALUE))
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
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(button_2)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		
		JLabel label_4 = new JLabel("\u7269\u6599\u4EE3\u7801\uFF1A");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("\u4F9B\u5E94\u5546\u540D\u79F0\uFF1A");
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		JLabel label_6 = new JLabel("\u7269\u6599\u540D\u79F0\uFF1A");
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		JLabel label_7 = new JLabel("\u4F9B\u5E94\u5546\u4EE3\u7801\uFF1A");
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		JLabel label_8 = new JLabel("\u6536\u8D27\u5355\u53F7\uFF1A");
		
		JLabel label_9 = new JLabel("\u6536\u8D27\u65F6\u95F4\uFF1A\uFF1A");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel label_10 = new JLabel("\u6570\u91CF\uFF1A");
		
		JLabel label_11 = new JLabel("\u6536\u8D27\u4EBA\uFF1A");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_6))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_4)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_3)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_8))))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(6))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_7)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_4))
								.addGap(13)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_5)))
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_10)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_9)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_11)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u4F9B\u65B9\u4EE3\u7801", "\u4F9B\u65B9\u540D\u79F0", "\u7269\u6599\u4EE3\u7801", "\u7269\u6599\u540D\u79F0"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
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
		
		Material book = new Material(bookName, author, sex, Float.parseFloat(price), bookTypeId, bookDesc);
		
		Connection con=null;
		try {
			con = cti.getCon();
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
	}
}
