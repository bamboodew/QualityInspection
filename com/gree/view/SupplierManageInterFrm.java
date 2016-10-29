package com.gree.view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import com.java1234.dataAccessObject.BookDAO;
import com.java1234.dataAccessObject.BookTypeDAO;
import com.java1234.model.Book;
import com.java1234.model.BookType;
import com.java1234.utility.ConnectToBook;
import com.java1234.utility.StringUtility;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class SupplierManageInterFrm extends JInternalFrame {
	private JTable bookTable;
	private JTextField s_bookNameTxt;
	private JTextField s_authorTxt;

	private JComboBox<BookType> s_bookTypeJcb;
	private JRadioButton manJrb;	
	private JRadioButton femaleJrb;
	private JTextArea bookDescTxt; 
	private JComboBox<BookType> bookTypeJcb;
	
	private ConnectToBook ctb = new ConnectToBook();
	private BookTypeDAO bookTypeDAO = new BookTypeDAO();
	private SupplierDAO bookDAO = new SupplierDAO();
	private JTextField idTxt;
	private JTextField bookNameTxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField priceTxt;
	private JTextField authorTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupplierManageInterFrm frame = new SupplierManageInterFrm();
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
	public SupplierManageInterFrm() {
		setClosable(true);
		setIconifiable(true);
		setRequestFocusEnabled(false);
		setTitle("\u56FE\u4E66\u7BA1\u7406");
		setBounds(100, 100, 727, 482);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u641C\u7D22\u6761\u4EF6",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u8868\u5355\u64CD\u4F5C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			//���޸ġ���ť
			public void actionPerformed(ActionEvent e) {
				bookUpdateActionPerformed(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon(SupplierManageInterFrm.class.getResource("/images/modify.png")));
		
		JButton button_1 = new JButton("\u5220\u9664");
		button_1.addActionListener(new ActionListener() {
			//��ɾ������ť
			public void actionPerformed(ActionEvent e) {
				bookDeleteActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(SupplierManageInterFrm.class.getResource("/images/delete.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(scrollPane, Alignment.LEADING)
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(209)
							.addComponent(btnNewButton)
							.addGap(66)
							.addComponent(button_1)))
					.addContainerGap(94, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(button_1))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		
		JLabel label_3 = new JLabel("\u7F16\u53F7\uFF1A");
		
		idTxt = new JTextField();
		idTxt.setEditable(false);
		idTxt.setColumns(10);
		
		JLabel label_4 = new JLabel("\u56FE\u4E66\u540D\u79F0\uFF1A");
		
		bookNameTxt = new JTextField();
		bookNameTxt.setColumns(10);
		
		JLabel label_5 = new JLabel("\u4F5C\u8005\u6027\u522B\uFF1A");
		
		manJrb = new JRadioButton("\u7537");
		buttonGroup.add(manJrb);
		manJrb.setSelected(true);
		
		femaleJrb = new JRadioButton("\u5973");
		buttonGroup.add(femaleJrb);
		
		JLabel label_6 = new JLabel("\u4EF7\u683C\uFF1A");
		
		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		
		JLabel label_7 = new JLabel("\u56FE\u4E66\u4F5C\u8005\uFF1A");
		
		authorTxt = new JTextField();
		authorTxt.setColumns(10);
		
		JLabel label_8 = new JLabel("\u56FE\u4E66\u7C7B\u522B\uFF1A");
		
		bookTypeJcb = new JComboBox<BookType>();
		
		JLabel label_9 = new JLabel("\u56FE\u4E66\u63CF\u8FF0\uFF1A");
		
		/**
		 * ����JScrollPane�����ı���JTextArea��ȷ���ı�������й�������
		 */
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(idTxt, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_6)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(priceTxt, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bookNameTxt, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(authorTxt)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(manJrb)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(femaleJrb))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_8)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bookTypeJcb, 0, 111, Short.MAX_VALUE))))
						.addComponent(label_9, Alignment.LEADING))
					.addGap(0))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5)
								.addComponent(manJrb)
								.addComponent(femaleJrb))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_8)
								.addComponent(bookTypeJcb, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3)
								.addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4)
								.addComponent(bookNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6)
								.addComponent(priceTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7)
								.addComponent(authorTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_9)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
		);
		
		bookDescTxt = new JTextArea();
		bookDescTxt.setLineWrap(true);
		
		scrollPane_1.setViewportView(bookDescTxt);
		panel_1.setLayout(gl_panel_1);

		JLabel label = new JLabel("\u56FE\u4E66\u540D\u79F0\uFF1A");

		s_bookNameTxt = new JTextField();
		s_bookNameTxt.setColumns(10);

		JLabel label_1 = new JLabel("\u56FE\u4E66\u4F5C\u8005\uFF1A");

		s_authorTxt = new JTextField();
		s_authorTxt.setColumns(10);

		JLabel label_2 = new JLabel("\u56FE\u4E66\u7C7B\u522B\uFF1A");

		s_bookTypeJcb = new JComboBox<BookType>();

		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			/**
			 * ����ѯ����ť
			 */
			public void actionPerformed(ActionEvent e) {
				bookSearchActionPerformed(e);
			}
		});
		button.setIcon(new ImageIcon(SupplierManageInterFrm.class
				.getResource("/images/search.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(s_bookNameTxt, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(s_authorTxt, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(s_bookTypeJcb, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(s_bookNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(s_authorTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(s_bookTypeJcb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

		bookTable = new JTable();
		bookTable.addMouseListener(new MouseAdapter() {
			//������������С�
			@Override
			public void mousePressed(MouseEvent met) {
				bookTableMousePressed(met);
			}
		});
		bookTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] {
				"\u7F16\u53F7", "\u56FE\u4E66\u540D\u79F0",
				"\u56FE\u4E66\u4F5C\u8005", "\u4F5C\u8005\u6027\u522B",
				"\u56FE\u4E66\u4EF7\u683C", "\u56FE\u4E66\u63CF\u8FF0",
				"\u56FE\u4E66\u7C7B\u522B" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(bookTable);
		getContentPane().setLayout(groupLayout);

		this.fillBookType("search");//��������������
		this.fillBookType("modify");
		this.fillTable(new Book());
	}

	/**
	 * ��ͼ��ɾ�����¼�����
	 * @param e
	 */
	private void bookDeleteActionPerformed(ActionEvent e) {
		String id = idTxt.getText();
		if(StringUtility.isEmpty(id)){
			JOptionPane.showMessageDialog(null, "��ѡ��Ҫɾ����ͼ�飡");
			return;
		}
		int n = JOptionPane.showConfirmDialog(null, "ȷ��Ҫɾ��ͼ����");
		if(n == 0){
			Connection con = null;
			try {
				con = ctb.getCon();
				int deleteNum = bookDAO.delete(con, id);
				if(deleteNum ==1){
					JOptionPane.showMessageDialog(null, "ͼ��ɾ���ɹ���");
					this.resetValue();
					this.fillTable(new Book());
				}else{
					JOptionPane.showMessageDialog(null, "ͼ��ɾ��ʧ�ܣ�");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				JOptionPane.showMessageDialog(null, "ͼ��ɾ��ʧ�ܣ�");
			}finally{
				try {
					ctb.closeCon(con);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		
	}

	/**
	 * ��ͼ���޸ġ��¼�
	 * @param e
	 */
	private void bookUpdateActionPerformed(ActionEvent e) {
		
		//��1 �Ӷ�Ӧ���ı�������ȡ�ı�
		String id = idTxt.getText();
		
		//��2 ���ͼ�����͵�ʵ��
		if(StringUtility.isEmpty(id)){
			JOptionPane.showMessageDialog(null, "��ѡ��Ҫ�޸ĵļ�¼��");
			return;
		}
		
		String bookName = this.bookNameTxt.getText();
		String author = this.authorTxt.getText();
		String price = this.priceTxt.getText();
		String bookDesc = this.bookDescTxt.getText();
		
		if(StringUtility.isEmpty(bookName)){
			JOptionPane.showMessageDialog(null, "ͼ�����Ʋ���Ϊ�գ�");//����������ʾ
			return;
		}
		if(StringUtility.isEmpty(author)){
			JOptionPane.showMessageDialog(null, "ͼ�����߲���Ϊ�գ�");//����������ʾ
			return;
		}
		if(StringUtility.isEmpty(price)){
			JOptionPane.showMessageDialog(null, "ͼ��۸���Ϊ�գ�");//����������ʾ
			return;
		}
		
		//�Ա�ѡ�񣬸�ֵ��
		String sex = "";
		if(manJrb.isSelected()){
			sex="��";
		}else if(femaleJrb.isSelected()){
			sex="Ů";
		}
		
		BookType bookType = (BookType) bookTypeJcb.getSelectedItem();//ѡ�������������һ��
		int bookTypeId = bookType.getId();
		
		Book book = new Book(Integer.parseInt(id),  bookName,  author,  sex, Float.parseFloat(price),  bookTypeId,  bookDesc);//��װ
		
		//��3 ��ʵ�����£���ӣ������ݿ�ı���
		Connection con = null;
		try {
			con = ctb.getCon();//��ȡ���ݿ�����
			int modifyNum = bookDAO.update(con, book);//�������ݿ�
			if(modifyNum==1){
				JOptionPane.showMessageDialog(null, "ͼ���޸ĳɹ���");
				this.resetValue();//��ոո���д���ı���
				this.fillTable(new Book());//ˢ�½����г��ֵı�
			}else{
				JOptionPane.showMessageDialog(null, "ͼ���޸�ʧ�ܣ�");
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}finally{
			try {
				ctb.closeCon(con);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}

	/**
	 * ���ñ�������ı���
	 */
	private void resetValue() {
		this.idTxt.setText("");
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
	 * ������е�����¼�����
	 * @param met
	 */
	private void bookTableMousePressed(MouseEvent met) {
		int row = this.bookTable.getSelectedRow();//���ص��ѡ�е��к�
		this.idTxt.setText((String) bookTable.getValueAt(row, 0));
		this.bookNameTxt.setText((String) bookTable.getValueAt(row, 1));
		this.authorTxt.setText((String) bookTable.getValueAt(row, 2));
		
		String sex=(String) bookTable.getValueAt(row, 3);
		if("��".equals(sex)){
			this.manJrb.setSelected(true);
		}else if("Ů".equals(sex)){
			this.femaleJrb.setSelected(true);
		}
		
		this.priceTxt.setText((Float) bookTable.getValueAt(row, 4)+"");
		this.bookDescTxt.setText((String) bookTable.getValueAt(row, 5));
		String bookTypeName = (String) bookTable.getValueAt(row, 6);
		int n = this.bookTypeJcb.getItemCount();
		for(int i =0;i <n;i++){
			BookType item = (BookType) this.bookTypeJcb.getItemAt(i);
			if(item.getBookTypeName().equals(bookTypeName)){
				this.bookTypeJcb.setSelectedIndex(i);
			}
		}
	}

	/**
	 * ��ͼ���ѯ���¼�����
	 * @param e
	 */
	private void bookSearchActionPerformed(ActionEvent e) {
		String bookName = this.s_bookNameTxt.getText();
		String author = this.s_authorTxt.getText();
		BookType bookType = (BookType) this.s_bookTypeJcb.getSelectedItem();
		int bookTypeId=bookType.getId();
		
		Book book = new Book(bookName,author,bookTypeId);
		this.fillTable(book);
	}

	/**
	 * ���������ֵ����ʼ��������
	 * 
	 * @param type
	 */
	private void fillBookType(String type) {
		Connection con = null;
		BookType bookType = null;
		try {
			con = ctb.getCon();
			ResultSet rs = bookTypeDAO.list(con, new BookType());
			if ("search".equals(type)) {
				bookType=new BookType();
				bookType.setBookTypeName("��ѡ��...");
				bookType.setId(-1);
				
				this.s_bookTypeJcb.addItem(bookType);//��������������һ��ѡ��
			}
			while(rs.next()){
				bookType=new BookType();
				bookType.setBookTypeName(rs.getString("bookTypeName"));
				bookType.setId(rs.getInt("id"));
				
				if("search".equals(type)){
					this.s_bookTypeJcb.addItem(bookType);
				}else if("modify".equals(type)){
					this.bookTypeJcb.addItem(bookType);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ctb.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ��ʼ���������
	 * @param book
	 */
	@SuppressWarnings("rawtypes")
	private void fillTable(Book book){

		DefaultTableModel dtm=(DefaultTableModel) bookTable.getModel();//ʵ����һ��Ĭ�ϵı�ģ��Ϊͼ�����ͱ�
		dtm.setRowCount(0);//���ó�0�У���������㡣
		Connection con=null;//�½�����Ϊ��
		try {
			con = ctb.getCon();//��ȡ����
			ResultSet rs = bookDAO.list(con, book);//ִ��sql��䣬���ؽ����
			//�������������������е���ʽ��ӵ�dtm��ģ�͵���
			while (rs.next()) {
				Vector<Comparable> v = new Vector<Comparable>();//�½����С�����
				v.add(rs.getString("id"));
				v.add(rs.getString("bookName"));
				v.add(rs.getString("author"));
				v.add(rs.getString("sex"));
				v.add(rs.getFloat("price"));
				v.add(rs.getString("bookDesc"));
				v.add(rs.getString("bookTypeName"));

				dtm.addRow(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				ctb.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
