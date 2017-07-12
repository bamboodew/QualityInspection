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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;


@SuppressWarnings("serial")
public class KeyInforAddInterFrm extends JInternalFrame {
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
	private JTextField textField_8;
	private JTextField textField_7;
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
		setEnabled(false);
		setClosable(true);
		setMaximizable(true);
		setMaximum(true);
		setFrameIcon(new ImageIcon(KeyInforAddInterFrm.class.getResource("/images/\u5165\u5E93.png")));
		setIconifiable(true);
		setTitle("\u5173\u952E\u4FE1\u606F");
		setBounds(100, 100, 1483, 743);

		JLabel label = new JLabel("\u7269\u6599\u4EE3\u7801\uFF1A");

		bookNameTxt = new JTextField();
		bookNameTxt.setColumns(10);

		JLabel label_1 = new JLabel("\u7269\u6599\u540D\u79F0\uFF1A");

		authorTxt = new JTextField();
		authorTxt.setEditable(false);
		authorTxt.setColumns(10);

		JLabel label_3 = new JLabel("\u4F9B\u5E94\u5546\u4EE3\u7801\uFF1A");

		JButton button = new JButton("\u5F55\u5165");
		button.addActionListener(new ActionListener() {
			/**
			 * 【添加】按钮动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				bookAddActionPerformed(e);
			}
		});
		button.setIcon(new ImageIcon(KeyInforAddInterFrm.class.getResource("/images/add.png")));

		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			/**
			 * 重置动作事件
			 */
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(KeyInforAddInterFrm.class.getResource("/images/reset.png")));

		JButton button_2 = new JButton("\u67E5\u8BE2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JLabel label_2 = new JLabel("\u4F9B\u5E94\u5546\u540D\u79F0\uFF1A");

		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u4FE1\u606F\u5F55\u5165", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setToolTipText("\u6536\u8D27");

		JLabel label_4 = new JLabel("\u7269\u6599\u7F16\u7801\uFF1A");
		label_4.setBounds(20, 38, 75, 18);

		textField_2 = new JTextField();
		textField_2.setBounds(116, 35, 179, 24);
		textField_2.setColumns(10);

		JLabel label_5 = new JLabel("\u4F9B\u5E94\u5546\u4EE3\u7801\uFF1A");
		label_5.setBounds(327, 38, 90, 18);

		textField_3 = new JTextField();
		textField_3.setBounds(431, 35, 176, 24);
		textField_3.setColumns(10);

		JLabel label_6 = new JLabel("\u7269\u6599\u540D\u79F0\uFF1A");
		label_6.setBounds(20, 75, 82, 18);

		textField_4 = new JTextField();
		textField_4.setBounds(116, 72, 179, 24);
		textField_4.setEditable(false);
		textField_4.setColumns(10);

		JLabel label_7 = new JLabel("\u4F9B\u5E94\u5546\u540D\u79F0\uFF1A");
		label_7.setBounds(327, 75, 90, 18);

		textField_5 = new JTextField();
		textField_5.setBounds(431, 72, 176, 24);
		textField_5.setEditable(false);
		textField_5.setColumns(10);

		JLabel label_8 = new JLabel("\u6279\u6B21/\u751F\u4EA7\u65E5\u671F");
		label_8.setBounds(441, 118, 98, 18);

		textField_6 = new JTextField();
		textField_6.setBounds(557, 115, 143, 24);
		textField_6.setColumns(10);

		JLabel label_10 = new JLabel("\u5173\u952E\u4FE1\u606F\uFF1A");
		label_10.setBounds(637, 38, 84, 18);

		textField_8 = new JTextField();
		textField_8.setBounds(714, 35, 552, 106);
		textField_8.setColumns(10);

		JLabel label_9 = new JLabel("\u6587\u4EF6\u7F16\u53F7\uFF1A");
		label_9.setBounds(220, 118, 75, 18);

		textField_7 = new JTextField();
		textField_7.setBounds(292, 115, 125, 24);
		textField_7.setColumns(10);
		panel.setLayout(null);
		panel.add(label_4);
		panel.add(label_5);
		panel.add(textField_3);
		panel.add(textField_2);
		panel.add(label_7);
		panel.add(label_6);
		panel.add(label_9);
		panel.add(label_8);
		panel.add(textField_6);
		panel.add(label_10);
		panel.add(textField_7);
		panel.add(textField_5);
		panel.add(textField_4);
		panel.add(textField_8);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u4F9B\u65B9\u4EE3\u7801", "\u4F9B\u65B9\u540D\u79F0", "\u7269\u6599\u7F16\u7801", "\u7269\u6599\u540D\u79F0", "\u5173\u952E\u4FE1\u606F\u7C7B\u522B", "\u6587\u4EF6\u7F16\u53F7", "\u6279\u6B21/\u751F\u4EA7\u65E5\u671F", "\u5173\u952E\u4FE1\u606F"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(4).setPreferredWidth(155);
		table.getColumnModel().getColumn(6).setPreferredWidth(119);
		table.getColumnModel().getColumn(7).setPreferredWidth(231);
		scrollPane.setViewportView(table);
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("109px"),
				ColumnSpec.decode("75px"),
				ColumnSpec.decode("21px"),
				ColumnSpec.decode("183px"),
				ColumnSpec.decode("55px"),
				ColumnSpec.decode("75px"),
				ColumnSpec.decode("21px"),
				ColumnSpec.decode("183px"),
				ColumnSpec.decode("47px"),
				ColumnSpec.decode("90px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("183px"),
				ColumnSpec.decode("55px"),
				ColumnSpec.decode("90px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("201px"),},
			new RowSpec[] {
				RowSpec.decode("31px"),
				RowSpec.decode("27px"),
				RowSpec.decode("60px"),
				RowSpec.decode("27px"),
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("294px"),
				RowSpec.decode("22px"),
				RowSpec.decode("158px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("27px"),}));
		getContentPane().add(label, "2, 2, left, center");
		getContentPane().add(label_3, "10, 2, left, center");
		getContentPane().add(textField_1, "12, 2, fill, top");
		getContentPane().add(bookNameTxt, "4, 2, fill, bottom");
		getContentPane().add(label_1, "6, 2, left, center");
		getContentPane().add(label_2, "14, 2, left, center");
		getContentPane().add(textField, "16, 2, fill, top");
		getContentPane().add(authorTxt, "8, 2, fill, bottom");
		getContentPane().add(button_2, "2, 4, left, top");
		getContentPane().add(panel, "2, 8, 15, 1, fill, fill");

		JRadioButton radioButton = new JRadioButton("\u505C\u7528");
		radioButton.setBounds(20, 114, 60, 27);
		panel.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("\u9000\u8D27");
		radioButton_1.setBounds(84, 114, 60, 27);
		panel.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("\u5176\u4ED6");
		radioButton_2.setBounds(150, 114, 60, 27);
		panel.add(radioButton_2);
		getContentPane().add(scrollPane, "2, 6, 15, 1, fill, fill");
		getContentPane().add(button, "8, 10, right, top");
		getContentPane().add(button_1, "10, 10, right, top");

		JButton btnexcel = new JButton("\u5BFC\u51FAExcel");
		getContentPane().add(btnexcel, "4, 4, left, top");

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
