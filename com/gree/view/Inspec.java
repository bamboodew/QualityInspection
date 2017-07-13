package com.gree.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Inspec extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_5;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inspec frame = new Inspec();
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
	public Inspec() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Java\\workspace\\QualityInspectoin\\src\\images\\pic00_\u770B\u56FE\u738B.jpg"));
		setTitle("\u62BD  \u68C0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1234, 728);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("\u53D6\u6D88");
		menu.setPreferredSize(new Dimension(100, 24));
		menu.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		menuBar.add(menu);

		JMenu menu_1 = new JMenu("\u4FDD\u5B58");
		menu_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		menu_1.setPreferredSize(new Dimension(100, 24));
		menuBar.add(menu_1);

		JMenu menu_2 = new JMenu("\u9000\u51FA");
		menu_2.setPreferredSize(new Dimension(100, 24));
		menu_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		menuBar.add(menu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 1169, 136);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8F93\u5165\u67E5\u8BE2\u6761\u4EF6", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("\u8F93\u5165\u67E5\u8BE2\u6761\u4EF6");
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("MLOT\uFF1A");
		lblNewLabel.setBounds(20, 36, 47, 18);

		textField = new JTextField();
		textField.setBounds(73, 33, 245, 24);
		textField.setColumns(10);

		JLabel lblLpn = new JLabel("LPN\uFF1A");
		lblLpn.setBounds(20, 67, 47, 18);
		lblLpn.setHorizontalAlignment(SwingConstants.CENTER);

		textField_1 = new JTextField();
		textField_1.setBounds(73, 64, 245, 24);
		textField_1.setColumns(10);

		JLabel label = new JLabel("\u68C0\u9A8C\u5458");
		label.setBounds(14, 98, 47, 18);
		label.setHorizontalAlignment(SwingConstants.LEFT);

		textField_2 = new JTextField();
		textField_2.setBounds(73, 95, 245, 24);
		textField_2.setEditable(false);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setBounds(336, 64, 83, 55);

		JCheckBox chckbxNewCheckBox = new JCheckBox("\u662F\u5426\u67E5\u770B\u56FE\u7EB8");
		chckbxNewCheckBox.setBounds(459, 78, 119, 27);
		panel.setLayout(null);
		panel.add(lblLpn);
		panel.add(lblNewLabel);
		panel.add(textField);
		panel.add(textField_1);
		panel.add(label);
		panel.add(textField_2);
		panel.add(btnNewButton);
		panel.add(chckbxNewCheckBox);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 391, 1096, 253);
		panel_1.setToolTipText("\u8F93\u5165\u67E5\u8BE2\u6761\u4EF6");
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u62BD\u68C0\u4FE1\u606F", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel_1);

		JLabel label_1 = new JLabel("LPN\uFF1A");
		label_1.setBounds(323, 36, 47, 18);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_2 = new JLabel("MLOT\uFF1A");
		label_2.setBounds(20, 36, 47, 18);

		textField_3 = new JTextField();
		textField_3.setBounds(73, 33, 196, 24);
		textField_3.setEditable(false);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(376, 33, 129, 24);
		textField_4.setEditable(false);
		textField_4.setColumns(10);

		JCheckBox checkBox_1 = new JCheckBox("\u9996\u6279\u6765\u8D27");
		checkBox_1.setBounds(515, 32, 97, 27);

		JLabel label_4 = new JLabel("\u7269\u6599\u4EE3\u7801");
		label_4.setBounds(643, 38, 78, 18);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);

		textField_6 = new JTextField();
		textField_6.setBounds(727, 35, 129, 24);
		textField_6.setEditable(false);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(958, 35, 129, 24);
		textField_7.setEditable(false);
		textField_7.setColumns(10);

		JLabel label_5 = new JLabel("\u7269\u6599\u540D\u79F0");
		label_5.setBounds(874, 38, 78, 18);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);

		textField_8 = new JTextField();
		textField_8.setBounds(122, 77, 147, 24);
		textField_8.setEditable(false);
		textField_8.setColumns(10);

		JLabel label_6 = new JLabel("\u5B9E\u6536\u6570\u91CF");
		label_6.setBounds(20, 80, 84, 18);

		JLabel label_3 = new JLabel("\u62BD\u68C0\u6570\u91CF");
		label_3.setBounds(323, 80, 80, 18);
		label_3.setHorizontalAlignment(SwingConstants.LEFT);

		textField_5 = new JTextField();
		textField_5.setBounds(409, 77, 162, 24);
		textField_5.setColumns(10);

		JLabel label_7 = new JLabel("\u5408\u683C\u6570\u91CF");
		label_7.setBounds(643, 80, 78, 18);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);

		textField_9 = new JTextField();
		textField_9.setBounds(727, 77, 129, 24);
		textField_9.setColumns(10);

		JLabel label_8 = new JLabel("\u4E0D\u5408\u683C\u6570\u91CF");
		label_8.setBounds(874, 80, 78, 18);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);

		textField_10 = new JTextField();
		textField_10.setBounds(958, 77, 129, 24);
		textField_10.setColumns(10);

		JLabel lblErp = new JLabel("ERP\u7269\u6599\u6279\u6B21");
		lblErp.setBounds(20, 122, 84, 18);

		textField_11 = new JTextField();
		textField_11.setBounds(122, 120, 147, 24);
		textField_11.setEditable(false);
		textField_11.setColumns(10);

		JLabel label_9 = new JLabel("\u662F\u5426\u5408\u683C");
		label_9.setBounds(323, 123, 84, 18);

		JRadioButton rdbtnShi = new JRadioButton("\u662F");
		rdbtnShi.setBounds(409, 119, 43, 27);

		JRadioButton radioButton = new JRadioButton("\u5426");
		radioButton.setBounds(470, 119, 53, 27);

		JCheckBox checkBox = new JCheckBox("\u662F\u5426\u9700\u8981\u5168\u68C0");
		checkBox.setBounds(643, 119, 119, 27);

		JLabel label_10 = new JLabel("\u4E0D\u5408\u683C\u7B49\u7EA7");
		label_10.setBounds(874, 123, 78, 18);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);

		JList list = new JList();
		list.setBounds(1238, 134, 1, 1);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(958, 120, 129, 24);

		JLabel label_11 = new JLabel("\u4E0D\u5408\u683C\u539F\u56E0");
		label_11.setBounds(20, 193, 80, 18);
		label_11.setHorizontalAlignment(SwingConstants.LEFT);

		textField_12 = new JTextField();
		textField_12.setBounds(122, 164, 147, 76);
		textField_12.setColumns(10);

		JLabel label_12 = new JLabel("\u578B\u5F0F\u8BD5\u9A8C");
		label_12.setBounds(323, 193, 80, 18);
		label_12.setHorizontalAlignment(SwingConstants.LEFT);

		textField_13 = new JTextField();
		textField_13.setBounds(409, 164, 163, 76);
		textField_13.setColumns(10);

		JLabel label_13 = new JLabel("\u5907\u6CE8");
		label_13.setBounds(643, 193, 80, 18);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);

		textField_14 = new JTextField();
		textField_14.setBounds(727, 164, 360, 76);
		textField_14.setColumns(10);
		panel_1.setLayout(null);
		panel_1.add(label_2);
		panel_1.add(textField_3);
		panel_1.add(label_6);
		panel_1.add(textField_8);
		panel_1.add(lblErp);
		panel_1.add(label_11);
		panel_1.add(textField_12);
		panel_1.add(textField_11);
		panel_1.add(label_1);
		panel_1.add(textField_4);
		panel_1.add(checkBox_1);
		panel_1.add(label_3);
		panel_1.add(textField_5);
		panel_1.add(label_9);
		panel_1.add(rdbtnShi);
		panel_1.add(radioButton);
		panel_1.add(label_12);
		panel_1.add(textField_13);
		panel_1.add(label_13);
		panel_1.add(textField_14);
		panel_1.add(label_4);
		panel_1.add(textField_6);
		panel_1.add(label_5);
		panel_1.add(textField_7);
		panel_1.add(label_7);
		panel_1.add(textField_9);
		panel_1.add(checkBox);
		panel_1.add(label_10);
		panel_1.add(comboBox);
		panel_1.add(list);
		panel_1.add(label_8);
		panel_1.add(textField_10);

		JLabel label_14 = new JLabel("\u6765\u8D27\u6279\u6B21/\u751F\u4EA7\u65E5\u671F");
		label_14.setHorizontalAlignment(SwingConstants.LEFT);
		label_14.setBounds(15, 360, 133, 18);
		contentPane.add(label_14);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(169, 357, 242, 24);
		contentPane.add(textField_15);

		JLabel label_15 = new JLabel("\u8BE5\u6279\u6B21\u662F\u5426\u5B58\u5728\u95EE\u9898");
		label_15.setBounds(488, 360, 158, 18);
		contentPane.add(label_15);

		JRadioButton radioButton_1 = new JRadioButton("\u662F");
		radioButton_1.setBounds(648, 356, 43, 27);
		contentPane.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("\u5426");
		radioButton_2.setBounds(697, 356, 53, 27);
		contentPane.add(radioButton_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 154, 1084, 193);
		contentPane.add(scrollPane);


		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5E8F\u53F7", "\u4F9B\u65B9\u540D\u79F0", "\u4F9B\u65B9\u4EE3\u7801", "\u7269\u6599\u540D\u79F0", "\u7269\u6599\u7F16\u7801", "\u6587\u4EF6\u7F16\u53F7", "\u5173\u952E\u4FE1\u606F\u7C7B\u522B", "\u6279\u6B21/\u751F\u4EA7\u65E5\u671F", "\u5173\u952E\u4FE1\u606F"
			}
		));
		table.getColumnModel().getColumn(6).setPreferredWidth(115);
		table.getColumnModel().getColumn(7).setPreferredWidth(136);
		table.getColumnModel().getColumn(8).setPreferredWidth(129);
		scrollPane.setViewportView(table);
	}
}
