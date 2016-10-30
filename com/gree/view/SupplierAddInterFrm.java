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

import javax.swing.border.EmptyBorder;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;

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
	private JTextField exsitingTxt;
	

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

		label = new JLabel("\u4EE3\u7801\uFF1A");
		label.setFont(new Font("΢���ź�", Font.PLAIN, 14));

		supplierCodeTxt = new JTextField();

//		supplierCodeTxt.addMouseMotionListener(new MouseMotionAdapter() {
//			/**
//			 * ���������������������Ӧ���Զ���ʾ�Ƿ��Ѵ��ڣ�
//			 */
//			@Override
//			public void mouseMoved(MouseEvent e) {
//				supplierCodeTxtMousePressed(e);
//			}
//		});
		supplierCodeTxt.addMouseListener(new MouseAdapter() {
			/**
			 * ���������������������Ӧ���Զ���ʾ�Ƿ��Ѵ��ڣ�
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
		supplierCodeTxt.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		supplierCodeTxt.setColumns(10);

		JLabel label_1 = new JLabel("\u540D\u79F0\uFF1A");
		label_1.setFont(new Font("΢���ź�", Font.PLAIN, 14));

		supplierNameTxt = new JTextField();
		supplierNameTxt.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		supplierNameTxt.setColumns(10);

		JButton button = new JButton("\u6DFB\u52A0");
		button.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		button.addActionListener(new ActionListener() {
			/**
			 * ����ӡ���ť�����¼�
			 */
			public void actionPerformed(ActionEvent e) {
				supplierAddActionPerformed(e);
			}
		});
		button.setIcon(new ImageIcon(SupplierAddInterFrm.class
				.getResource("/images/add.png")));

		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		button_1.addActionListener(new ActionListener() {
			/**
			 * ���ö����¼�
			 */
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(SupplierAddInterFrm.class
				.getResource("/images/reset.png")));

		JLabel label_2 = new JLabel("\u4E1A\u52A1\u7ECF\u7406\uFF1A");
		label_2.setFont(new Font("΢���ź�", Font.PLAIN, 14));

		supplierManagerTxt = new JTextField();
		supplierManagerTxt.setAlignmentX(Component.RIGHT_ALIGNMENT);
		supplierManagerTxt.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		supplierManagerTxt.setColumns(10);

		JLabel label_3 = new JLabel("\u7535\u8BDD\uFF1A");
		label_3.setFont(new Font("΢���ź�", Font.PLAIN, 14));

		supplierTelTxt = new JTextField();
		supplierTelTxt.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		supplierTelTxt.setColumns(10);

		JLabel label_5 = new JLabel("\u5730\u5740\uFF1A");
		label_5.setFont(new Font("΢���ź�", Font.PLAIN, 14));

		supplierCityTxt = new JTextField();
		supplierCityTxt.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		supplierCityTxt.setColumns(10);
		
		/**
		 * �Ƿ��Ѵ��ڵ��жϽ����ʾ
		 */
		exsitingTxt = new JTextField();
		exsitingTxt.setFont(new Font("΢���ź�", Font.BOLD | Font.ITALIC, 12));
		exsitingTxt.setBorder(new EmptyBorder(0, 0, 0, 0));
		exsitingTxt.setEditable(false);
		exsitingTxt.setColumns(10);
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(47)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
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
														.addGap(62))
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(exsitingTxt, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
														.addGap(4)))
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(supplierTelTxt))
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(label_1)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(supplierNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
											.addComponent(supplierCityTxt, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button)
									.addGap(50)
									.addComponent(button_1)
									.addGap(80))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(supplierCodeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label)
								.addComponent(exsitingTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
					.addContainerGap(38, Short.MAX_VALUE))
		);

		getContentPane().setLayout(groupLayout);

//		fillBookType();// �������ʼ��

	}

	/**
	 * ���������������������Ӧ���Զ���ʾ���Ƿ��Ѵ��ڡ���
	 * @param e
	 */
	protected void supplierCodeTxtMousePressed(MouseEvent e) {
		Connection con = null;
		try {
			con = cti.getCon();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			if(supplierDAO.isExsiting(con, supplierCodeTxt.getText())==true){
				this.exsitingTxt.setText("�Ѵ���");
			}else{
				this.exsitingTxt.setText("");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * �����á��¼�����
	 * 
	 * @param e
	 */
	private void resetValueActionPerformed(ActionEvent e) {
		this.resetValue();
	}

	/**
	 * ��������ӡ��¼�����
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
			JOptionPane.showMessageDialog(null, "�������벻��Ϊ�գ�");// ����������ʾ
			return;
		}
		if (StringUtility.isEmpty(supplierName)) {
			JOptionPane.showMessageDialog(null, "�������Ʋ���Ϊ�գ�");// ����������ʾ
			return;
		}

		Supplier supplier = new Supplier(supplierCode, supplierName, supplierManager, supplierTel, supplierCity);
		Connection con = null;
		try {
			con = cti.getCon();
			if(supplierDAO.isExsiting(con, supplierCodeTxt.getText())==true){
				JOptionPane.showMessageDialog(null, "�����Ѵ��ڣ�");
			}else{
				int addNum = supplierDAO.add(con, supplier);
				if (addNum == 1) {
					JOptionPane.showMessageDialog(null, "������ӳɹ���");
					resetValue();// ��ӳɹ�֮�󣬽��ı�����ա�
				} else {
					JOptionPane.showMessageDialog(null, "�������ʧ�ܣ�");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "�������ʧ�ܣ�");
		} finally {
			try {
				cti.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ���ñ�������ı���
	 */
	private void resetValue() {
		this.supplierCodeTxt.setText("");
		this.supplierNameTxt.setText("");
		this.supplierManagerTxt.setText("");
		this.supplierTelTxt.setText("");
		this.supplierCityTxt.setText("");
	}

	/**
	 * ��ʼ��ͼ�����������
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
