package com.gree.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.gree.dataAccessObject.UserDAO;
import com.gree.model.User;
import com.gree.utility.ConnectToIqc;
import com.gree.utility.StringUtility;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class LogOnFrm extends JFrame {
	private JPanel contentPane;
	private JTextField userNameTxt;
	private JPasswordField passwordTxt;
	
	ConnectToIqc cti = new ConnectToIqc(); // �½�һ�����Ӷ���
	UserDAO userDAO = new UserDAO(); // �Ǿ�̬���������봴���������ʹ�ã�����Ҫ�½�һ��UserDAO���߶���

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogOnFrm frame = new LogOnFrm();
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
	public LogOnFrm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LogOnFrm.class.getResource("/images/caliper\uFF08\u6E38\u6807\u5361\u5C3A\uFF09.png")));

		// �ı�ϵͳĬ������
		Font font = new Font("Dialog", Font.PLAIN, 12);
		@SuppressWarnings("rawtypes")
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource) {
				UIManager.put(key, font);
			}
		}
		setResizable(false);
		setTitle("\u68C0\u9A8C\u5458\u767B\u9646");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("  IQC\u7CFB\u7EDF");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		lblNewLabel.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/caliper\uFF08\u6E38\u6807\u5361\u5C3A\uFF09.png")));

		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D");
		lblNewLabel_1.setIcon(new ImageIcon(LogOnFrm.class
				.getResource("/images/userName.png")));

		JLabel lblNewLabel_2 = new JLabel("\u5BC6  \u7801");
		lblNewLabel_2.setIcon(new ImageIcon(LogOnFrm.class
				.getResource("/images/password.png")));

		userNameTxt = new JTextField();
		userNameTxt.addKeyListener(new KeyAdapter() {
			// �û�����д���֮���ִ�С��س�����¼�������ߡ�ESC�����˳�����
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					loginActionPerformed(e);
				}
				if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
					dispose();
				}
			}

		});
		userNameTxt.setColumns(10);

		passwordTxt = new JPasswordField();

		passwordTxt.addKeyListener(new KeyAdapter() {
			@Override
			// ������д���֮���ִ�С��س����ĵ�¼����
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					loginActionPerformed(e);
				}
				if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
					dispose();
				}
			}
		});

		JButton button = new JButton("\u767B\u5F55");
		button.addKeyListener(new KeyAdapter() {
			@Override
			// tab������¼��֮�󡾻س�������
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					loginActionPerformed(e);
				}
				if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
					dispose();
				}
			}
		});
		button.setIcon(new ImageIcon(LogOnFrm.class
				.getResource("/images/login.png")));
		button.addActionListener(new ActionListener() {
			// ����¼������
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed(e);
			}
		});

		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addKeyListener(new KeyAdapter() {
			@Override
			// tab�������á�֮�󡾻س���ִ�����ö���
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					resetValueActionPerformed(e);
				}
				if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
					dispose();
				}
			}
		});
		button_1.addActionListener(new ActionListener() {
			// �����á�����
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(LogOnFrm.class
				.getResource("/images/reset.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(123, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addGap(113))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(116)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button)
							.addGap(44)
							.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordTxt)
								.addComponent(userNameTxt, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))))
					.addGap(106))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(40)
					.addComponent(lblNewLabel)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(userNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

		// ����JFrame������ʾ
		this.setLocationRelativeTo(null);
	}

	protected void resetValueActionPerformed(KeyEvent evt) {
		this.userNameTxt.setText("");
		this.passwordTxt.setText("");
	}

	/**
	 * ���س�����¼
	 * 
	 * @param evt
	 */
	protected void loginActionPerformed(KeyEvent evt) {

		String userName = this.userNameTxt.getText();
		String password = new String(this.passwordTxt.getPassword()); // ��char[]ǿ��ת����String����
		if (StringUtility.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null, "�û�������Ϊ�գ�");
			return;
		}
		if (StringUtility.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ�գ�");
			return;
		}
		User user = new User(userName, password); // ���롰ʵ�֡��Ŀ�ݷ�ʽ��ctrl + ����
		Connection con = null;
		try {
			con = cti.getCon();
			User currentUser = userDAO.login(con, user);
			if (currentUser != null) {
				dispose();// ���ٵ�ǰ����
//				new MainFrm().setVisible(true);
				 JOptionPane.showMessageDialog(null, "��¼�ɹ���");
			} else {
				JOptionPane.showMessageDialog(null, "�û������������");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				cti.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/**
	 * ��¼�¼�����
	 * 
	 * @param e
	 */
	private void loginActionPerformed(ActionEvent evt) {
		String userName = this.userNameTxt.getText();
		String password = new String(this.passwordTxt.getPassword()); // ��char[]ǿ��ת����String����
		if (StringUtility.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null, "�û�������Ϊ�գ�");
			return;
		}
		if (StringUtility.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ�գ�");
			return;
		}
		User user = new User(userName, password); // ���롰ʵ�֡��Ŀ�ݷ�ʽ��ctrl + ����
		Connection con = null;
		try {
			con = cti.getCon();
			User currentUser = userDAO.login(con, user);
			if (currentUser != null) {
				dispose();// ���ٵ�ǰ����
//				new MainFrm().setVisible(true);
				 JOptionPane.showMessageDialog(null, "��¼�ɹ���");
			} else {
				JOptionPane.showMessageDialog(null, "�û������������");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				cti.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * �����¼�����
	 * 
	 * @param evt
	 */
	protected void resetValueActionPerformed(ActionEvent evt) {

		this.userNameTxt.setText("");
		this.passwordTxt.setText("");

	}

}